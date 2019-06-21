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
    private Session sessao;
    
    public ProdutoDAO(){
        this.sessao = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void cadastrarProduto(Produto p){
        Transaction t = sessao.beginTransaction();
        sessao.saveOrUpdate((Produto) t);
        t.commit();
    }
    
    
}
