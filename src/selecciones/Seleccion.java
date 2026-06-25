
package selecciones;
import jugadores.Jugador;
import entrenadores.Entrenador;



public class Seleccion{
    private String nombre;
    private Grupos grupo;
    private Entrenador entrenador;
    private Jugador[] jugadores;

    public String getNombre() {
        return nombre;
    }

    public Grupos getGrupo() {
        return grupo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Seleccion(String nombre, Grupos grupo, Entrenador entrenador, Jugador[] jugadores) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenador = entrenador;
        this.jugadores = jugadores;
    }
    
    public void agregarJugador(Jugador jugador){
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = jugador;
                break;
            }
        }
    }
    
    public void eliminarJugador(Jugador jugador){
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getNombre().equals(jugador.getNombre())){
                    jugadores[i] = null;
                    break;    
                }       
            }  
        } 
    }
    
    public Jugador buscarJugadorPorNombre(String nombre){
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getNombre().equals(nombre)) {
                    return jugadores[i];    
                }
            }
        }
        return null; //Indicamos que no se encontro el jugador.  
    }
    
    public Jugador buscarJugadorPorCamiseta(int numero){
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getNumero() == numero) {
                    return jugadores[i];       
                }
            }
        }
        return null;     
    }
    
    public int contarJugadores(){
        int contador = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                contador++;
             
            }
        }
        return contador;
    }
    
    public boolean jugadorExiste(int numero){
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getNumero() == numero) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
        
        
    
    
    
    
    

