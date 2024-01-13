package Practica_Examen_Objetos.Ejercicio4;

import java.time.LocalDate;

public abstract class  Abstracta_Servicio {
    private String Trabajador;
    private LocalDate FechaInicio;

    private String Cliente;

    public Abstracta_Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        Trabajador = trabajador;
        FechaInicio = fechaInicio;
        Cliente = cliente;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public String getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(String trabajador) {
        Trabajador = trabajador;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public abstract double costeMaterial();

    public abstract double costeManoObra();

    public abstract double costeTotal();

    public abstract String detalleServicio();
}
