package DAOimplemt;

import DAOinterface.IgenericCliente;
import java.io.Serializable;
import modelos.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class IgenericClienteImpl extends GenericDaoImpl<Cliente, Integer> implements IgenericCliente {
    public IgenericClienteImpl(){
        super(Cliente.class);
    }
    
}
