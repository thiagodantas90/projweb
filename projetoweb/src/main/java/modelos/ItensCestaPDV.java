/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Thiago Dantas
// */
@Entity
@Table(name="itensPedido")
public class ItensCestaPDV{                   
      
    private static final long serialVersionUID = 5270206178668837693L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_itensVenda")
    private Integer id_itensVenda;    
    
    @ManyToOne
    @JoinColumn(name="id_venda")
    private Vendas venda;
    @Column(name = "quantItem")
    private int quantItem;
    @Column(name = "totalItem")
    private double totalItem;
    @Column(name = "id_produto")
    private Integer id_produto;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "preco")
    private double preco;
    @Column(name = "und")
    private String und;

    public ItensCestaPDV(int quantItem, double totalItem, Integer id_produto, String descricao, double preco, String und) {        
        this.quantItem = quantItem;
        this.totalItem = totalItem;
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.preco = preco;
        this.und = und;
    }
         
    public ItensCestaPDV() {
    }      

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }

    public Integer getId_itensVenda() {
        return id_itensVenda;
    }

    public void setId_itensVenda(Integer id_itensVenda) {
        this.id_itensVenda = id_itensVenda;
    }

    public int getQuantItem() {
        return quantItem;
    }

    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }

    public double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
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
    
}
