package Practica_Examen_Objetos.Ejercicio4;

import java.time.LocalDate;

public class RevisionAlarma extends Abstracta_Servicio {
    private int Numeros_Alarmas;

    public RevisionAlarma(String trabajador, LocalDate fechaInicio, String cliente, int numeros_Alarmas) {
        super(trabajador, fechaInicio, cliente);
        Numeros_Alarmas = numeros_Alarmas;
    }

    public int getNumeros_Alarmas() {
        return Numeros_Alarmas;
    }

    public void setNumeros_Alarmas(int numeros_Alarmas) {
        Numeros_Alarmas = numeros_Alarmas;
    }

    public double costeMaterial() {
        return 0;
    }

    public double costeManoObra() {
        return (Numeros_Alarmas / 3) * 40;
    }

    public double costeTotal() {
        return costeManoObra();
    }

    public String detalleServicio() {
        String cadena = "";
        cadena += "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS \n";
        cadena += "Cliente: " + getCliente() + "\n";
        cadena += "Fecha revisión: " + getFechaInicio() + "\n";
        cadena += "-----------------------------------" + "\n";
        cadena += "TOTAL: " + costeTotal() + "\n";
        return cadena;
    }

}
