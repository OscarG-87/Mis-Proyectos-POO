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
public class Proveedor {
    String nombre;
    private int nit;
    public String direccion;
    public String correo;
    protected int telefono; 
    public int getnit(){        
        return this.nit;
    }
    
public void setNit(int nit){
        this.nit =nit;
}
}
