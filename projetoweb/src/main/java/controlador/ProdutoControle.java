/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.ProdutoDAO;
import banco.HibernateUtil;
import modelos.Produto;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
public class ProdutoControle{
    private ProdutoDAO p;
    private Produto produtoAtual;
    private ArrayList<Produto> listaProdutos;
    
    public ProdutoControle() {   
        
    }    
    public void cadastrarProduto(){
        p.cadastrarProduto(produtoAtual);
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
    
    public ArrayList<Produto> listarEstoque(){
        return listaProdutos;
    }
    //metodos

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Produto getProdutoAtual() {
        return produtoAtual;
    }

    public void setProdutoAtual(Produto produtoAtual) {
        this.produtoAtual = produtoAtual;
    }
}
