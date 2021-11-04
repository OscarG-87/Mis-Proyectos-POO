/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACES;

import DTO.DtoMarca;
import java.util.List;

/**
 *
 * @author Oscar
 */
public interface IntMarca {
    public void crear (DtoMarca marca) throws Exception;
    public void actualizar (DtoMarca marca) throws Exception;
    public void eliminar (DtoMarca marca) throws Exception;
    public  List <DtoMarca>listarMarcas () throws Exception;
    
}
