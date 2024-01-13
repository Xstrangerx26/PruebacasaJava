package Practica_Examen_Objetos.Ejercicio4;

import java.time.LocalDate;

public class TrabajoPintura extends Abstracta_Servicio {

    private double Superficie;
    private double PrecioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        Superficie = superficie;
        PrecioPintura = precioPintura;
    }

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double superficie) {
        Superficie = superficie;
    }

    public double getPrecioPintura() {
        return PrecioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        PrecioPintura = precioPintura;
    }

    public double costeMaterial() {
        return (Superficie / 7.8) * PrecioPintura;
    }

    public double costeManoObra() {
        return (Superficie / 10) * 9.5;
    }

    public double costeTotal() {
        return costeMaterial() + costeManoObra() + costeAdicional();
    }

    private double costeAdicional() {
        if (Superficie < 50) {
            return (costeMaterial() + costeManoObra()) * 0.15;
        } else {
            return 0;
        }
    }

    public String detalleServicio() {
        String cadena = "";
        cadena += "TRABAJO DE PINTURA \n";
        cadena += "Cliente: " + getCliente() + "\n";
        cadena += "Fecha de inicio: " + getFechaInicio() + "\n";
        cadena += "--------------------------------------" + "\n";
        cadena += "Pintor: " + getTrabajador() + "\n";
        cadena += "Coste Material: " + costeMaterial() + "\n";
        cadena += "Coste Mano de Obra: " + costeManoObra() + "\n";
        cadena += "Total: " + costeTotal() + "\n";
        cadena += "--------------------------------------" + "\n";
        return cadena;
    }
}
