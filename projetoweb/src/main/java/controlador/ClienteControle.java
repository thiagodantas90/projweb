/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAOimplem.IgenericClienteImpl;
import DAOinterface.IgenericCliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelos.Cliente;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
@SessionScoped
public class ClienteControle {
    private List listaClientes;
    private Cliente clienteAtual = new Cliente();
    
    public ClienteControle() {               
        listarClientes();
    }
        
    public void cadastrarCliente(){
        IgenericCliente cdao = new IgenericClienteImpl(); 
        cdao.save(clienteAtual);
        limparCampos();
    }
    public void atualizar(){
        //limparCampos();
    }
    public void excluir(Cliente c){
        IgenericCliente cdao = new IgenericClienteImpl(); 
        cdao.delete(clienteAtual);
        
    }
    public String cancelarCadastro(){
        limparCampos();
        return "TelaOpcoes";
        
    }
    public void editarCliente(Cliente c){
        clienteAtual = c;        
    }
    
    public  List<Cliente> listarClientes(){
        IgenericCliente cdao = new IgenericClienteImpl();
        listaClientes = cdao.findAll();
        return listaClientes;
    }

    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    public void setClienteAtual(Cliente clienteAtual) {
        this.clienteAtual = clienteAtual;
    }

    public List getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List listaClientes) {
        this.listaClientes = listaClientes;
    }

    private void limparCampos() {
        this.clienteAtual = new Cliente();
    }
    
}
