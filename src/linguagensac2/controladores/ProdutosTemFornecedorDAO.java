/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguagensac2.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import linguagensac2.connection.MySQL;
import linguagensac2.modelos.ProdutosTemFornecedor;
/**
 *
 * @author Pc Elaine
 */
public class ProdutosTemFornecedorDAO {
    private Connection connection;
    
    public ProdutosTemFornecedorDAO(MySQL mysql) {
        this.connection = mysql.getConn();
    }
    
    public void inserir(ProdutosTemFornecedor produtoFornecedor) throws SQLException {
        String querry = "INSERT INTO produtos_tem_fornecedores (id_produto, id_fornecedor) VALUES (?,?)";
        PreparedStatement stmt = connection.prepareStatement(querry);
        stmt.setInt(1,produtoFornecedor.getId_produto());
        stmt.setInt(2, produtoFornecedor.getId_fornecedor());
        stmt.executeUpdate();
    }
        
    public void excluir(int id) throws SQLException {
        String query = "DELETE FROM produtos_tem_fornecedores WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);

        statement.executeUpdate();
    }
}
