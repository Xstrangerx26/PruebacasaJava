package EXAMEN_TEMA4;

public class Jugador {
    private String jugador;
    private int goles;
    private int edad;

    public Jugador(String jugador, int goles, int edad) {
        this.jugador = jugador;
        this.goles = 0;
        this.edad = edad;
    }

    public Jugador(String jugador, int goles) {

    }

    void anadirgoles(){
        this.goles++;
    }

    int obtenerGoles(){
        return this.goles;
    }

}