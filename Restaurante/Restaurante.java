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
public class Restaurante {
    public static void main (String [ ] args) {
    
    Cliente objCliente = new Cliente ();
    objCliente.direccion= "Cra 4 # 5-34";
    objCliente.edad = 22;
    objCliente.name ="Jairo Rodriguez";  
    
    System.out.println(objCliente.getIdentificacion());
    System.out.println(objCliente.direccion);
    System.out.println(objCliente.edad);
    System.out.println(objCliente.name);
        
    Mesero objMesero = new Mesero (); 
    objMesero.direccion = " Av 12 # 45-87";
    objMesero.edad = 29;
    objMesero.nombre="Luis Mojica";
    objMesero.zona ="centro";
    
    System.out.println(objMesero.getIdentificacion());
    System.out.println(objMesero.direccion);
    System.out.println(objMesero.edad);
    System.out.println(objMesero.nombre);
    System.out.println(objMesero.zona);
    
    Proveedor objProveedor = new Proveedor();
    objProveedor.correo = "frescampo@gmail.com";
    objProveedor.direccion ="Cra 3 # 45-98";
    objProveedor.nombre = "Frutas y verduras frecampo";
    objProveedor.telefono = 5478963;
    
    System.out.println(objProveedor.getnit());
    System.out.println(objProveedor.correo);
    System.out.println(objProveedor.direccion);
    System.out.println(objProveedor.nombre);
    System.out.println(objProveedor.telefono);
       
    }
    
}
