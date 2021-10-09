package Calculadora;

public class Calculadora {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int resultado;
    private boolean primo = true;
    private int contador = 2;
    
    public Calculadora(){
        
    }
    
    public int Suma(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2; 
        resultado = n1 + n2;
        return resultado;        
    }

    public int Resta (int n1, int n2){
       this.num1 = n1;
        this.num2 = n2; 
        resultado = n1 - n2;
        return resultado;
   }
    
    public int Multiplicar (int n1,int n2){  
        num1=n1;
        num2 =n2;
        resultado = n1 * n2;
        return resultado;
    }
    public int Dividir (int n1,int n2){  
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
    
    public int Mayor(int n1, int n2, int n3, int n4) {
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

    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
    
}