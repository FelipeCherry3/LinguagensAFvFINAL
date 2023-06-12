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
    MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
    public FornecedoresDAO() {
        mysql.conectaBanco();
        this.connection = mysql.getConn();
    }
    
    public void cadastrarFornecedor(Fornecedores fornecedor) throws SQLException {
        String querry = "INSERT INTO fornecedores (nome_fornecedor, CNPJ, descricao, data_contrato, celular, email) VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(querry);
        stmt.setString(1,fornecedor.getNome_fornecedor());
        stmt.setString(2,fornecedor.getCnpj());
        stmt.setString(3,fornecedor.getDescricao());
        stmt.setDate(4,fornecedor.getData_contrato());
        stmt.setString(5, fornecedor.getCelular());
        stmt.setString(6,fornecedor.getEmail());
        stmt.executeUpdate();
    }

    public void excluirFornecedor(String email) throws SQLException {
        String query = "DELETE FROM fornecedores WHERE email=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, email);

        statement.executeUpdate();
    }
    
    public void atualizarFornecedor(Fornecedores fornecedor,String email) throws SQLException {
        String query = "UPDATE fornecedores SET nome_fornecedor =?, CNPJ =?, descricao =?, data_contrato =?, celular =?, email=? WHERE email=?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1,fornecedor.getNome_fornecedor());
        stmt.setString(2,fornecedor.getCnpj());
        stmt.setString(3,fornecedor.getDescricao());
        stmt.setDate(4,fornecedor.getData_contrato());
        stmt.setString(5,fornecedor.getCelular());
        stmt.setString(6, fornecedor.getEmail());
        stmt.setString(7,email);
        
        stmt.executeUpdate();
    }
    
    public Fornecedores buscarFornecedorPorEmail(String emailParam) throws SQLException {
        String query = "SELECT * FROM fornecedores WHERE email = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, emailParam);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_fornecedor");
            String nome_forn = resultSet.getString("nome_fornecedor");
            String cnpj = resultSet.getString("cnpj");
            String descricao = resultSet.getString("descricao");
            java.sql.Date dataCont = resultSet.getDate("data_contrato");
            String celular = resultSet.getString("celular");
            String email = resultSet.getString("email");


            Fornecedores fornecedor = new Fornecedores();
            fornecedor.setId(id);
            fornecedor.setNome_fornecedor(nome_forn);
            fornecedor.setCnpj(cnpj);
            fornecedor.setDescricao(descricao);
            fornecedor.setData_contrato(dataCont);
            fornecedor.setCelular(celular);
            fornecedor.setEmail(email);

            return fornecedor;
        }    
        return null; // Retornar null se não for encontrado nenhum funcionário com o CPF especificado        
    }
    public Fornecedores buscarFornPorId(int idParam) throws SQLException  {
        String query = "SELECT * FROM fornecedores WHERE id_fornecedor = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idParam);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_fornecedor");
            String nome_forn = resultSet.getString("nome_fornecedor");
            String cnpj = resultSet.getString("cnpj");
            String descricao = resultSet.getString("descricao");
            java.sql.Date dataCont = resultSet.getDate("data_contrato");
            String celular = resultSet.getString("celular");
            String email = resultSet.getString("email");


            Fornecedores fornecedor = new Fornecedores();
            fornecedor.setId(id);
            fornecedor.setNome_fornecedor(nome_forn);
            fornecedor.setCnpj(cnpj);
            fornecedor.setDescricao(descricao);
            fornecedor.setData_contrato(dataCont);
            fornecedor.setCelular(celular);
            fornecedor.setEmail(email);

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
            String celular = resultSet.getString("celular");
            String email = resultSet.getString("email");
            
            Fornecedores fornecedor = new Fornecedores();
            fornecedor.setId(id);
            fornecedor.setNome_fornecedor(nome_forn);
            fornecedor.setCnpj(cnpj);
            fornecedor.setDescricao(descricao);
            fornecedor.setData_contrato(dataCont);
            fornecedor.setCelular(celular);
            fornecedor.setEmail(email);

            fornecedores.add(fornecedor);
        }

        return fornecedores;
    }
}
