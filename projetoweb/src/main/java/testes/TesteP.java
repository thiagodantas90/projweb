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
import javax.faces.bean.ManagedBean;
import modelos.Produto;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
public class TesteP {
    public static void main(String[] args) {        
        IgenericProduto pdao = new IgenericProdutoImpl();             
        //System.out.println(pdao.findById(1).getDescricao()); 
        ArrayList<Produto> no = new ArrayList<>();
        no.addAll(pdao.findAll());
        System.out.println(no.get(1).getDescricao());
    }
}
