/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAOimplem.IgenericClienteImpl;
import DAOinterface.IgenericCliente;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import modelos.Cliente;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
public class ClienteControle {
    private ArrayList listaClientes;
    Cliente clienteAtual;
        
  //metodos
    public void cadastrarCliente(){
        
    }
    public void atualizar(){
        
    }
    public void excluir(Cliente c){
        
    }
    public void cancelarCadastro(){
        
    }
    public void editarCliente(Cliente c){
        clienteAtual = c;        
    }
    
   
    public  ArrayList<Cliente> listarClientes(){
        return listaClientes;
    }

    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    public void setClienteAtual(Cliente clienteAtual) {
        this.clienteAtual = clienteAtual;
    }
    
}
