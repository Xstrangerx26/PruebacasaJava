package ejercicio_objetos_clases;

public class Dimension {
    private double alto;
    private double ancho;
    private double Profundidad;

    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.Profundidad = 0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        Profundidad = profundidad;
    }
    public double getVolumen(){
        return alto*ancho*Profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return Profundidad;
    }

    public void setProfundidad(double profundidad) {
        Profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", Profundidad=" + Profundidad + " volumen=" + getVolumen() +
                '}';
    }
}
