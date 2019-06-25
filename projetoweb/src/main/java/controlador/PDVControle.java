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
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelos.Cliente;
import modelos.ItensCestaPDV;
import modelos.Produto;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean(name = "pdv")
@ViewScoped
public class PDVControle {   
    private int quantItem;
    private double totalItem = 0, somaTotal = 0;
    private String codBarras;
    private String codB;
    private ArrayList<ItensCestaPDV> listaPDV = new ArrayList<>();//tabela com os itens adicionados
    private List<Produto> todosProd, todo;//todos os proutos do banco    
    private ItensCestaPDV item = new ItensCestaPDV();//objeto da tabela de itens, será udado para as vendas     
    private Produto produtoAtual = new Produto();

    public PDVControle() {
        inicializar();
        produtoAtual = procurarProduto(codB);
    }        
    
    public void adicionarProduto(){ 
        //listaPDV.add(item);
        
        
        System.out.println(codB);
        System.out.println(produtoAtual);
        if(produtoAtual != null){
            calcularPreco();
            item = new ItensCestaPDV(quantItem, totalItem, produtoAtual.getId_produto(), produtoAtual.getDescricao(), produtoAtual.getPreco(), produtoAtual.getUnd());
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
        totalItem = quantItem*produtoAtual.getPreco();
    }
    public void inicializar(){
        IgenericProduto p = new IgenericProdutoImpl();
        todosProd = p.findAll();
        
        System.err.println(todosProd);
    }
   
    public  ArrayList<ItensCestaPDV> listarCesta(){
        return listaPDV;
    }
    public List<Cliente> listarClientes(){
        IgenericCliente cdao = new IgenericClienteImpl();
        List<Cliente> c = cdao.findAll();        
        return c;
    }
    
    //gets e sets

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

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

    public int getQuantItem() {
        return quantItem;
    }

    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }

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

    public String getCodB() {
        return codB;
    }

    public void setCodB(String codB) {
        this.codB = codB;
    }
    
    
}
