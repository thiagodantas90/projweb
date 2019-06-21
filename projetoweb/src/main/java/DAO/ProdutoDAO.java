/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import banco.HibernateUtil;
import modelos.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author francelino
 */
public class ProdutoDAO {        
    
    public ProdutoDAO(){
        
    }    
    
    public void cadastrarProduto(Produto p){     
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction(); 
        sessao.save(p);
        t.commit();
        t.begin();
    }        
}
