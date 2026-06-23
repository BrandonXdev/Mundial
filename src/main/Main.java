/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import jugadores.Jugador;
import java.time.LocalDate;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Jugador j = new Jugador("Messi", "Argentina", LocalDate.of(1987, 6, 24), 10, "Delantero");
        System.out.println(j.getNombre());
        System.out.println(j.getNumero());
        System.out.println(j.getPosicion());
        
    }
    
}
