
package Empleado;


public class Tecnico extends Operario {
    
    public Tecnico(int id, String nombre, int edad, String area, String especialidad, String zona) {
        super(id, nombre, edad, area, especialidad, zona);
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
        System.out.println("Técnico"+nom);
    }
  
}
