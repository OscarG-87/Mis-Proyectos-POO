
package Fig_Geometricas;


public class Triangulo extends Fig_Geometricas{
    public int valor2;

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    public Triangulo(int valor1, int valor2) {
        super(valor1);
        this.valor2=valor2;
    }

    public Double perimetro(){

        Double perimetro =  2.0 *getValor1() + getValor2();
        return perimetro;
    }

    public Double area(){

        Double area = (getValor1()*getValor2())/2.0;
        return area;
    }
    public void salida(){

        System.out.println("Area de triangulo:"+area());
        System.out.println("Perimetro de triangulo:"+ perimetro());
    }
}
