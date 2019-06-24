/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAOimplem.IgenericFuncionarioImpl;

import DAOinterface.IgenericFuncionario;

import java.util.ArrayList;
import java.util.List;
import modelos.Funcionario;


/**
 *
 * @author Thiago Dantas
 */
public class TesteF {
    public static void main(String[] args) {        
//        Funcionario f = new Funcionario("Thiago", "12345", "thiago", true);
//        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
//        fdao.save(f);
            IgenericFuncionario fdao = new IgenericFuncionarioImpl();
            List<Funcionario> usuarios = fdao.findAll();
            for(Funcionario i: usuarios){
                System.out.println(i.getUsario());
            }      
    }
}
