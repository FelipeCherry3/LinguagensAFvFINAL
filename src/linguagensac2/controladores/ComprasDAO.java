/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguagensac2.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import linguagensac2.connection.MySQL;
import linguagensac2.modelos.Compras;
import linguagensac2.modelos.Fornecedores;
import linguagensac2.modelos.Funcionario;
import linguagensac2.modelos.Produtos;
/**
 *
 * @author Pc Elaine
 */
public class ComprasDAO {
    private Connection connection;
    MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
    
    public ComprasDAO() {
        mysql.conectaBanco();
        this.connection = mysql.getConn();
    }
        public void cadastrarCompras(Compras compra) throws SQLException {
        String querry = "INSERT INTO compras (id_compra, id_produto, id_funcionario, quantidade, data_compra) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(querry);
        stmt.setInt(1, compra.getId_compra());
        stmt.setInt(2,compra.getId_produto().getId_produto());
        stmt.setInt(3,compra.getId_funcionario().getId());
        stmt.setFloat(4, compra.getQuantidade());
        stmt.setDate(5, compra.getData_compra());
        
        stmt.executeUpdate();
    }
    
    public void excluirCompra(int id) throws SQLException {
        String query = "DELETE FROM compras WHERE id_compra=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);

        statement.executeUpdate();
    }
    
    public void atualizarCompra(Compras compra) throws SQLException {
        String query = "UPDATE compras SET id_produto=?, id_funcionario=?, quantidade=?, data_compra=? WHERE id_compra=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1,compra.getId_produto().getId_produto());
        stmt.setInt(2,compra.getId_funcionario().getId());
        stmt.setFloat(3, compra.getQuantidade());
        stmt.setDate(4, compra.getData_compra());
        stmt.setInt(5,compra.getId_compra());
        
        stmt.executeUpdate();
    }
    
    public Compras buscarCompraPorId(Integer id_compra) throws SQLException {
        String query = "SELECT * FROM compras WHERE id_compra =?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id_compra);
        
        ProdutosDAO produtosDAO = new ProdutosDAO();
        FuncionarioDAO funcDAO = new FuncionarioDAO();
            
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_compra");
            
            Float qtd = resultSet.getFloat("quantidade");

            java.sql.Date data_compra = resultSet.getDate("data_compra");
            int id_produto = resultSet.getInt("id_produto");
            int id_funcionario = resultSet.getInt("id_funcionario");
            
            Compras compra = new Compras();
            
            compra.setId_compra(id);
            
            Produtos produto = produtosDAO.buscarProdutoPorId(id_produto);
            
            compra.setId_produto(produto);

            Funcionario funcionario = funcDAO.buscarFuncionarioPorId(id_funcionario);
            
            compra.setId_funcionario(funcionario);
            
            compra.setQuantidade(qtd);

            compra.setData_compra(data_compra);
            
            return compra;
        }

        return null; // Retornar null se não for encontrado nenhum funcionário com o CPF especificado
    }
}
