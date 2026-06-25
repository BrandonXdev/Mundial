
package entrenadores;

import java.time.LocalDate;
import personas.Persona;

public class Entrenador extends Persona{
    private int añosExperiencia;
    
    public int getAñosExperiencia(){
        return añosExperiencia;
    }
    
    public Entrenador(String nombre, String nacionalidad, LocalDate fechaNacimiento, int añosExperiencia){
        super(nombre, nacionalidad, fechaNacimiento);
        this.añosExperiencia = añosExperiencia;
        
    }  
}
