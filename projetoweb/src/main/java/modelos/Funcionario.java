/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
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
@Table(name = "funcionario")
public class Funcionario implements Serializable{

    private static final long serialVersionUID = 5270206178668837693L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private int id_funcionario;
    @Column(name = "nome_funcionario")
    private String nome_funcionario;
    @Column(name = "senha")
    private String senha;
    @Column(name = "usuario")
    private String usario;
    @Column(name = "admin")
    private boolean admin;

    public Funcionario(String nome_funcionario, String senha, String usario, boolean admin) {
        this.nome_funcionario = nome_funcionario;
        this.senha = senha;
        this.usario = usario;
        this.admin = admin;
    }     

    public Funcionario(int id_funcionario, String nome_funcionario, String senha, String usario, boolean admin) {
        this.id_funcionario = id_funcionario;
        this.nome_funcionario = nome_funcionario;
        this.senha = senha;
        this.usario = usario;
        this.admin = admin;
    }
    
    public Funcionario() {
        
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsario() {
        return usario;
    }

    public void setUsario(String usario) {
        this.usario = usario;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }            
    
}
