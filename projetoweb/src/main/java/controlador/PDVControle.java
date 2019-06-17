/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import modelos.Produto;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
public class PDVControle {
    private int quantidade;
    private String codBarras;
    private ArrayList<Produto> listaPDV;
    private Produto produtoAtual;
    
    
    public void adicionarProduto(){
        //enviar a consulta para o banco e retornar o item
        listaPDV.add(produtoAtual);
    }
    public void removerItem(Produto item){
        listaPDV.remove(item);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public ArrayList<Produto> getListaPDV() {
        return listaPDV;
    }

    public void setListaPDV(ArrayList<Produto> listaPDV) {
        this.listaPDV = listaPDV;
    }
    
}
