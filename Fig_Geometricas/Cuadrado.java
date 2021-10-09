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
public class Cuadrado extends Fig_Geometricas {
        public Cuadrado(int valor1) {
        super(valor1);
    }
    public Double perimetro(){

        Double perimetro = getValor1()*4.0;
        return perimetro;
    }

    public Double area(){

        Double area = getValor1()*2.0;;
        return area;
    }
    public void salida(){

        System.out.println("Area de cuadrado:"+area());
        System.out.println("Perimetro de cuadrado:"+ perimetro());
    }
}
