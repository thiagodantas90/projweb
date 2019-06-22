/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAOimplem.GenericDaoImpl;
import DAOimplem.IgenericProdutoImpl;
import DAOinterface.IgenericProduto;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import modelos.Produto;
/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
@RequestScoped
public class ProdutoControle{
    private Produto produtoAtual;
    private List<Produto> listaProdutos;

    public ProdutoControle() {
    }    
    public void cadastrarProduto(){
        IgenericProduto p = new IgenericProdutoImpl();
        p.save(produtoAtual);
    }
    public void atualizar(){
        
    }
    public void excluir(Produto p){
        
    }
    public void cancelarCadastro(){
        
    }
    public void editarProduto(Produto p){
        produtoAtual = p;        
    }    
    public List<Produto> listarEstoque(){   
        return listaProdutos;
    }

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
