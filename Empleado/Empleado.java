
package Empleado;


public class Empleado {
    protected int id;
    protected String nombre;
    protected int edad;
    protected String area;

    public Empleado() {
    }
    

    public Empleado(int id, String nombre, int edad, String area) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.area = area;
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
        System.out.println("Empleado"+nom);
    }
}
