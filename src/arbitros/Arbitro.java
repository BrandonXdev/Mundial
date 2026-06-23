/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitros;

import java.time.LocalDate;
import personas.Persona;

/**
 *
 * @author joanreciojimenez
 */
public class Arbitro extends Persona{
 
    public String categoria;
    
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria (String categoria){
        this.categoria = categoria;
    }

    public Arbitro(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(nombre, nacionalidad, fechaNacimiento);
    }
    
    
    
    
}
