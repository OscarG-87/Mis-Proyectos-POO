/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACES;

import DTO.DtoProveedor;
import java.util.List;

/**
 *
 * @author Oscar
 */
public interface IntProveedor {
    
    public void crear (DtoProveedor proveedor) throws Exception;
    public void actualizar (DtoProveedor proveedor) throws Exception;
    public void eliminar (DtoProveedor proveedor) throws Exception;
    public  List <DtoProveedor>listarProveedores () throws Exception;
    
}
