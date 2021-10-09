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
public class Piratas {
    public int fuerza;
    public int vida;
    public int magia;
    public int inteligencia;
    
    public Piratas(){
    this.fuerza = 40;
    this.vida = 40;
    this.magia = 0;
    this.inteligencia = 0;
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
    
    
}
