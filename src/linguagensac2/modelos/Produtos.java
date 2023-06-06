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
public class Produtos {

    private int id_produto;
    private Fornecedores id_fornecedor;
    private String nome_produto;
    private float quantidade_estoque;
    private String descricao;
    private Date data_validade;
    private Double preco;
    
    
    public Fornecedores getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Fornecedores id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }
    
    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public float getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(float quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_validade() {
        return data_validade;
    }

    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String toString(){
        return this.nome_produto;
    }
    
}
