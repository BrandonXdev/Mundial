/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;

import java.time.LocalDate;
import personas.Persona;

/**
 *
 * @author joanreciojimenez
 */
public class Jugador extends Persona{
 private  int numero;
 private String posicion;
 
 public int getNumero (){
     return numero;
 }
 public String getPosicion(){
     return posicion;
 }
 public void setNumero (int numero){
     this.numero = numero;
 }
 public void setposicion(String posicion){
     this.posicion = posicion;
 }
 
 public Jugador(String nombre,String nacionalidad, LocalDate fechaNacimiento,int numero, String posicion){
     super (nombre,nacionalidad,fechaNacimiento);
     this.numero = numero;
     this.posicion = posicion;
 }
 
 @Override
public String toString() {
    return super.toString() + ", Numero: " + numero + ", Posicion: " + posicion;
}

 
 
}
