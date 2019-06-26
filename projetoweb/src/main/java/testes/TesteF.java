/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAOimplem.IgenericFuncionarioImpl;
import DAOimplem.IgenericProdutoImpl;

import DAOinterface.IgenericFuncionario;
import DAOinterface.IgenericProduto;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelos.Funcionario;
import modelos.Produto;


/**
 *
 * @author Thiago Dantas
 */
public class TesteF {
    public static void main(String[] args) {        
        Funcionario f = new Funcionario("thiago", "1234", "thiago", true);
        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
        fdao.save(f);
//            IgenericFuncionario fdao = new IgenericFuncionarioImpl();
//            List<Funcionario> usuarios = fdao.findAll();
//            for(Funcionario i: usuarios){
//                System.out.println(i.getUsario());
//            }
//            
//            IgenericProduto p = new IgenericProdutoImpl(); 
//            List<Produto> todosProd = p.findAll();
//            
//            todosProd.forEach((_item) -> {
//                System.out.println(_item.getDescricao());
//        });
//            TesteF f = new TesteF();
//            f.autenticar("thiago", "1234");
    }
    public String autenticar(String usr, String psw){
        System.err.println(usr);
        System.err.println(psw);
        FacesContext context = FacesContext.getCurrentInstance();
        IgenericFuncionario dao = new IgenericFuncionarioImpl();
        List<Funcionario> funcionarios = dao.findAll();

        for (Funcionario i : funcionarios) {
            System.out.println(i.getUsario());
            if (i.getUsario().equals(usr)) {
                if (i.getSenha().equals(psw)) {
                    if(i.getAdmin() == true){
                    ExternalContext ec = context.getExternalContext();
                    HttpSession s = (HttpSession) ec.getSession(true);
                    s.setAttribute("admin-logado", i);
                    return "/TelaOpcoes?faces-redirect=true";
                } else {
                    ExternalContext ec = context.getExternalContext();
                    HttpSession s = (HttpSession) ec.getSession(true);
                    s.setAttribute("usuario-logado", i);
                    return "/TelaOpcoes_1?faces-redirect=true";
                    }
                }
            }
        }

        System.out.println("Usuario não encontrado");
        FacesMessage mensagem = new FacesMessage("Usuario/senha invalidos!");
        mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
        context.addMessage(null, mensagem);
        return null;

    }
}
