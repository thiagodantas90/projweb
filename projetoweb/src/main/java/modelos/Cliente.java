/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author Thiago Dantas
 */
@Entity
@Table(name = "cliente")

public class Cliente implements Serializable{
     
    
    private static final long serialVersionUID = 5270206178668837693L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private int id_cliente;
    @Column(name = "nome_cliente")
    private String nome_cliente;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "telefone")
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome_cliente, String cpf, String telefone) {
        this.nome_cliente = nome_cliente;
        this.cpf = cpf;
        this.telefone = telefone;
    }            

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
