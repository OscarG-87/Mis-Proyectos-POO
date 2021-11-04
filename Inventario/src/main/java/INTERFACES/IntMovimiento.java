/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INTERFACES;

import DTO.DtoMovimiento;
import java.util.List;

/**
 *
 * @author Oscar
 */
public interface IntMovimiento {
    
    public void crear (DtoMovimiento movimiento) throws Exception;
    public void actualizar (DtoMovimiento movimiento) throws Exception;
    public void eliminar (DtoMovimiento movimiento) throws Exception;
    public  List <DtoMovimiento>listarMovimientos () throws Exception;
    
}
