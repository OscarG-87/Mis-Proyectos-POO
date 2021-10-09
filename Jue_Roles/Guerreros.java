package Jue_Roles;

public class Guerreros {

    private int fuerza;
    private int vida;
    private int magia;
    private int inteligencia;
    private int contador;

    public Guerreros() {
     this.fuerza = 50;
    this.vida = 50;
    this.magia = 0;
    this.inteligencia = 10;
    this.contador= 0;

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
