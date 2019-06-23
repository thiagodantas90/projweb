/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import DAOimplem.IgenericFuncionarioImpl;
import DAOinterface.IgenericFuncionario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelos.Funcionario;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
@SessionScoped
public class FuncionarioControle {
    private List<Funcionario> listaFunc;
    private Funcionario funcAtual;
    private String repetiSenha;

    public FuncionarioControle() {
        listarFuncionarios();
    }       
    public void cadastrarFuncionario(){
        System.out.println(funcAtual.toString());
        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
        fdao.save(funcAtual);
        limparCampos();        
    }
    public void atualizar(){
        
    }
    public void excluir(Funcionario f){        
        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
        fdao.delete(f);
    }
    public void cancelarCadastro(){
        limparCampos();
    }
    public void editarFuncionario(Funcionario f){
        funcAtual = f;
    }

    public void listarFuncionarios(){
        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
        listaFunc = fdao.findAll();
    }
    private void limparCampos() {
        this.funcAtual = new Funcionario();
    }
    public List<Funcionario> getListaFunc() {
        return listaFunc;
    }

    public void setListaFunc(List<Funcionario> listaFunc) {
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
