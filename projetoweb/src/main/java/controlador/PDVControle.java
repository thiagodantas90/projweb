/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAOimplem.IgenericClienteImpl;
import DAOimplem.IgenericProdutoImpl;
import DAOinterface.IgenericCliente;
import DAOinterface.IgenericProduto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelos.Cliente;
import modelos.Funcionario;
import modelos.ItensCestaPDV;
import modelos.Produto;
import modelos.adicionarPDV;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean(name = "pdv")
@ViewScoped

public class PDVControle{   
    //private int quantItem;
     //private String codBarras;
    private double totalItem = 0, somaTotal = 0;
       
    private ArrayList<ItensCestaPDV> listaPDV = new ArrayList<>();//tabela com os itens adicionados
    private List<Produto> todosProd, todo;//todos os proutos do banco    
    private List<Cliente> cTodos;
    private ItensCestaPDV item = new ItensCestaPDV();//objeto da tabela de itens, será udado para as vendas     
    private Produto produtoAtual = new Produto();
    private adicionarPDV adPr = new adicionarPDV();

    public PDVControle() {
        inicializar();        
    }        
    
    public void adicionarProduto(){ 
        //listaPDV.add(item);            
        System.out.println(adPr.getCodBarras());
        System.out.println(adPr.getQuantProduto());       
        produtoAtual = procurarProduto(adPr.getCodBarras());
        System.out.println(produtoAtual);
        if(produtoAtual != null){
            calcularPreco();
            item = new ItensCestaPDV(adPr.getQuantProduto(), totalItem, produtoAtual.getId_produto(), produtoAtual.getDescricao(), somaTotal, produtoAtual.getUnd());
            //Vendas venda, int quantItem, double totalItem, Integer id_produto, String descricao, double preco, String und
            //int contItem, double totalItem, Integer id_produto, String descricao, double preco, String und
            listaPDV.add(item);
            somaTotal = somaTotal + totalItem;
            totalItem = 0;
            //return "adicionado";
        }else{
                     
        }        
    }
    public void removerItem(ItensCestaPDV item){
        somaTotal = somaTotal - item.getTotalItem();
        listaPDV.remove(item);        
    }
    
    public void finalizarCompra(){
    
    }    
    public Produto procurarProduto(String cod){
        for(Produto p: todosProd){
            if(p.getCodBarras().equals(cod)){
                return p;               
            }else{
                return null;
            }
        }
        return null;
    }
    private void calcularPreco(){
        totalItem = adPr.getQuantProduto()*produtoAtual.getPreco();
    }
    public void inicializar(){
        IgenericProduto p = new IgenericProdutoImpl();
        todosProd = p.findAll();
        IgenericCliente cdao = new IgenericClienteImpl();
        cTodos = cdao.findAll();               
    }
    public List<Cliente> listarClientes(){
        return cTodos;
    }
   
    public  ArrayList<ItensCestaPDV> listarCesta(){
        return listaPDV;
    }
    public void fecharVenda(){
        
    }
    public adicionarPDV getAdPr() {
        return adPr;
    }
    public void setAdPr(adicionarPDV adPr) {
        this.adPr = adPr;
    }
    //gets e sets
//    public String getCodBarras() {
//        return codBarras;
//    }
//
//    public void setCodBarras(String codBarras) {
//        this.codBarras = codBarras;
//    }
  

    public List<Produto> getTodo() {
        return todo;
    }

    public void setTodo(List<Produto> todo) {
        this.todo = todo;
    }
 

    public ArrayList<ItensCestaPDV> getListaPDV() {
        return listaPDV;
    }

    public void setListaPDV(ArrayList<ItensCestaPDV> listaPDV) {
        this.listaPDV = listaPDV;
        
    }

    public ItensCestaPDV getItem() {
        return item;
    }

    public void setItem(ItensCestaPDV item) {
        this.item = item;
    }

    public Produto getProdutoAtual() {
        return produtoAtual;
    }

    public void setProdutoAtual(Produto produtoAtual) {
        this.produtoAtual = produtoAtual;
    }

    public List<Produto> getTodosProd() {
        return todosProd;
    }

    public void setTodosProd(List<Produto> todosProd) {
        this.todosProd = todosProd;
    }

//    public int getQuantItem() {
//        return quantItem;
//    }
//
//    public void setQuantItem(int quantItem) {
//        this.quantItem = quantItem;
//    }

    public double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
    }

    public double getSomaTotal() {
        return somaTotal;
    }

    public void setSomaTotal(double somaTotal) {
        this.somaTotal = somaTotal;
    }       

    public List<Cliente> getcTodos() {
        return cTodos;
    }

    public void setcTodos(List<Cliente> cTodos) {
        this.cTodos = cTodos;
    }


    
}
