package EXAMEN_TEMA4;

public class Principal {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Fran",18);
        Jugador jugador2 = new Jugador("Juan", 20);
        Equipo equipo = new Equipo("España", "Iker Mendez");
        equipo.anadirJugador(jugador1);
        equipo.anadirJugador(jugador2);
        Mundial mundial = new Mundial("Copa Mundial de Chapas en Casa-Puerta Isla Cristina 2023");
        mundial.anadirEquipo(equipo);
        jugador1.anadirgoles();
        jugador2.anadirgoles();

        // Imprimir información
        System.out.println("Entrenador del equipo: " + equipo.obtenerEntrenador());
        System.out.println("Goles del equipo: " + equipo.obtenerGoles());
        System.out.println("Goles del mundial: " + mundial.obtenerGoles());
    }
}
