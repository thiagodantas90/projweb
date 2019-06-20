/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimplemt;

import DAOinterface.IgenericVendas;
import java.io.Serializable;
import modelos.Vendas;


public class IgenericVendasImpl extends GenericDaoImpl<Vendas, Integer>implements IgenericVendas {
    public IgenericVendasImpl(){
        super(Vendas.class);
    }
}
