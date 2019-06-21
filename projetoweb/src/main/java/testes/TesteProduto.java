/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import banco.HibernateUtil;
import modelos.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Aluno
 */
public class TesteProduto {
    
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        
        Produto p = new Produto(1,"Arroz", 3.5, "KG", 10, "123456789");
        
        sessao.save(p);
        t.commit();
        t.begin();
        
    }
}
