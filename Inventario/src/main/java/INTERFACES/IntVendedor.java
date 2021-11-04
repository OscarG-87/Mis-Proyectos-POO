/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACES;

import DTO.DtoVendedor;
import java.util.List;

/**
 *
 * @author Oscar
 */
public interface IntVendedor {
    
    public void crear (DtoVendedor vendedor) throws Exception;
    public void actualizar (DtoVendedor vendedor) throws Exception;
    public void eliminar (DtoVendedor vendedor) throws Exception;
    public  List <DtoVendedor>listarVendedores () throws Exception;
}
