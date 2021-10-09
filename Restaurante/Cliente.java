/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author Oscar
 */
public class Cliente {
    String name;
    private int identificacion;
    public String direccion;
    protected int edad;  
    public int getIdentificacion(){        
        return this.identificacion;
    }
    
public void setIdentificacion(int identificacion){
        this.identificacion =identificacion;
    }
    
}
