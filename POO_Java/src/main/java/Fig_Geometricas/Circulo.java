/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fig_Geometricas;

/**
 *
 * @author Oscar
 */
public class Circulo extends Fig_Geometricas{

    public Circulo(int valor1) {
        super(valor1);
    }
    public Double perimetro(){

        Double perimetro = 2*Math.PI*getValor1();
        return perimetro;
    }

    public Double area(){

        Double area = Math.PI*(getValor1()*getValor1());
        return area;
    }
    public void salida(){

        System.out.println("Area de circulo:"+area());
        System.out.println("Perimetro de circulo:"+ perimetro());
    }

}
