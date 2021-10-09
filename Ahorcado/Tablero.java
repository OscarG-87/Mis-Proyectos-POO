
package Ahorcado;

import java.util.Random;

public class Tablero {

    String[] animales = {"Z O R R I L L O", "A V E S T R U Z", "P A J A R O"};

    Random random = new Random();

    int pos = random.nextInt(0 + animales.length);

    String animal = animales[pos];

    String[] palabra = animal.split(" ");

    int t = palabra.length;
    
    String[] adivinada = new String[t];

    public Tablero() {

        for (int i = 0; i < t; i++) {
            adivinada[i] = "";
        }
    }

    public void comparador(String letra) {
        for (int i = 0; i < t; i++) {
            if (palabra[i].equalsIgnoreCase(letra)) {
                adivinada[i] = letra;
            }
        }
    }

    public void mostrarPalabra() {
        for (int i = 0; i < adivinada.length; i++) {
            if (adivinada[i].equals("")) {
                System.out.print(" _ ");
            } else {
                System.out.print(adivinada[i]);
            }
        }
        System.out.println("");
    }
}
