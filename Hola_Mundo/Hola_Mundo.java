/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hola_Mundo;

/**
 *
 * @author Oscar
 */
public class Hola_Mundo {

    public static void main (String [ ] args) {
        Class_II objClass_II = new Class_II ();
        objClass_II.description = "Esto es un texto";
        objClass_II.name = "Oscar Galvis";
        objClass_II.number = 10;
        objClass_II.setId (1);
        
        System.out.println(objClass_II.getId());
        System.out.println(objClass_II.description);
        System.out.println(objClass_II.name);
        System.out.println(objClass_II.number);
     

    }
}

