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
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;
import modelos.Funcionario;
import modelos.Login;
/**
 *
 * @author Thiago Dantas
 */
@ManagedBean (name = "login")
@ViewScoped
public class LoginControle {
    private Login login = new Login();
    
    public LoginControle(){
        
    }
        
    public String autenticar(){
        System.err.println(login.getUsuario());
        System.err.println(login.getSenha());
        FacesContext context = FacesContext.getCurrentInstance();
        IgenericFuncionario dao = new IgenericFuncionarioImpl();
        List<Funcionario> funcionarios = dao.findAll();

        for (Funcionario i : funcionarios) {
            System.out.println(i.getUsario());
            if (i.getUsario().equals(login.getUsuario())) {
                if (i.getSenha().equals(login.getSenha())) {
                    if(i.getAdmin() == true){
                        ExternalContext ec = context.getExternalContext();
                        HttpSession s = (HttpSession) ec.getSession(true);
                        s.setAttribute("admin-logado", i);
                    return "/TelaOpcoes?faces-redirect=true";
                    }else if(i.getAdmin() == false){
                        ExternalContext ec = context.getExternalContext();
                        HttpSession s = (HttpSession) ec.getSession(true);
                        s.setAttribute("usuario-logado", i);
                    return "/TelaOpcoes?faces-redirect=true";
                    }                
                }else{
                    
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
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
}
