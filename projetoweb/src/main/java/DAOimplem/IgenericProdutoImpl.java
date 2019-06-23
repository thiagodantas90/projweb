/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimplem;

import DAOinterface.IgenericProduto;
import java.io.Serializable;
import modelos.Produto;



public class IgenericProdutoImpl extends GenericDaoImpl<Produto, Integer>implements IgenericProduto {
    public IgenericProdutoImpl(){
        super(Produto.class);
    }
}
