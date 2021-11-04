/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACES;

import DTO.DtoCliente;
import java.util.List;

/**
 *
 * @author Oscar
 */
public interface IntCliente {
    
    public void crear (DtoCliente cliente) throws Exception;
    public void actualizar (DtoCliente cliente) throws Exception;
    public void eliminar (DtoCliente cliente) throws Exception;
    public  List <DtoCliente>listarClientes () throws Exception;
    
    
}
