/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Thiago Dantas
 */
@Entity
@Table(name = "produto")
public class Produto implements Serializable{
    
    private static final long serialVersionUID = 5270206178668837693L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id_produto;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preco")
    private double preco;
    @Column(name = "und")
    private String und;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "codbarras")
    private String codBarras;

    public Produto(String descricao, double preco, String und, int quantidade, String codBarras) {
        this.descricao = descricao;
        this.preco = preco;
        this.und = und;
        this.quantidade = quantidade;
        this.codBarras = codBarras;
    }

    public Produto(Integer id_produto, String descricao, double preco, String und, int quantidade, String codBarras) {
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.preco = preco;
        this.und = und;
        this.quantidade = quantidade;
        this.codBarras = codBarras;
    }

    public Produto(Integer id_produto, String descricao, double preco, String und) {
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.preco = preco;
        this.und = und;
    }        

    public Produto() {
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
}
