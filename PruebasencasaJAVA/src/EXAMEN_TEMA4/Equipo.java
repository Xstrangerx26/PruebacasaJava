package EXAMEN_TEMA4;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String pais;
    private String entrenador;
   List<Jugador> Jugadores;

    public Equipo(String pais, String entrenador) {
        this.pais = pais;
        this.entrenador = entrenador;
        this.Jugadores = new ArrayList<>();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        Jugadores = jugadores;
    }

    public void anadirJugador(Jugador jugador){
        Jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador){
        Jugadores.remove(jugador);
    }

    public String obtenerEntrenador(){
        return entrenador;
    }

    public int totalGolesMarcadosEquipo(){
        int totalgoles = 0;
        for (Jugador jugador : Jugadores){
            totalgoles += jugador.totalGolesMarcadosJugadores();
        }
        return totalgoles;
    }
}
