/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAOimplem.IgenericFuncionarioImpl;
import DAOinterface.IgenericFuncionario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelos.Funcionario;
import modelos.Login;
/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
@SessionScoped
public class LoginControle {
    private Login l;
    
    public LoginControle(){      
    }
        
    public String autenticar(){
        FacesContext context = FacesContext.getCurrentInstance();
        IgenericFuncionario dao = new IgenericFuncionarioImpl();
        List<Funcionario> usuarios = dao.findAll();

        for (Funcionario i : usuarios) {
            System.out.println(i.getUsario());
            if (i.getUsario().equals(l.getUsuario())) {
                if (i.getSenha().equals(l.getUsuario())) {
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
    
    public String redirecionar(){
        return "CadastroProduto";
    }
    public Login getL() {
        return l;
    }

    public void setL(Login l) {
        this.l = l;
    }
    
}
