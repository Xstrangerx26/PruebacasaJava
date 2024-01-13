package Examencoches;

import java.time.LocalDate;

public class Coches {
    private String NombrePropi;
    private String MatriculaVehicu;
    private int NumeroKilometros;
    private String Marca;

    private LocalDate FechaAparcamiento;

    public Coches(String nombrePropi, String matriculaVehicu, int numeroKilometros, String marca, LocalDate fechaAparcamiento) {
        NombrePropi = nombrePropi;
        MatriculaVehicu = matriculaVehicu;
        NumeroKilometros = numeroKilometros;
        Marca = marca;
        FechaAparcamiento = fechaAparcamiento;
    }

    public String getNombrePropi() {
        return NombrePropi;
    }

    public String getMatriculaVehicu() {
        return MatriculaVehicu;
    }

    public int getNumeroKilometros() {
        return NumeroKilometros;
    }

    public String getMarca() {
        return Marca;
    }

    public LocalDate getFechaAparcamiento() {
        return FechaAparcamiento;
    }

    public void setNombrePropi(String nombrePropi) {
        NombrePropi = nombrePropi;
    }

    public void setMatriculaVehicu(String matriculaVehicu) {
        MatriculaVehicu = matriculaVehicu;
    }

    public void setNumeroKilometros(int numeroKilometros) {
        NumeroKilometros = numeroKilometros;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setFechaAparcamiento(LocalDate fechaAparcamiento) {
        FechaAparcamiento = fechaAparcamiento;
    }

}
