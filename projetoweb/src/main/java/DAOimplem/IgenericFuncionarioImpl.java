/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimplem;

import DAOinterface.IgenericFuncionario;
import java.io.Serializable;
import modelos.Funcionario;


public class IgenericFuncionarioImpl extends GenericDaoImpl<Funcionario, Integer>implements IgenericFuncionario {
    public IgenericFuncionarioImpl(){
        super(Funcionario.class);
    }
}
