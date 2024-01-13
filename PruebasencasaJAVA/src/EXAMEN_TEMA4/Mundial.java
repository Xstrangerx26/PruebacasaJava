package EXAMEN_TEMA4;

import java.util.ArrayList;

public class Mundial {
   private String Nombre;
    ArrayList<Equipo> equipos;

    public Mundial(String nombre) {
        this.Nombre = nombre;
        this.equipos = new ArrayList<>();
    }
    void anadirEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }

    void eliminarEquipo(Equipo equipo) {
        this.equipos.remove(equipo);
    }

    int obtenerGoles() {
        int totalGoles = 0;
        for (Equipo equipo : this.equipos) {
            totalGoles += equipo.obtenerGoles();
        }
        return totalGoles;
    }
}
