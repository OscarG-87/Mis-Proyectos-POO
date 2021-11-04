/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DAO.DaoProveedor;
import DTO.DtoProveedor;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class BOProveedor {
    
    public List<DtoProveedor> listarProveedores(){
        List<DtoProveedor> listarProveedores = null;
        
        try{
            DaoProveedor daoproveedores =(DaoProveedor) new DaoProveedor();
            listarProveedores = daoproveedores.listarProveedores();
            
            
        }catch(Exception error){
            System.out.println("Error en conexión"+error);
        }
        return listarProveedores;
    }
    
    
    public void crear(DtoProveedor proveedor){
       try {
         DaoProveedor daoproveedores =(DaoProveedor) new DaoProveedor();
         daoproveedores.crear(proveedor);
        }catch(Exception error){
           System.out.println("Error al crear"+error);
        }
    }
    
    
            
    
    
    
}
