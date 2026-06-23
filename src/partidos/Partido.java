        /*
         * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
         * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
         */
        package partidos;

        import java.time.LocalDate;
        import java.time.LocalTime;
        import selecciones.Seleccion;
        import arbitros.Arbitro;
        import resultados.Resultados;
        /**
         *
         * @author joanreciojimenez
         */
        public class Partido {

            private Seleccion seleccionLocal;
            private Seleccion seleccionVisitante;
            private String estadio;
            private LocalDate fecha;
            private LocalTime hora;
            private Arbitro[] arbitro;
            private Resultados resultado;
            
            
            
            
           
            
            public Arbitro buscarArbitro(String nombre) {
                for(int i=0;i<arbitro.length;i++){
                    if (arbitro[i].getNombre()== nombre){
                        return arbitro[i];
                    }
                }
                return null;
            }
            
            
    
            
            
    
            public Seleccion getSeleccionLocal() {
                return seleccionLocal;
            }

            public Seleccion getSeleccionVisitante() {
                return seleccionVisitante;
            }

            public String getEstadio() {
                return estadio;
            }

            public LocalDate getFecha() {
                return fecha;
            }

            public LocalTime getHora() {
                return hora;
            }

            public Arbitro[] getArbitro() {
                return arbitro;
            }

            public Resultados getResultado() {
                return resultado;
            }

            public void setSeleccionLocal(Seleccion seleccionLocal) {
                this.seleccionLocal = seleccionLocal;
            }

            public void setSeleccionVisitante(Seleccion seleccionVisitante) {
                this.seleccionVisitante = seleccionVisitante;
            }

            public void setEstadio(String estadio) {
                this.estadio = estadio;
            }

            public void setFecha(LocalDate fecha) {
                this.fecha = fecha;
            }

            public void setHora(LocalTime hora) {
                this.hora = hora;
            }


            public Partido(Seleccion seleccionLocal, Seleccion seleccionVisitante, String estadio, LocalDate fecha, LocalTime hora, Arbitro[] arbitro) {
            this.seleccionLocal = seleccionLocal;
            this.seleccionVisitante = seleccionVisitante;
            this.estadio = estadio;
            this.fecha = fecha;
            this.hora = hora;
            this.arbitro = arbitro;
            this.resultado = new Resultados();
        }
        @Override
        public String toString() {
            return "Estadio: " + estadio + ", Fecha: " + fecha + ", Hora: " + hora 
                    + ", Local: " + seleccionLocal + " vs Visitante: " + seleccionVisitante 
                    + ", Resultado: " + resultado + ", Arbitro: " + arbitro;
        }    


        }
