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
import linguagensac2.connection.MySQL;
import linguagensac2.modelos.Fornecedores;
import linguagensac2.modelos.Produtos;
/**
 *
 * @author Pc Elaine
 */
public class ProdutosDAO {
    private Connection connection;
    
    public ProdutosDAO(MySQL mysql) {
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
        String query = "DELETE FROM produto WHERE nome_produto=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, nome);

        statement.executeUpdate();
    }
    
    public void atualizarProduto(Produtos produto) throws SQLException {
        String query = "UPDATE produtos SET nome_produto =?, quantidade_estoque =?, descricao =?, data_validade =?, preco =?  WHERE id_produto=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1,produto.getNome_produto());
        stmt.setFloat(2,produto.getQuantidade_estoque());
        stmt.setString(3,produto.getDescricao());
        stmt.setDate(4,produto.getData_validade());
        stmt.setDouble(5, produto.getPreco());
        stmt.setInt(5,produto.getId_produto());
        
        stmt.executeUpdate();
    }
    
    
    public Produtos buscarProdutoPorNome(String nome) throws SQLException {
        String query = "SELECT * FROM produtos WHERE nome_produto = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, nome);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_produto");
            String nome_prod = resultSet.getString("nome_produto");
            Float qtd = resultSet.getFloat("quantidade_produto");
            String descricao = resultSet.getString("descricao");
            java.sql.Date dataVal = resultSet.getDate("data_validade");
            Double preco = resultSet.getDouble("preco");


            Produtos produto = new Produtos();
            produto.setId_produto(id);
            produto.setNome_produto(nome_prod);
            produto.setQuantidade_estoque(qtd);
            produto.setDescricao(descricao);
            produto.setData_validade(dataVal);
            produto.setPreco(preco);
            

            return produto;
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
