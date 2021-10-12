package Ahorcado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ahorcado {

    String[] animales = {"Z O R R I L L O", "A V E S T R U Z", "P A J A R O"};

    Random random = new Random();

    int pos = random.nextInt(0 + animales.length);

    String animal = animales[pos];

    String[] palabra = animal.split(" ");

    int t = palabra.length;
    
    String[] adivinada = new String[t];
    ArrayList<Integer> intentos = new ArrayList<Integer>(t);
    int fallos=0;

    public Ahorcado() {

        for (int i = 0; i < t; i++) {
            adivinada[i] = "";
        }
    }

    public void comparador(String letra) {
       
        for (int i = 0; i < t; i++) {

            if (palabra[i].equalsIgnoreCase(letra)) {
                adivinada[i] = letra.toUpperCase();
            }
        }
    }
    
    public boolean ganador(){
      
      if (Arrays.equals(palabra, adivinada)) 
            return true; 
        else
            return false; 
    }

    public void mostrarPalabra() {
        for (int i = 0; i < adivinada.length; i++) {
            if (adivinada[i].equals("")) {
                System.out.print(" _ ");
                fallos++;
            } else {
                System.out.print(adivinada[i]);

            }

        }

        System.out.println("");
        intentos.add(fallos);
        System.out.println(intentos.toArray().length);
    }

}