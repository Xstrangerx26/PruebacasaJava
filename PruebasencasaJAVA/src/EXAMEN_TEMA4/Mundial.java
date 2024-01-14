package EXAMEN_TEMA4;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Mundial {
    private String nombre;
    private List<Equipo> equipos;

    public Mundial(String nombre) {
        this.nombre = nombre;
        equipos = new ArrayList<>();
    }
    public void anadirequipo(Equipo equipo){
        equipos.add(equipo);
    }

    public void eliminarequipos(Equipo equipo){
        equipos.remove(equipo);
    }

    public int TotalGolesMarcadosMundial(){
        int totalGoles = 0;
        for (Equipo equipo : equipos){
            totalGoles += equipo.totalGolesMarcadosEquipo();
        }
        return totalGoles;
    }
    public Equipo equipoMasGolesMarcadosMundial(){
        Equipo equipoMasGoles = null;
        int maxGoles = 0;

        for (Equipo equipo : this.equipos) {
            int goles = equipo.totalGolesMarcadosEquipo();
            if (goles > maxGoles) {
                maxGoles = goles;
                equipoMasGoles = equipo;
            }
        }
        return equipoMasGoles;
    }

    public Jugador jugadorMasGolesMarcadosMundial(){
        Jugador jugadorMasGoles = null;
        int maxGoles = 0;
        for (Equipo equipo : this.equipos) {
            for (Jugador jugador : equipo.Jugadores) {
                int goles = jugador.totalGolesMarcadosJugadores();
                if (goles > maxGoles) {
                    maxGoles = goles;
                    jugadorMasGoles = jugador;
                }
            }
        }
        return jugadorMasGoles;
    }

    public static void main(String[] args) {

        Mundial mundial = new Mundial("Copa Mundial de Chapas en Casa-Puerta Isla Cristina 2023");
        Equipo equipo1 = new Equipo("España","Luis Enrique");
        Equipo equipo2 = new Equipo("Portugal", "Joe");

        Jugador jugado1 = new Jugador("Ronaldo",20);
        Jugador jugado2 = new Jugador("Messi",23);

        mundial.anadirequipo(equipo1);
        mundial.anadirequipo(equipo2);

        equipo1.anadirJugador(jugado1);
        equipo1.anadirJugador(jugado1);
        equipo2.anadirJugador(jugado2);

        jugado1.agregarGol();
        jugado1.agregarGol();
        jugado2.agregarGol();
        System.out.println("Número total de goles marcados en el mundial: " + mundial.TotalGolesMarcadosMundial());
        System.out.println("Equipo con más goles marcados en el mundial: " + mundial.equipoMasGolesMarcadosMundial().getPais());
        System.out.println("Jugador con más goles marcados en el mundial: " + mundial.jugadorMasGolesMarcadosMundial().getNombre());


    }
}
