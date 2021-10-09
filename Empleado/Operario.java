
package Empleado;


public class Operario extends Empleado {
    
    private String especialidad;
    private String zona;


    public Operario() {
    }

    public Operario(int id, String nombre, int edad, String area, String especialidad, String zona) {
        super(id, nombre, edad, area);
        this.especialidad = especialidad;
        this.zona = zona;
        
    }
    

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
   

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Operario(int id, String especialidad) {
        this.id = id;
        this.especialidad = especialidad;
    }
    public void salida(){
    String nom ="-Id"+this.id+" -Nombre: "+ this.nombre+"-Edad :"+this.edad+ " -Área :"+this.area;
        System.out.println("Operario"+nom);
    }
    
    
}
