package Juego_Roles;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        //equipo 1
        System.out.println("Crear equipo 1" + "\n" + "¿Cuántos Magos?");
        Scanner scan = new Scanner(System.in);
        int canm1 = scan.nextInt();

        Juego_Roles mago1 = new Juego_Roles();
        System.out.println("Fuerza: ");
        int fm1 = scan.nextInt();
        mago1.setFuerza(fm1);

        System.out.println("Inteligencia: ");
        int inm1 = scan.nextInt();
        mago1.setInteligencia(inm1);

        System.out.println("Magia: ");
        int mam1 = scan.nextInt();
        mago1.setMagia(mam1);

        System.out.println("Vida: ");
        int vm1 = scan.nextInt();
        mago1.setVida(vm1);
        
        System.out.println("¿Cuántos Guerreros?");       
        int cang1 = scan.nextInt();

        Juego_Roles guerrero1 = new Juego_Roles();
        System.out.println("Fuerza: ");
        int fg1 = scan.nextInt();
        guerrero1.setFuerza(fg1);

        System.out.println("Inteligencia: ");
        int ing1 = scan.nextInt();
        guerrero1.setInteligencia(ing1);

        System.out.println("Magia: ");
        int mag1 = scan.nextInt();
        guerrero1.setMagia(mag1);

        System.out.println("Vida: ");
        int vg1 = scan.nextInt();
        guerrero1.setVida(vg1);
        
        System.out.println("¿Cuántos Constructores?");       
        int canc1 = scan.nextInt();
        
        Juego_Roles constructor1 = new Juego_Roles();
        System.out.println("Fuerza: ");
        int fc1 = scan.nextInt();
        constructor1.setFuerza(fc1);

        System.out.println("Inteligencia: ");
        int inc1 = scan.nextInt();
        constructor1.setInteligencia(inc1);

        System.out.println("Magia: ");
        int mac1 = scan.nextInt();
        constructor1.setMagia(mac1);

        System.out.println("Vida: ");
        int vc1 = scan.nextInt();
        constructor1.setVida(vc1);
        
        System.out.println("¿Cuántos Piratas?");       
        int canp1 = scan.nextInt();
        
        Juego_Roles pirata1 = new Juego_Roles();
        System.out.println("Fuerza: ");
        int fp1 = scan.nextInt();
        pirata1.setFuerza(fp1);

        System.out.println("Inteligencia: ");
        int inp1 = scan.nextInt();
        pirata1.setInteligencia(inp1);

        System.out.println("Magia: ");
        int map1 = scan.nextInt();
        pirata1.setMagia(map1);

        System.out.println("Vida: ");
        int vp1 = scan.nextInt();
        pirata1.setVida(vp1);

        

        //equipo 2
        //System.out.println("Crear el equipo 2");
        
        System.out.println("Crear equipo 2" + "\n" + "¿Cuántos Magos?");        
        int canm2 = scan.nextInt();

        Juego_Roles mago2 = new Juego_Roles();
        System.out.println("Fuerza: ");
        int fm2 = scan.nextInt();
        mago2.setFuerza(fm2);

        System.out.println("Inteligencia: ");
        int inm2 = scan.nextInt();
        mago2.setInteligencia(inm2);

        System.out.println("Magia: ");
        int mam2 = scan.nextInt();
        mago2.setMagia(mam2);

        System.out.println("Vida: ");
        int vm2 = scan.nextInt();
        mago2.setVida(vm2);
        
        System.out.println("¿Cuántos Guerreros?");       
        int cang2 = scan.nextInt();

        Juego_Roles guerrero2 = new Juego_Roles();
        System.out.println("Fuerza: ");
        int fg2 = scan.nextInt();
        guerrero2.setFuerza(fg2);

        System.out.println("Inteligencia: ");
        int ing2 = scan.nextInt();
        guerrero2.setInteligencia(ing2);

        System.out.println("Magia: ");
        int mag2 = scan.nextInt();
        guerrero2.setMagia(mag2);

        System.out.println("Vida: ");
        int vg2 = scan.nextInt();
        guerrero2.setVida(vg2);
        
        System.out.println("¿Cuántos Constructores?");       
        int canc2 = scan.nextInt();
        
        Juego_Roles constructor2 = new Juego_Roles();
        System.out.println("Fuerza: ");
        int fc2 = scan.nextInt();
        constructor2.setFuerza(fc2);

        System.out.println("Inteligencia: ");
        int inc2 = scan.nextInt();
        constructor2.setInteligencia(inc2);

        System.out.println("Magia: ");
        int mac2 = scan.nextInt();
        constructor2.setMagia(mac2);

        System.out.println("Vida: ");
        int vc2 = scan.nextInt();
        constructor2.setVida(vc2);
        
        System.out.println("¿Cuántos Piratas?");       
        int canp2 = scan.nextInt();
        
        Juego_Roles pirata2 = new Juego_Roles();
        System.out.println("Fuerza: ");
        int fp2 = scan.nextInt();
        pirata2.setFuerza(fp2);

        System.out.println("Inteligencia: ");
        int inp2 = scan.nextInt();
        pirata2.setInteligencia(inp2);

        System.out.println("Magia: ");
        int map2 = scan.nextInt();
        pirata1.setMagia(map2);

        System.out.println("Vida: ");
        int vp2 = scan.nextInt();
        pirata1.setVida(vp2);
        
        
        
        System.out.println("El equipo 1 tiene: ");
        System.out.println(canm1 + "  Magos " + "\n" + "fuerza = " + fm1 + "\n"
                + "Inteligencia: " + inm1 + "\n" + "Magia: "+mam1+"\n"+"Vida: " + vm1);
        System.out.println(cang1 + "  Guerreros " + "\n" + "fuerza = " + fg1 + "\n"
                + "Inteligencia: " + ing1 + "\n" + "Magia: "+mag1+"\n"+"Vida: " + vg1);
        System.out.println(canc1 + "  Constructores " + "\n" + "fuerza = " + fc1 + "\n"
                + "Inteligencia: " + inc1 + "\n" + "Magia: "+mac1+"\n"+"Vida: " + vc1);
        System.out.println(canp1 + "  Piratas " + "\n" + "fuerza = " + fp1 + "\n"
                + "Inteligencia: " + inp1 + "\n" + "Magia: "+map1+"\n"+"Vida: " + vp1);
        
        
        System.out.println("El equipo 2 tiene: ");
        System.out.println(canm2 + "  Magos " + "\n" + "fuerza = " + fm2 + "\n"
                + "Inteligencia: " + inm2 + "\n" + "Magia: "+mam2+"\n"+"Vida: " + vm2);
        System.out.println(cang2 + "  Guerreros " + "\n" + "fuerza = " + fg2 + "\n"
                + "Inteligencia: " + ing2 + "\n" + "Magia: "+mag2+"\n"+"Vida: " + vg2);
        System.out.println(canc2 + "  Constructores " + "\n" + "fuerza = " + fc2 + "\n"
                + "Inteligencia: " + inc2 + "\n" + "Magia: "+mac2+"\n"+"Vida: " + vc2);
        System.out.println(canp2 + "  Piratas " + "\n" + "fuerza = " + fp2 + "\n"
                + "Inteligencia: " + inp2 + "\n" + "Magia: "+map2+"\n"+"Vida: " + vp2);
    }
        
        
}
