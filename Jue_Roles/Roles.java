/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jue_Roles;

/**
 *
 * @author Oscar
 */
public class Roles {
    private int fuerza;
    private int vida;
    private int magia;
    private int inteligencia;
    private int contador;

    public Roles(int fuerza, int vida, int magia, int inteligencia, int contador) {
        this.fuerza = fuerza;
        this.vida = vida;
        this.magia = magia;
        this.inteligencia = inteligencia;
        this.contador = contador;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
}
