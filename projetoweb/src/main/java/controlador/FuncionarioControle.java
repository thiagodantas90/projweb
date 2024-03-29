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
    private Funcionario funcAtual = new Funcionario();
    private String repetiSenha;

    public FuncionarioControle() {
        listarFuncionarios();
    }       
    public String cadastrarFuncionario(){
        if(funcAtual.getSenha().equals(repetiSenha)){
            IgenericFuncionario fdao = new IgenericFuncionarioImpl();
            fdao.save(funcAtual);
            limparCampos();
            return "";
        }else{
            return "erroSenha";
        }
        
    }

    public void excluir(Funcionario f){        
        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
        fdao.delete(f);
    }
    public String cancelarCadastro(){
        limparCampos();
        return "TelaOpcoes";
    }
    public void editarFuncionario(Funcionario f){
        funcAtual = f;
    }

    public List<Funcionario> listarFuncionarios(){
        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
        listaFunc = fdao.findAll();
        return listaFunc;
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
