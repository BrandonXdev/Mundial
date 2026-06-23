/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;

/**
 *
 * @author joanreciojimenez
 */
public class Resultados {
    private int golesLocal = 0;
    private int golesVisitante = 0;
    
    public int getGolesLocal (){
        return golesLocal;
        
    }   
    public int getGolesVisitante(){
        return golesVisitante;
    }
    
    public void setGolesLocal(int golesLocal){
        this.golesLocal = golesLocal;
    }
    public void setGolesVisitantes(int golesVisitante){
        this.golesVisitante = golesVisitante;
    }
    public Resultados(){
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }
    public boolean partidoEmpate() {
        return golesLocal == golesVisitante;
    }
    public int diferenciadeGoles(){
        if(golesLocal > golesVisitante){
            return  golesLocal - golesVisitante;
        }else{
          return  golesVisitante - golesLocal;
        }
    }
    public int totalGolesAnotados(){
        return golesLocal + golesVisitante;
    }
    public boolean ambosAnotanGoles(){
        return golesLocal > 0 && golesVisitante > 0;
    }
    public String equipoGanador (){
        if(partidoEmpate()){
            return "El partido quedo empatado";
        }else if (golesLocal > golesVisitante){
            return "El equipo local gano";
        }else{
           return "El equipo visitante perdio";
        }
    }
    
        

    @Override
    public String toString() {
        return "Resultado :" + " golesLocal = " + golesLocal + " golesVisitante = " + golesVisitante;
    }
    

   
    
}
