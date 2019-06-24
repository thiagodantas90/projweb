/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Thiago Dantas
 */
public class ItensCestaPDV extends Produto{
    private int quantItem;
    private double totalItem;     

    public ItensCestaPDV(int quantItem, double totalItem, Integer id_produto, String descricao, double preco, String und) {
        super(id_produto, descricao, preco, und);
        this.quantItem = quantItem;
        this.totalItem = totalItem;
    }       

    public ItensCestaPDV() {
    }

    public double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
    }

    public int getContItem() {
        return quantItem;
    }

    public void setContItem(int contItem) {
        this.quantItem = contItem;
    }         
    
}