package EXAMEN_TEMA4;

public class Jugador {
    private String nombre;
    private int edad;
    private int golesMarcados;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.golesMarcados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public void agregarGol(){
        golesMarcados++;
    }

    public int totalGolesMarcadosJugadores(){
        return golesMarcados;
    }

}
