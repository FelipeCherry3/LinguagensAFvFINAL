/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguagensac2;

import java.sql.SQLException;
import java.text.ParseException;
import linguagensac2.modelos.Fornecedores;
import linguagensac2.controladores.FornecedoresDAO;
import linguagensac2.connection.MySQL;
import resources.DateUtils;
/**
 *
 * @author Pc Elaine
 */
public class TestesCRUD {
    public static void main(String[] args) throws ParseException, SQLException {
        MySQL mysql = new MySQL("localhost:3306", "controltech2", "root", "Bico1346@");
        mysql.conectaBanco();
        FornecedoresDAO fornDAO = new FornecedoresDAO();
        
        Fornecedores for1 = new Fornecedores();
        DateUtils date = new DateUtils();
        
        for1.setNome_fornecedor("Microsoft");
        for1.setCnpj("332255-68");
        for1.setDescricao("Empresa Responsavel Pelas Licenças");
        for1.setData_contrato(date.stringToDate("2023/10/20"));
        fornDAO.cadastrarFornecedor(for1);
        mysql.fechaBanco();
    }
}
