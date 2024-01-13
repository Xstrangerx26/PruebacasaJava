package EXAMEN_TEMA4;

import java.util.ArrayList;

public class Equipo {
    private String pais;
    private String Entrenador;
    ArrayList<Jugador> Jugadores;

    public Equipo(String pais, String entrenador) {
        this.pais = pais;
        this.Entrenador = entrenador;
        this.Jugadores = new ArrayList<>();
    }
    void anadirJugador(Jugador jugador){
        this.Jugadores.add(jugador);
    }

    void eliminarJugador(Jugador jugador) {
        this.Jugadores.remove(jugador);
    }

    String obtenerEntrenador() {
        return this.Entrenador;
    }

    int obtenerGoles() {
        int totalGoles = 0;
        for (Jugador jugador : this.Jugadores) {
            totalGoles += jugador.obtenerGoles();
        }
        return totalGoles;
    }
}
