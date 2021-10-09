
package Ahorcado;

import java.util.Scanner;


public class Menu {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         Tablero tablero =new Tablero();
         System.out.println("Palabra "+ tablero.animal);
         System.out.println("La palabra a adivinar contiene : "+tablero.palabra.length+ " letras");
         
         for(int i=0; i<tablero.palabra.length; i++){
            System.out.println("Ingrese la letra: ");
            String letra=scan.nextLine();
            tablero.comparador(letra);
            tablero.mostrarPalabra();
            
         }
         
     }
    
}
