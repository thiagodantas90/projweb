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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Generated;
/**
 *
 * @author Thiago Dantas
 */
@Entity
@Table(name = "vendas")
public class Vendas implements Serializable{        
    
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name="id_funcionario")
    private Funcionario funcionario;
    
    @OneToMany(mappedBy = "Vendas")
    
    private static final long serialVersionUID = 5270206178668837693L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private int id_venda;
    @Column(name = "valor_venda")
    private double valor_venda;  
    @Column(name = "data_venda")
    private Date data_venda;

    public Vendas(Cliente cliente, Funcionario funcionario, double valor_venda, Date data_venda) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valor_venda = valor_venda;
        this.data_venda = data_venda;
    }             

    public Vendas() {
    }
    
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

    public Date getDataVenda() {
        return data_venda;
    }

    public void setDataVenda(Date dataVenda) {
        this.data_venda = dataVenda;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
