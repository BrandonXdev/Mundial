
package selecciones;


public class Seleccion {
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
        
        
    }
    
    
    
    
}
