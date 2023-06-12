/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguagensac2.modelos;

import java.sql.Date;
/**
 *
 * @author Pc Elaine
 */
public class Compras {

    private int id_compra;
    private Produtos id_produto;
    private Fornecedores id_fornecedor;
    private Funcionario id_funcionario;
    private float quantidade;
    private Date data_compra;
    
    
    
    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public Produtos getId_produto() {
        return id_produto;
    }

    public void setId_produto(Produtos id_produto) {
        this.id_produto = id_produto;
    }

    public Fornecedores getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Fornecedores id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public Funcionario getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Funcionario id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    
    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }
}
