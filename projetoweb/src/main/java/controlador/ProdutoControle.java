/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.ProdutoDAO;
import DAOimplem.IgenericProdutoImpl;
import DAOinterface.IgenericProduto;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelos.Produto;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean (name = "produtoControle")
//@SessionScoped
public class ProdutoControle{
    private Produto produtoAtual = new Produto();
    private List<Produto> listaProdutos;
   
    public ProdutoControle() {
        listarEstoque();
    }
    public void cadastrarProduto(){
        IgenericProduto p = new IgenericProdutoImpl(); 
        p.save(produtoAtual);
        limparCampo();        
    }
    public void atualizar(){//corrigir
//       IgenericProduto u = new IgenericProdutoImpl(); 
//        u.update(produtoAtual);
    }
    public void excluir(Produto p){
        IgenericProduto q = new IgenericProdutoImpl(); 
        q.delete(p);
        removeBean("produtoControle");
    }
    public void cancelarCadastro(){
       limparCampo();
       removeBean("produtoControle");
    }
    public void editarProduto(Produto p){
        produtoAtual = p;        
    }    
    public List<Produto> listarEstoque(){          
        IgenericProduto p = new IgenericProdutoImpl(); 
        listaProdutos= p.findAll();
        return listaProdutos;
    }

    //metodos
    private void limparCampo() {
         this.produtoAtual = new Produto();
    }
    private void removeBean(String bean){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(bean);
    }
    
    //gets e sets
    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Produto getProdutoAtual() {
        return produtoAtual;
    }

    public void setProdutoAtual(Produto produtoAtual) {
        this.produtoAtual = produtoAtual;
    }  
    
}
