
package Jue_Roles;

import java.util.Scanner;


public class Jue_Roles {
    int contador1 = 10;
    int contador2 = 10;

    public static void main(String[] args) {
        System.out.println("¡BIENVENIDO AL JUEGO! vamos a crear los equipos" + "\n" + "selecciona la cantidad de integrantes para el equipo 1 de acuerdo a los siguientes roles:");
        System.out.println("Equipo 1 "+"\n"+"¿CUÁNTOS CONSTRUCTORES?");
        Scanner cc = new Scanner(System.in);
        String cantc = cc.nextLine();
        int canc = Integer.parseInt(cantc);
        System.out.println("¿Cuánta fuerza deseas asignarle(s) max 30");
        Scanner fc = new Scanner(System.in);
        String fuc = fc.nextLine();
        int fuec = Integer.parseInt(fuc);
        System.out.println("¿Cuánta vida deseas asignarle(s) max 80");
        Scanner vc = new Scanner(System.in);
        String vic = vc.nextLine();
        int vidc = Integer.parseInt(vic);
        System.out.println("¿Cuánta inteligencia deseas asignarle(s) max 30");
        Scanner ic = new Scanner(System.in);
        String inc = ic.nextLine();
        int intc = Integer.parseInt(inc);       
        Constructores constructor = new Constructores();
        constructor.setContador(canc);
        constructor.setFuerza(fuec);
        constructor.setVida(vidc);        
        constructor.setInteligencia(intc);     
        
        System.out.println("CUÁNTOS GUERREROS?");
        Scanner cg = new Scanner(System.in);
        String cag = cg.nextLine();
        int cang = Integer.parseInt(cag);
        System.out.println("¿Cuánta fuerza deseas asignarle(s) max 50");
        Scanner fg = new Scanner(System.in);
        String fug = fg.nextLine();
        int fueg = Integer.parseInt(fug);
        System.out.println("¿Cuánta vida deseas asignarle(s) max 50");
        Scanner vg = new Scanner(System.in);
        String vig = vg.nextLine();
        int vidg = Integer.parseInt(vig);
        System.out.println("¿Cuánta inteligencia deseas asignarle(s) max 10");
        Scanner ig = new Scanner(System.in);
        String ing = ig.nextLine();
        int intg = Integer.parseInt(ing);
        Guerreros guerrero = new Guerreros();
        guerrero.setFuerza(fueg);
        guerrero.setVida(vidg);
        guerrero.setInteligencia(intg);
        
        System.out.println("CUÁNTOS MAGOS?");
        Scanner cm= new Scanner(System.in);
        String cam = cm.nextLine();
        int canm = Integer.parseInt(cam);
        System.out.println("¿Cuánta fuerza deseas asignarle(s) max 20");
        Scanner fm = new Scanner(System.in);
        String fum = fm.nextLine();
        int fuem = Integer.parseInt(fum);
        System.out.println("¿Cuánta vida deseas asignarle(s) max 80");
        Scanner vm = new Scanner(System.in);
        String vim = vm.nextLine();
        int vidm = Integer.parseInt(vim);
        System.out.println("¿Cuánta magiaa deseas asignarle(s) max 100");
        Scanner mm = new Scanner(System.in);
        String mam = mm.nextLine();
        int magm = Integer.parseInt(mam);
        System.out.println("¿Cuánta inteligenciaa deseas asignarle(s) max 20");
        Scanner im = new Scanner(System.in);
        String inm = im.nextLine();
        int intm = Integer.parseInt(inm);
        
        Magos mago = new Magos();
        mago.setFuerza(fuem);
        mago.setVida(vidm);
        mago.setMagia(magm);
        mago.setInteligencia(intm);
        
        System.out.println("CUÁNTOS PIRATAS?");
        Scanner cp= new Scanner(System.in);
        String cap = cp.nextLine();
        int canp = Integer.parseInt(cap);
        System.out.println("¿Cuánta fuerza deseas asignarle(s) max 20");
        Scanner fp = new Scanner(System.in);
        String fup = fp.nextLine();
        int fuep = Integer.parseInt(fup);
        System.out.println("¿Cuánta vida deseas asignarle(s) max 80");
        Scanner vp = new Scanner(System.in);
        String vip = vp.nextLine();
        int vidp = Integer.parseInt(vip);
        
        
        
        Piratas pirata = new Piratas();
        pirata.setFuerza(fuep);
        pirata.setVida(vidp);            
    
        /*Equipo 2*/
        
        System.out.println("Equipo 2"+"\n"+" ¿CUÁNTOS CONSTRUCTORES?");
        Scanner cc2 = new Scanner(System.in);
        String cac2 = cc2.nextLine();
        int canc2 = Integer.parseInt(cac2);
        System.out.println("¿Cuánta fuerza deseas asignarle(s) max 30");
        Scanner fc2 = new Scanner(System.in);
        String fuc2 = fc2.nextLine();
        int fuec2 = Integer.parseInt(fuc2);
        System.out.println("¿Cuánta vida deseas asignarle(s) max 80");
        Scanner vc2 = new Scanner(System.in);
        String vic2 = vc2.nextLine();
        int vidc2 = Integer.parseInt(vic2);
        System.out.println("¿Cuánta inteligencia deseas asignarle(s) max 30");
        Scanner ic2 = new Scanner(System.in);
        String inc2 = ic2.nextLine();
        int intc2 = Integer.parseInt(inc2);       
        Constructores constructor2 = new Constructores();
        constructor2.setContador(canc2);
        constructor2.setFuerza(fuec2);
        constructor2.setVida(vidc2);        
        constructor2.setInteligencia(intc2);     
        
        System.out.println("CUÁNTOS GUERREROS?");
        Scanner cg2 = new Scanner(System.in);
        String cag2 = cg2.nextLine();
        int cang2 = Integer.parseInt(cag2);
        System.out.println("¿Cuánta fuerza deseas asignarle(s) max 50");
        Scanner fg2 = new Scanner(System.in);
        String fug2 = fg2.nextLine();
        int fueg2 = Integer.parseInt(fug2);
        System.out.println("¿Cuánta vida deseas asignarle(s) max 50");
        Scanner vg2 = new Scanner(System.in);
        String vig2 = vg2.nextLine();
        int vidg2 = Integer.parseInt(vig2);
        System.out.println("¿Cuánta inteligencia deseas asignarle(s) max 10");
        Scanner ig2 = new Scanner(System.in);
        String ing2 = ig2.nextLine();
        int intg2 = Integer.parseInt(ing2);
        Guerreros guerrero2 = new Guerreros();
        guerrero2.setFuerza(fueg2);
        guerrero2.setVida(vidg2);
        guerrero2.setInteligencia(intg2);
        
        System.out.println("CUÁNTOS MAGOS?");
        Scanner cm2= new Scanner(System.in);
        String cam2 = cm2.nextLine();
        int canm2 = Integer.parseInt(cam2);
        System.out.println("¿Cuánta fuerza deseas asignarle(s) max 20");
        Scanner fm2 = new Scanner(System.in);
        String fum2 = fm2.nextLine();
        int fuem2 = Integer.parseInt(fum2);
        System.out.println("¿Cuánta vida deseas asignarle(s) max 80");
        Scanner vm2 = new Scanner(System.in);
        String vim2 = vm2.nextLine();
        int vidm2 = Integer.parseInt(vim2);
        System.out.println("¿Cuánta magiaa deseas asignarle(s) max 100");
        Scanner mm2 = new Scanner(System.in);
        String mam2 = mm2.nextLine();
        int magm2 = Integer.parseInt(mam2);
        System.out.println("¿Cuánta inteligenciaa deseas asignarle(s) max 20");
        Scanner im2 = new Scanner(System.in);
        String inm2 = im2.nextLine();
        int intm2 = Integer.parseInt(inm2);
        
        Magos mago2 = new Magos();
        mago2.setFuerza(fuem2);
        mago2.setVida(vidm2);
        mago2.setMagia(magm2);
        mago2.setInteligencia(intm2);
        
        System.out.println("CUÁNTOS PIRATAS?");
        Scanner cp2= new Scanner(System.in);
        String cap2 = cp2.nextLine();
        int canp2 = Integer.parseInt(cap2);
        System.out.println("¿Cuánta fuerza deseas asignarle(s) max 20");
        Scanner fp2 = new Scanner(System.in);
        String fup2 = fp2.nextLine();
        int fuep2 = Integer.parseInt(fup2);
        System.out.println("¿Cuánta vida deseas asignarle(s) max 80");
        Scanner vp2 = new Scanner(System.in);
        String vip2 = vp2.nextLine();
        int vidp2 = Integer.parseInt(vip2);       
        
        Piratas pirata2 = new Piratas();
        pirata2.setFuerza(fuep2);
        pirata2.setVida(vidp2);            
        
        
        System.out.println("El equipo 1 tiene:");
        System.out.println(canc +" Constructores con los siguientes poderes: "
                +"\n"+"- Fuerza= "+fuec + "\n" + "- Vida= " + vidc + "\n" + "- Magia = "
                        +constructor.getMagia()+"\n"+ "- Inteligencia = "+intc);
        
        System.out.println(cang +" Guerreros con los siguientes poderes: "
                +"\n"+"- Fuerza= "+fueg + "\n" + "- Vida= " + vidg + "\n" + "- Magia = "
                        +guerrero.getMagia()+"\n"+ "- Inteligencia = "+intg);
        
        System.out.println(canm +" Magos con los siguientes poderes: "
                +"\n"+"- Fuerza= "+fuem + "\n" + "- Vida= " + vidm + "\n" + "- Magia = "
                        +magm+"\n"+ "- Inteligencia = "+intm);
        
        System.out.println(canp +" Piratas con los siguientes poderes: "
                +"\n"+"- Fuerza= "+fuep + "\n" + "- Vida= " + vidp + "\n" + "- Magia = "
                        +mago.getMagia()+"\n"+ "- Inteligencia = "+mago.getInteligencia());
        
        
        System.out.println("El equipo 2 tiene:");
        System.out.println(canc2 +" Constructores con los siguientes poderes: "
                +"\n"+"- Fuerza= "+fuec2 + "\n" + "- Vida= " + vidc2 + "\n" + "- Magia = "
                        +constructor2.getMagia()+"\n"+ "- Inteligencia = "+intc2);
        
        System.out.println(cang2 +" Guerreros con los siguientes poderes: "
                +"\n"+"- Fuerza= "+fueg2 + "\n" + "- Vida= " + vidg2 + "\n" + "- Magia = "
                        +guerrero2.getMagia()+"\n"+ "- Inteligencia = "+intg2);
        
        System.out.println(canm2 +" Magos con los siguientes poderes: "
                +"\n"+"- Fuerza= "+fuem2 + "\n" + "- Vida= " + vidm2 + "\n" + "- Magia = "
                        +magm2+"\n"+ "- Inteligencia = "+intm2);
        
        System.out.println(canp2 +" Piratass con los siguientes poderes: "
                +"\n"+"- Fuerza= "+fuep2 + "\n" + "- Vida= " + vidp2 + "\n" + "- Magia = "
                        +mago2.getMagia()+"\n"+ "- Inteligencia = "+mago2.getInteligencia());
   
    }   
        
    }

    
