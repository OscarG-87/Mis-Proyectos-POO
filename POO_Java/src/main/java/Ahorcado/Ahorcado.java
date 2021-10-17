package Ahorcado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ahorcado {

    String[] animales = {"Z O R R I L L O", "A V E S T R U Z", "P A J A R O", "T I G R I L L O", "C A L A M A R", "B A L L E N A", "O R N I T O R R I N C O"};

    Random random = new Random();

    int pos = random.nextInt(0 + animales.length);

    String animal = animales[pos];

    String[] palabra = animal.split(" ");

    int t = palabra.length;
    
    String[] adivinada = new String[t];
    

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

    

}