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
/**
 *
 * @author Pc Elaine
 */
public class FornecedoresDAO {
    private Connection connection;
    
    public FornecedoresDAO(MySQL mysql) {
        this.connection = mysql.getConn();
    }
    
    public void cadastrarFornecedor(Fornecedores fornecedor) throws SQLException {
        String querry = "INSERT INTO fornecedores (nome_fornecedor, CNPJ, descricao, data_contrato) VALUES (?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(querry);
        stmt.setString(1,fornecedor.getNome_fornecedor());
        stmt.setString(2,fornecedor.getCnpj());
        stmt.setString(3,fornecedor.getDescricao());
        stmt.setDate(4,fornecedor.getData_contrato());
        stmt.executeUpdate();
    }
        
    public void excluirFornecedor(String cnpj) throws SQLException {
        String query = "DELETE FROM fornecedores WHERE CNPJ=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, cnpj);

        statement.executeUpdate();
    }
    
    public void atualizarFornecedor(Fornecedores fornecedor) throws SQLException {
        String query = "UPDATE fornecedores SET nome_fornecedor =?, CNPJ =?, descricao =?, data_contrato =? WHERE id_fornecedor=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1,fornecedor.getNome_fornecedor());
        stmt.setString(2,fornecedor.getCnpj());
        stmt.setString(3,fornecedor.getDescricao());
        stmt.setDate(4,fornecedor.getData_contrato());
        stmt.setInt(5,fornecedor.getId());
        
        stmt.executeUpdate();
    }
    
    public Fornecedores buscarFornecedorPorId(Integer id_forn) throws SQLException {
        String query = "SELECT * FROM fornecedores WHERE id_fornecedor = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id_forn);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_fornecedor");
            String nome_forn = resultSet.getString("nome_fornecedor");
            String cnpj = resultSet.getString("cnpj");
            String descricao = resultSet.getString("descricao");
            java.sql.Date dataCont = resultSet.getDate("data_contrato");


            Fornecedores fornecedor = new Fornecedores();
            fornecedor.setId(id);
            fornecedor.setNome_fornecedor(nome_forn);
            fornecedor.setCnpj(cnpj);
            fornecedor.setDescricao(descricao);
            fornecedor.setData_contrato(dataCont);
            

            return fornecedor;
        }

        return null; // Retornar null se não for encontrado nenhum funcionário com o CPF especificado
    }
    
    
    public List<Fornecedores> buscarTodosFornecedores() throws SQLException {
        List<Fornecedores> fornecedores = new ArrayList<>();

        String query = "SELECT * FROM fornecedores";
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id_fornecedor");
            String nome_forn = resultSet.getString("nome_fornecedor");
            String cnpj = resultSet.getString("cnpj");
            String descricao = resultSet.getString("descricao");
            java.sql.Date dataCont = resultSet.getDate("data_contrato");

            Fornecedores fornecedor = new Fornecedores();
            fornecedor.setId(id);
            fornecedor.setNome_fornecedor(nome_forn);
            fornecedor.setCnpj(cnpj);
            fornecedor.setDescricao(descricao);
            fornecedor.setData_contrato(dataCont);

            fornecedores.add(fornecedor);
        }

    return fornecedores;
}
}
