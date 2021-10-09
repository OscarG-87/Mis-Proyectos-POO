/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Oscar
 */
public class Reporte {
    public static void main(String[] args) {
        Empleado empl = new Empleado(0001,"Oscar Galvis",35,"Ingeniería");
        empl.salida();
        Operario ope = new Operario(0002,"Jairo Gonzalez",25,"Empaque","Plasticos","Parque");
        ope.salida();
        Directivo dire = new Directivo(0003,"Roberto Alarcon",40,"Dirección");
        dire.salida();
        Oficial ofi = new Oficial(0004,"Carlos Gutierrez",35,"Mantenimiento","Pintura","Parqueadero");
        ofi.salida();
        Tecnico tec = new Tecnico(0005,"Fabian Gutierrez",44,"Soporte","PC","Tecnología");
        tec.salida();
        
    }
    
}
