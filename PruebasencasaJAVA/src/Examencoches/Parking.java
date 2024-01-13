package Examencoches;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;

public class Parking {
    private ArrayList<Coches> cochesAparcados = new ArrayList<>();
    private final double PrecioPorDia = 12.65;

    public void aparcarCoche(Coches coches) {
        if (cochesAparcados.size() < 30) {
            cochesAparcados.add(coches);
        } else {
            System.out.println("No hay huecos libres");
        }
    }

    public void verCochesAparcados(int plaza) {
        if (plaza >= 0 && plaza < cochesAparcados.size()) {
            Coches coches = cochesAparcados.get(plaza);
            System.out.println("El nombre del propietario es: " + coches.getNombrePropi());
            System.out.println("La matricula del vehiculo es: " + coches.getMatriculaVehicu());
            System.out.println("Número de kilometros realizados: " + coches.getNumeroKilometros());
            System.out.println("Marca: " + coches.getMarca());
            System.out.println("La fecha del aparcamiento" + coches.getFechaAparcamiento());

        } else {
            System.out.println("No hay plazas disponibles para más vehiculos");
        }
    }

    public void buscarCochePorMatricula(String MatriculaVehicu) {
        for (int i = 0; i < cochesAparcados.size(); i++) {
            if (cochesAparcados.get(i).getMatriculaVehicu().equals(MatriculaVehicu)) {
                Coches coches = cochesAparcados.get(i);
                System.out.println("El nombre del propietario es: " + coches.getNombrePropi());
                System.out.println("La matricula del vehiculo es: " + coches.getMatriculaVehicu());
                System.out.println("Número de kilometros realizados: " + coches.getNumeroKilometros());
                System.out.println("Marca: " + coches.getMarca());
                System.out.println("La fecha del aparcamiento" + coches.getFechaAparcamiento());
                System.out.println("Números  de plazas:" + i);
                return;
            }
        }
        System.out.println("No se encontro coches con esa matricula");
    }

    public double calculaTarifa(String MatriculaVehicu) {
        for (Coches coches : cochesAparcados) {
            if (coches.getMatriculaVehicu().equals(MatriculaVehicu)) {
                long dias = coches.getFechaAparcamiento().until(LocalDate.now()).getDays();
                return dias * PrecioPorDia;
            }
        }
        System.out.println("No se encontró coche con esa matrícula.");
        return 0.0;
    }

}
