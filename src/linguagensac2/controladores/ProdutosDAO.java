/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguagensac2.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import linguagensac2.connection.MySQL;
import linguagensac2.modelos.Fornecedores;
import linguagensac2.modelos.Produtos;
/**
 *
 * @author Pc Elaine
 */
public class ProdutosDAO {
    private Connection connection;
    MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
    
    public ProdutosDAO() {
        mysql.conectaBanco();
        this.connection = mysql.getConn();
    }
    
    public void cadastrarProduto(Produtos produto) throws SQLException {
        String querry = "INSERT INTO produtos (nome_produto, quantidade_estoque, descricao, data_validade, preco, id_fornecedor) VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(querry);
        stmt.setString(1,produto.getNome_produto());
        stmt.setFloat(2,produto.getQuantidade_estoque());
        stmt.setString(3,produto.getDescricao());
        stmt.setDate(4,produto.getData_validade());
        stmt.setDouble(5,produto.getPreco());
        stmt.setInt(6, produto.getId_fornecedor().getId());
        stmt.executeUpdate();
    }
    
    public void excluirProduto(String nome) throws SQLException {
        String query = "DELETE FROM produtos WHERE nome_produto=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, nome);

        statement.executeUpdate();
    }
    
    public void atualizarProduto(Produtos produto) throws SQLException {
        String query = "UPDATE produtos SET nome_produto =?, quantidade_estoque =?, descricao =?, data_validade =?, preco =?, id_fornecedor=?  WHERE nome_produto=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1,produto.getNome_produto());
        stmt.setFloat(2,produto.getQuantidade_estoque());
        stmt.setString(3,produto.getDescricao());
        stmt.setDate(4,produto.getData_validade());
        stmt.setDouble(5, produto.getPreco());
        stmt.setInt(6, produto.getId_fornecedor().getId());
        stmt.setString(7,produto.getNome_produto());
        
        stmt.executeUpdate();
    }
    public List<Produtos> buscarTodosProdutos() throws SQLException{
        
        List<Produtos> produtos = new ArrayList<>();
        FornecedoresDAO fornDAO = new FornecedoresDAO();
        ResultSet rs = null;
        String query = "SELECT * from Produtos";
        PreparedStatement statement = connection.prepareStatement(query);
        rs = statement.executeQuery();
        while (rs.next()){
            Produtos p =new Produtos();
            
            p.setId_produto(rs.getInt("id_produto"));
            p.setNome_produto(rs.getString("nome_produto"));
            p.setQuantidade_estoque(rs.getFloat("quantidade_estoque"));
            p.setDescricao(rs.getString("descricao"));
            p.setData_validade(rs.getDate("data_validade"));
            p.setPreco(rs.getDouble("preco"));
            int id_fornecedor = rs.getInt("id_fornecedor");
            p.setId_fornecedor(fornDAO.buscarFornPorId(id_fornecedor));
            produtos.add(p);
        }
        
        return produtos;
    }
    public List<Produtos> buscarProdPorNome(String nome) throws SQLException{
        
        List<Produtos> produtos = new ArrayList<>();
        FornecedoresDAO fornDAO = new FornecedoresDAO();
        ResultSet rs = null;
        String query = "SELECT * from Produtos WHERE nome_produto LIKE ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, "%" + nome + "%");
        rs = statement.executeQuery();
        
        while (rs.next()){
            Produtos p =new Produtos();
            
            p.setId_produto(rs.getInt("id_produto"));
            p.setNome_produto(rs.getString("nome_produto"));
            p.setQuantidade_estoque(rs.getFloat("quantidade_estoque"));
            p.setDescricao(rs.getString("descricao"));
            p.setData_validade(rs.getDate("data_validade"));
            p.setPreco(rs.getDouble("preco"));
            int id_fornecedor = rs.getInt("id_fornecedor");
            p.setId_fornecedor(fornDAO.buscarFornPorId(id_fornecedor));
            produtos.add(p);
        }
        
        return produtos;
    }
    
    public Produtos buscarProdutoPorId(int id_param) throws SQLException {
        String query = "SELECT * FROM produtos WHERE id_produto = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id_param);
        Fornecedores fornecedor = new Fornecedores();
        FornecedoresDAO fornDAO = new FornecedoresDAO();
        
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_produto");
            String nome_prod = resultSet.getString("nome_produto");
            Float qtd = resultSet.getFloat("quantidade_estoque");
            String descricao = resultSet.getString("descricao");
            java.sql.Date dataVal = resultSet.getDate("data_validade");
            Double preco = resultSet.getDouble("preco");
            int id_fornecedor = resultSet.getInt("id_fornecedor");
            fornecedor = fornDAO.buscarFornPorId(id_fornecedor);

            Produtos produto = new Produtos();
            produto.setId_produto(id);
            produto.setNome_produto(nome_prod);
            produto.setQuantidade_estoque(qtd);
            produto.setDescricao(descricao);
            produto.setData_validade(dataVal);
            produto.setPreco(preco);
            produto.setId_fornecedor(fornecedor);
            

            return produto;
        }

        return null; // Retornar null se não for encontrado nenhum funcionário com o CPF especificado
    }
        
    public Produtos buscarProdutoPorNome(String nome) throws SQLException {
        MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
        mysql.conectaBanco();
        String query = "SELECT * FROM produtos WHERE nome_produto = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, nome);
        FornecedoresDAO fDAO = new FornecedoresDAO();
        
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_produto");
            String nome_prod = resultSet.getString("nome_produto");
            Float qtd = resultSet.getFloat("quantidade_estoque");
            String descricao = resultSet.getString("descricao");
            java.sql.Date dataVal = resultSet.getDate("data_validade");
            Double preco = resultSet.getDouble("preco");
            int id_forn = resultSet.getInt("id_fornecedor");
            Fornecedores f = fDAO.buscarFornPorId(id_forn);
            Produtos produto = new Produtos();
            produto.setId_produto(id);
            produto.setNome_produto(nome_prod);
            produto.setQuantidade_estoque(qtd);
            produto.setDescricao(descricao);
            produto.setData_validade(dataVal);
            produto.setPreco(preco);
            produto.setId_fornecedor(f);
            
            mysql.fechaBanco();
            return produto;
            
        } else {
            JOptionPane.showMessageDialog(null,"Erro oa buscar produto!");
        }
        

        return null; // Retornar null se não for encontrado nenhum funcionário com o CPF especificado
    }
    
    public List<Produtos> getProdutosPorFornecedor(Fornecedores forn){
        List<Produtos> produtos = new ArrayList<>();
        
        String query = "SELECT * FROM produtos where id_fornecedor =?";
        
        
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, forn.getId());
            
            ResultSet resultSet = stmt.executeQuery();
            
            while (resultSet.next()) {
            int id = resultSet.getInt("produtos.id_produto");
            String nome_prod = resultSet.getString("produtos.nome_produto");
            Float qtd = resultSet.getFloat("produtos.quantidade_estoque");
            String descricao = resultSet.getString("produtos.descricao");
            java.sql.Date dataVal = resultSet.getDate("produtos.data_validade");
            Double preco = resultSet.getDouble("produtos.preco");
            int id_fornecedor = resultSet.getInt("produtos.id_fornecedor");
            
            Produtos produto = new Produtos();
            produto.setId_produto(id);
            produto.setNome_produto(nome_prod);
            produto.setQuantidade_estoque(qtd);
            produto.setDescricao(descricao);
            produto.setData_validade(dataVal);
            produto.setPreco(preco);
            produto.setId_fornecedor(forn);
            
            produtos.add(produto);
            
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

}
