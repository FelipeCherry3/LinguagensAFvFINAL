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
import linguagensac2.modelos.Funcionario;

/**
 *
 * @author Pc Elaine
 * 
 */

public class FuncionarioDAO {
    private Connection connection;
    MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
    
    public FuncionarioDAO() {
        mysql.conectaBanco();
        this.connection = mysql.getConn();
    }
    
    public void cadastrarFuncionario(Funcionario funcionario) throws SQLException {
        String querry = "INSERT INTO funcionarios (nome, email, cpf, sexo, data_nasc,endereco,cidade,estado,celular,data_ingresso,salario) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(querry);
        stmt.setString(1,funcionario.getNome());
        stmt.setString(2,funcionario.getEmail());
        stmt.setString(3,funcionario.getCpf());
        stmt.setString(4,funcionario.getSexo());
        stmt.setDate(5,funcionario.getData_nasc());
        stmt.setString(6,funcionario.getEndereco());
        stmt.setString(7,funcionario.getCidade());
        stmt.setString(8,funcionario.getEstado());
        stmt.setString(9,funcionario.getCelular());
        stmt.setDate(10,funcionario.getData_ingresso());
        stmt.setDouble(11,funcionario.getSalario());

        stmt.executeUpdate();
    }
    
    public void excluirFuncionario(String email) throws SQLException {
        String query = "DELETE FROM funcionarios WHERE email=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, email);

        statement.executeUpdate();
    }
    public Funcionario buscarFuncionarioPorId(int id) throws SQLException {
        String query = "SELECT * FROM funcionarios WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String nome = resultSet.getString("nome");
            String email = resultSet.getString("email");
            String cpf = resultSet.getString("cpf");
            String sexo = resultSet.getString("sexo");
            java.sql.Date dataNascSql = resultSet.getDate("data_nasc");
            java.sql.Date dataIngressoSql = resultSet.getDate("data_ingresso");
            String endereco = resultSet.getString("endereco");
            String cidade = resultSet.getString("cidade");
            String estado = resultSet.getString("estado");
            String celular = resultSet.getString("celular");
            double salario = resultSet.getDouble("salario");

            Funcionario funcionario = new Funcionario();
            funcionario.setId(id);
            funcionario.setNome(nome);
            funcionario.setEmail(email);
            funcionario.setCpf(cpf);
            funcionario.setSexo(sexo);
            funcionario.setData_nasc(dataNascSql);
            funcionario.setEndereco(endereco);
            funcionario.setCidade(cidade);
            funcionario.setEstado(estado);
            funcionario.setCelular(celular);
            funcionario.setData_ingresso(dataIngressoSql);
            funcionario.setSalario(salario);

            return funcionario;
        }

        return null; // Retornar null se não for encontrado nenhum funcionário com o ID especificado
    }
    public Funcionario buscarFuncionarioPorEmail(String FEmail) throws SQLException {
        String query = "SELECT * FROM funcionarios WHERE email = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, FEmail);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String email = resultSet.getString("email");
            String cpf = resultSet.getString("cpf");
            String sexo = resultSet.getString("sexo");
            java.sql.Date dataNascSql = resultSet.getDate("data_nasc");
            java.sql.Date dataIngressoSql = resultSet.getDate("data_ingresso");
            String endereco = resultSet.getString("endereco");
            String cidade = resultSet.getString("cidade");
            String estado = resultSet.getString("estado");
            String celular = resultSet.getString("celular");
            double salario = resultSet.getDouble("salario");

            Funcionario funcionario = new Funcionario();
            funcionario.setId(id);
            funcionario.setNome(nome);
            funcionario.setEmail(email);
            funcionario.setCpf(cpf);
            funcionario.setSexo(sexo);
            funcionario.setData_nasc(dataNascSql);
            funcionario.setEndereco(endereco);
            funcionario.setCidade(cidade);
            funcionario.setEstado(estado);
            funcionario.setCelular(celular);
            funcionario.setData_ingresso(dataIngressoSql);
            funcionario.setSalario(salario);

            return funcionario;
        }

        return null; // Retornar null se não for encontrado nenhum funcionário com o CPF especificado
    }
    
    public void atualizarFuncionario(Funcionario funcionario) throws SQLException {
    String query = "UPDATE funcionarios SET nome=?, email=?, cpf=?, sexo=?, data_nasc=?, endereco=?, cidade=?, estado=?, celular=?, data_ingresso=?, salario=? WHERE email=?";
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, funcionario.getNome());
    statement.setString(2, funcionario.getEmail());
    statement.setString(3, funcionario.getCpf());
    statement.setString(4, funcionario.getSexo());
    statement.setDate(5, funcionario.getData_nasc());
    statement.setString(6, funcionario.getEndereco());
    statement.setString(7, funcionario.getCidade());
    statement.setString(8, funcionario.getEstado());
    statement.setString(9, funcionario.getCelular());
    statement.setDate(10, funcionario.getData_ingresso());
    statement.setDouble(11, funcionario.getSalario());
    statement.setString(12, funcionario.getEmail());
 
    statement.executeUpdate();
    }
    public List<Funcionario> buscarTodosFuncionarios() throws SQLException {
        List<Funcionario> funcionarios = new ArrayList<>();

        String query = "SELECT * FROM funcionarios ORDER BY nome";
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome_func = resultSet.getString("nome");
            String email = resultSet.getString("email");
            String cpf = resultSet.getString("cpf");
            String sexo = resultSet.getString("sexo");
            java.sql.Date dataNasc = resultSet.getDate("data_nasc");
            String endereco = resultSet.getString("endereco");
            String cidade = resultSet.getString("cidade");
            String estado = resultSet.getString("estado");
            String celular = resultSet.getString("celular");
            java.sql.Date dataIngresso = resultSet.getDate("data_ingresso");
            double salario = resultSet.getDouble("salario");
            
            Funcionario funcionario = new Funcionario();
            funcionario.setId(id);
            funcionario.setNome(nome_func);
            funcionario.setCpf(cpf);
            funcionario.setSexo(sexo);
            funcionario.setData_nasc(dataNasc);
            funcionario.setCelular(celular);
            funcionario.setEmail(email);
            funcionario.setEndereco(endereco);
            funcionario.setCidade(cidade);
            funcionario.setEstado(estado);
            funcionario.setData_ingresso(dataIngresso);
            funcionario.setSalario(salario);

            funcionarios.add(funcionario);
        }

        return funcionarios;
    }
}
