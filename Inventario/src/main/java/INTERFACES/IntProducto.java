/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACES;

import DTO.DtoProducto;
import java.util.List;

/**
 *
 * @author Oscar
 */
public interface IntProducto {
    
    public void crear (DtoProducto producto) throws Exception;
    public void actualizar (DtoProducto producto) throws Exception;
    public void eliminar (DtoProducto producto) throws Exception;
    public  List <DtoProducto>listarProductos () throws Exception;
    
}
