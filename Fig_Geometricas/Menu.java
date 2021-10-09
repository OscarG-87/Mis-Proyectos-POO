
package Fig_Geometricas;

import java.util.Scanner;


public class Menu {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Seleccione la opción correspondiente a la figura: " 
                 + "\n" + "1 cuadrado" 
                 + "\n" + "2 Rectangulo" 
                 + "\n" + "3 Circulo" 
                 + "\n" + "4 Triangulo");
         
         int opcion=scan.nextInt();
         
         switch(opcion){
             case 1:
                 System.out.println("Ingrese la medida de un lado del cuadrado: ");
                 int lado= scan.nextInt();
                 Cuadrado cuadrado = new Cuadrado(lado);
                 cuadrado.salida();                
                 break;
             case 2:
                 System.out.println("Ingrese la medida de uno de los lados grandes del rectangulo: ");
                 int lado1= scan.nextInt();
                 System.out.println("Ingrese la medida de uno de los lados pequeños del rectangulo: ");
                 int lado2= scan.nextInt();
                 Rectangulo rectangulo = new Rectangulo(lado1, lado2);
                 rectangulo.salida();
                 
                 break;
             case 3:
                 System.out.println("Ingrese el radio del circulo: ");
                 int radio= scan.nextInt();
                 Circulo circulo = new Circulo(radio);
                 circulo.salida();
               
             case 4:                 
                 System.out.println("Ingrese la medida para la base del triangulo: ");
                 int base= scan.nextInt();
                 System.out.println("Ingrese la medida para la altura del circulo: ");
                 int altura= scan.nextInt();
                 Triangulo triangulo = new Triangulo(base, altura);
                 triangulo.salida();
                 break;
             default:
                 System.out.println("Opcion no valida");
                 break;
         }
                 
       
     
    }    
}
