
package Calculadora;

import java.util.Scanner;


public class Menu {
    public static void main(String[] args){
        System.out.println("Seleccione la opción correspondiente: " + "\n" + "1 Sumar" + "\n" + "2 Restar" + "\n" + "3 Multiplicar"
                + "\n" + "4 Dividir" + "\n" + "5 Validar número primo" + "\n" + "6 Validar el mayor de 4 números");
        Scanner scan = new Scanner(System.in);        
        int opcion = scan.nextInt();
        if (opcion <= 6){
            if (opcion == 1) {
                System.out.println("¡Vamos a sumar dos enteros! ");
                System.out.println("Digite el primer número: ");                
                int num1 = scan.nextInt();
                System.out.println("Digite el segundo número: ");
                int num2 = scan.nextInt();                
                Calculadora suma = new Calculadora(); {                
                    System.out.println("EL resultado es " + suma.Suma(num1, num2));
                }
            }if (opcion == 2) {
                System.out.println("¡Vamos a restar dos enteros! ");
                System.out.println("Digite el primer número: ");
                int n1 = scan.nextInt(); 
                System.out.println("Digite el segundo número: ");
                int n2 = scan.nextInt();

                Calculadora resta = new Calculadora();
                {                    
                    System.out.println("El resultado es " + resta.Resta(n1, n2));

                }
            }else if (opcion == 3) {
                System.out.println("¡Vamos a multiplicar dos enteros! ");
                System.out.println("Digite el primer número: ");
                int n1 = scan.nextInt();
                System.out.println("Digite el segundo número: ");
                int n2 = scan.nextInt();

                Calculadora multiplicar = new Calculadora();
                {
                    
                    System.out.println("El resultado es " + multiplicar.Multiplicar(n1, n2));

                }
            }else if (opcion == 4) {
                System.out.println("¡Vamos a dividir dos enteros! ");
                System.out.println("Digite el primer número: ");
                int num1 = scan.nextInt();
                System.out.println("Digite el segundo número: ");
                int num2 = scan.nextInt();
                Calculadora dividir = new Calculadora();
                {
                    
                    System.out.println("El resultado es " + dividir.Dividir(num1, num2));

                }
            } else if (opcion == 5) {
                System.out.println("¡Vamos a validar si el número es primo! ");
                System.out.println("Digite un núero entero: ");
                int num = scan.nextInt();
                Calculadora primo = new Calculadora();
                {
                    primo.EsPrimo(num);
                    {
                        if (primo.EsPrimo(num) == true) {
                            System.out.println("El número " + num + " es primo");
                        } else {
                            System.out.println("El número " + num + " no es primo");

                        }
                    }

                }
            }if (opcion == 6) {
                System.out.println("¡Vamos a validar el numero mayor de 4 enteros! ");
                System.out.println("Digite el primer número entero: ");
                int num1 = scan.nextInt();
                System.out.println("Digite el segundo número entero: ");
                int num2 = scan.nextInt();
                System.out.println("Digite el tercer número entero: ");
                int num3 = scan.nextInt();
                System.out.println("Digite el cuarto número entero: ");
                int num4 = scan.nextInt();
                Calculadora mayor = new Calculadora();
                {
                    mayor.Mayor(num1, num2, num3, num4);

                }
            }
        }else{
            System.out.println("¡Opción incorrecta!"); 
            }
    }
           
}   
    

