/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAOimplem.IgenericProdutoImpl;
import DAOinterface.IgenericProduto;
import java.util.ArrayList;
import java.util.List;
import modelos.Produto;

/**
 *
 * @author Thiago Dantas
 */
public class TesteP_1 {
    public static void main(String[] args) {        
        Produto p = new Produto("Feijão", 3, "kg", 12, "7894561389412");
        IgenericProduto pdao = new IgenericProdutoImpl(); 
        pdao.save(p);
        //System.out.println(pdao.findById(1).getDescricao()); 
        ArrayList<Produto> no = new ArrayList<>();
        no.addAll(pdao.findAll());
        System.out.println(no.get(1).getDescricao());
    }
}
