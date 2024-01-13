package Examencoches;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        //Creamos el objeto Parking
        Parking parking = new Parking();
        //Creamos los coches.
        Coches Iker = new Coches("Iker", "34545466W", 4000000,"Peugeot", LocalDate.now());
        Coches Manuel = new Coches("Manuel", "685445588L", 35000,"Kia", LocalDate.now());

        //Aparcamos los coches
        parking.aparcarCoche(Iker);
        parking.aparcarCoche(Manuel);
        System.out.println("---------------------------------");
        //Vemos los coches aparcados
        parking.verCochesAparcados(0);
        parking.verCochesAparcados(1);
        System.out.println("---------------------------------");
        //Buscamos un coche por matrícula u calculamos la tarifa
        parking.buscarCochePorMatricula("685445588L");
        System.out.println("Tarifa " + parking.calculaTarifa("685445588L"));
    }


}
