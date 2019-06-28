/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import DAOimplem.IgenericFuncionarioImpl;
import DAOinterface.IgenericFuncionario;
import java.util.List;

/**
 *
 * @author Thiago Dantas
 */
public class Login {
    private String usuario;
    private String senha;
    private List<Funcionario> f;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Login() {
        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
        f = fdao.findAll();
        if(f.size()==0){
            Funcionario f = new Funcionario("Admin", "123456", "admin", true);       
            fdao.save(f);
        }
        
    }    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
