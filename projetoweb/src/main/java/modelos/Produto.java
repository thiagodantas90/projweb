/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Thiago Dantas
 */
public class Produto {
    
    private int id_produto;
    private String descricao;
    private double preco;
    private String und;
    private int quantidade;
    private String codBarras;

    public Produto(String descricao, double preco, String und, int quantidade, String codBarras) {
        this.descricao = descricao;
        this.preco = preco;
        this.und = und;
        this.quantidade = quantidade;
        this.codBarras = codBarras;
    }

    public Produto() {
    }
    
    

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        this.und = und;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }
    
    
    
}
