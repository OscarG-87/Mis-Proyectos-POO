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
public class DtoMovimiento {
    private int id_movimiento;
    private String tipo_movimiento;
    private int num_factura;
    private Date fecha_movimiento;
    private int total_movimiento;

    public DtoMovimiento(int id_movimiento, String tipo_movimiento, int num_factura, Date fecha_movimiento, int total_movimiento) {
        this.id_movimiento = id_movimiento;
        this.tipo_movimiento = tipo_movimiento;
        this.num_factura = num_factura;
        this.fecha_movimiento = fecha_movimiento;
        this.total_movimiento = total_movimiento;
    }

    public DtoMovimiento() {
    }

    public int getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public String getTipo_movimiento() {
        return tipo_movimiento;
    }

    public void setTipo_movimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    public int getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(int num_factura) {
        this.num_factura = num_factura;
    }

    public Date getFecha_movimiento() {
        return fecha_movimiento;
    }

    public void setFecha_movimiento(Date fecha_movimiento) {
        this.fecha_movimiento = fecha_movimiento;
    }

    public int getTotal_movimiento() {
        return total_movimiento;
    }

    public void setTotal_movimiento(int total_movimiento) {
        this.total_movimiento = total_movimiento;
    }
    
    
    
}
