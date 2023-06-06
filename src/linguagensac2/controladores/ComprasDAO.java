/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguagensac2.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import linguagensac2.connection.MySQL;
import linguagensac2.modelos.Compras;
/**
 *
 * @author Pc Elaine
 */
public class ComprasDAO {
    private Connection connection;
    
    public ComprasDAO(MySQL mysql) {
        this.connection = mysql.getConn();
    }
        public void cadastrarCompras(Compras compra) throws SQLException {
        String querry = "INSERT INTO compras (id_produto, id_fornecedor, id_funcionario, quantidade, valor_unitario, data_compra) VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(querry);
        stmt.setInt(1,compra.getId_produto().getId_produto());
        stmt.setInt(2, compra.getId_fornecedor().getId());
        stmt.setInt(3,compra.getId_funcionario().getId());
        stmt.setFloat(4, compra.getQuantidade());
        stmt.setDouble(5, compra.getValor_unitario());
        stmt.setDate(6, compra.getData_compra());
        
        stmt.executeUpdate();
    }
    
    public void excluirCompra(int id) throws SQLException {
        String query = "DELETE FROM compras WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);

        statement.executeUpdate();
    }
    
    public void atualizarCompra(Compras compra) throws SQLException {
        String query = "UPDATE compras SET id_produto=?, id_fornecedor=?, id_funcionario=?, quantidade=?, valor_unitario=?, data_compra=?  WHERE id_compra=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1,compra.getId_produto().getId_produto());
        stmt.setInt(2, compra.getId_fornecedor().getId());
        stmt.setInt(3,compra.getId_funcionario().getId());
        stmt.setFloat(4, compra.getQuantidade());
        stmt.setDouble(5, compra.getValor_unitario());
        stmt.setDate(6, compra.getData_compra());
        stmt.setInt(7,compra.getId_compra());
        
        stmt.executeUpdate();
    }
    
    public Compras buscarCompraPorId(Integer id_compra) throws SQLException {
        String query = "SELECT * FROM compras WHERE id_compra =?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id_compra);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_compra");
            int id_produto = resultSet.getInt("id_produto");
            String nome_prod = resultSet.getString("nome_produto");
            Float qtd = resultSet.getFloat("quantidade_produto");
            String descricao = resultSet.getString("descricao");
            java.sql.Date dataVal = resultSet.getDate("data_validade");
            Double preco = resultSet.getDouble("preco");


            Compras compra = new Compras();
            compra.setId_compra(id);
            

            return compra;
        }

        return null; // Retornar null se não for encontrado nenhum funcionário com o CPF especificado
    }
}
