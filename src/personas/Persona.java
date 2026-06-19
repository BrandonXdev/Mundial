
package personas;

import java.time.LocalDate;
import java.time.Period;



public abstract class Persona {     //Clase se crea abstrcta porque sirve como base para otras clases.
    protected String nombre;
    protected String nacionalidad;
    protected LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
   public int getEdad(){
       return Period.between(fechaNacimiento, LocalDate.now()).getYears();  
   } 

    public Persona(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Nacionalidad: " + nacionalidad + " Edad: " + getEdad();
    } 
}
