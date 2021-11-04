/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.util.Date;

/**
 *
 * @author Oscar
 */
public class DtoVendedor {
    
    private int codigo;
    private String nombre_vendedor;
    private Date fecha_vinculacion;

    public DtoVendedor(int codigo, String nombre_vendedor, Date fecha_vinculacion) {
        this.codigo = codigo;
        this.nombre_vendedor = nombre_vendedor;
        this.fecha_vinculacion = fecha_vinculacion;
    }

    public DtoVendedor() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public Date getFecha_vinculacion() {
        return fecha_vinculacion;
    }

    public void setFecha_vinculacion(Date fecha_vinculacion) {
        this.fecha_vinculacion = fecha_vinculacion;
    }
    
    
    
}
