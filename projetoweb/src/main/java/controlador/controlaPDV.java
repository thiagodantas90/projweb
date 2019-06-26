/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Thiago Dantas
 */
@ManagedBean
public class controlaPDV {
    private String cod;
    
    
    public String retornar(){
        return cod;
    }
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
        
    
}
