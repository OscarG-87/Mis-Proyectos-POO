
package Calculadora;

public class Calculadora {
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double resultado;
    private boolean primo = true;
    private int contador = 2;
    
    public Calculadora(){
        
    }
    
    
    
    public double Suma(double n1, double n2){
        this.num1 = n1;
        this.num2 = n2; 
        resultado = n1 + n2;
        return resultado;        
    }

    public double Resta (double n1, double n2){
       this.num1 = n1;
        this.num2 = n2; 
        resultado = n1 - n2;
        return resultado;
   }
    
    public double Multiplicar (double n1,double n2){  
        num1=n1;
        num2 =n2;
        resultado = n1 * n2;
        return resultado;
    }
    public double Dividir (double n1,double n2){  
        num1=n1;
        num2 =n2;
        resultado = n1 / n2;
        return resultado;
    }
    public boolean EsPrimo(int numero) {
        while ((primo) && (contador != numero)) {

            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
            if (numero % 2 == 0) {
                primo= false;
            }
            return primo;
        }
    return primo;
    }
    
    public double Mayor(double n1, double n2, double n3, double n4) {
        num1 = n1;
        num1 = n2;
        num1 = n3;
        num1 = n4;

        if (n1 > n2 && n1 > n3 && n1 > n4) {
            resultado = n1;
            System.out.println("El número mayor es "+resultado);
        } else if (n1 < n2 && n2 > n3 && n2 > n4) {
            resultado = n2;
            System.out.println("El número mayor es "+resultado);
        } else if (n1 < n3 && n2 < n3 && n3 > n4) {
            resultado = n3;
            System.out.println("El número mayor es "+resultado);
        } else if (n1 < n4 && n2 < n4 && n3 < n4) {
            resultado = n4;
            System.out.println("El número mayor es "+resultado);
        }
    
    return resultado;
    }

    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    
    
}