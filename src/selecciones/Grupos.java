
package selecciones;


public enum Grupos {
    A("Grupo A"),       //Se le asigna valores a las constantes 
    B("Grupo B"),
    C("Grupo C"),
    D("Grupo D"),
    E("Grupo E"),
    F("Grupo F"),
    G("Grupo G"),
    H("Grupo H"),
    I("Grupo I"),
    J("Grupo J"),
    K("Grupo K"),
    L("Grupo L");
    
    private String valor;           

     public String getDescripcion() {
        return valor;
    }

    private Grupos(String valor) {
        this.valor = valor;
    }   
}
