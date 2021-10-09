
package Empleado;


public class Directivo extends Empleado{

    public Directivo() {
    }

    public Directivo(int id, String nombre, int edad, String area) {
        super(id, nombre, edad, area);
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void salida(){
    String nom ="-Id"+this.id+" -Nombre: "+ this.nombre+"-Edad :"+this.edad+ " -Área :"+this.area;
        System.out.println("Directivo"+nom);
    }
    
    
    
}
