/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import modelos.Funcionario;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
public class FuncionarioControle {
    private ArrayList<Funcionario> listaFunc;
    private Funcionario funcAtual;
    private String repetiSenha;
    
    public void cadastrarFuncionario(){
        
    }
    public void atualizar(){
        
    }
    public void cancelarCadastro(){
        
    }
    public void editarFuncionario(Funcionario f){
        funcAtual = f;
    }
    public void validarSenha(){
        
    }
    public ArrayList<Funcionario> getListaFunc() {
        return listaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> listaFunc) {
        this.listaFunc = listaFunc;
    }

    public Funcionario getFuncAtual() {
        return funcAtual;
    }

    public void setFuncAtual(Funcionario funcAtual) {
        this.funcAtual = funcAtual;
    }

    public String getRepetiSenha() {
        return repetiSenha;
    }

    public void setRepetiSenha(String repetiSenha) {
        this.repetiSenha = repetiSenha;
    }
    
    
}
