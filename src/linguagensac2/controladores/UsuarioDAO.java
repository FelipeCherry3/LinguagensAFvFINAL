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
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import linguagensac2.modelos.Funcionario;
import linguagensac2.modelos.Usuario;

/**
 *
 * @author Pc Elaine
 */

public class UsuarioDAO {
    private Connection connection;
    
    public UsuarioDAO(MySQL mysql) {
        this.connection = mysql.getConn();
    }
    
    public void cadastraUsuario(Usuario usuario) throws SQLException {
        String querry = "INSERT INTO usuarios (id, nome, email, cpf, sexo, celular, senha) VALUES (default,?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(querry);
        stmt.setString(1,usuario.getNome());
        stmt.setString(2,usuario.getEmail());
        stmt.setString(3,usuario.getCpf());
        stmt.setString(4,usuario.getSexo());
        stmt.setString(5,usuario.getCelular());
        stmt.setString(6,usuario.getSenha());
        
        stmt.executeUpdate();
    }
    
    
    public void excluiUsuario(int id) throws SQLException {
        String querry = "DELETE FROM  usuarios  WHERE id =? ";
        PreparedStatement statement = connection.prepareStatement(querry);
        statement.setInt(1,id);
    }
    
    public boolean autenticarUsuario(String email, String senha) throws SQLException {
        String query = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, email);
        statement.setString(2, senha);

        ResultSet resultSet = statement.executeQuery();
        return resultSet.next(); // Retorna true se encontrou um usuário com o e-mail e senha fornecidos
        
        // Criar essa variavel na view --> boolean autenticado = usuarioDAO.autenticarUsuario(email, senha);
        // if(autenticado) > set visibleTrue();
        // else > Usuario não encontrado Favor se Cadastrar;
    }
}
