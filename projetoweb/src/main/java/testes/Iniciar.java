/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAOimplem.IgenericFuncionarioImpl;
import DAOinterface.IgenericFuncionario;
import modelos.Funcionario;

/**
 *
 * @author Thiago
 */
public class Iniciar {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Admin", "123456", "admin", true);
        IgenericFuncionario fdao = new IgenericFuncionarioImpl();
        fdao.save(f);
    }
}
