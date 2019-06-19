/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelos.Produto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
public class ProdutoControle{
    private Produto produtoAtual;
    private ArrayList<Produto> listaProdutos;
    
    public ProdutoControle() {
        
    }
    
    public void cadastrarProduto(){
        
    }
    public void atualizar(){
        
    }
    public void excluir(Produto p){
        
    }
    public void cancelarCadastro(){
        
    }
    public void disabilitarProduto(){
        
    }
    public void editarProduto(Produto p){
        produtoAtual = p;
        
    }
    
    public ArrayList<Produto> listarEstoque(){
        return listaProdutos;
    }
    //metodos
    public Produto getProduto() {
        return produtoAtual;
    }

    public void setProduto(Produto produto) {
        this.produtoAtual = produto;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    
}
