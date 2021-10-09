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
public class Rectangulo extends Fig_Geometricas{
     public int valor2;

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    public Rectangulo(int valor1, int valor2) {
        super(valor1);
        this.valor2=valor2;
    }

    public Double perimetro(){

        Double perimetro =  2.0 *(getValor1() + getValor2());
        return perimetro;
    }

    public Double area(){

        Double area = (getValor1()*getValor2())*1.0;
        return area;
    }
    public void salida(){

        System.out.println("Area de rectangulo:"+area());
        System.out.println("Perimetro de rectangulo:"+ perimetro());
    }
}
