/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Generated;

/**
 *
 * @author Thiago Dantas
 */
@Entity
@Table(name = "vendas")
public class Vendas implements Serializable{
    
    private static final long serialVersionUID = 5270206178668837693L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private int id_venda;
    @Column(name = "valor_venda")
    private double valor_venda;
    @Column(name = "nome_cliente")
    private String nome_cliente;
    @Column(name = "data_venda")
    private Date data_venda;
 

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public double getValorVenda() {
        return valor_venda;
    }

    public void setValorVenda(double valorVenda) {
        this.valor_venda = valorVenda;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public Date getDataVenda() {
        return data_venda;
    }

    public void setDataVenda(Date dataVenda) {
        this.data_venda = dataVenda;
    }
    
    
}
