package Practica_Examen_Objetos.Ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
       // Abstracta_Servicio serv1 = new Abstracta_Servicio("Iker", LocalDate.of(2024,11,26), "Institito Padre José Miravent");
        TrabajoPintura tra1 = new TrabajoPintura("Irene", LocalDate.of(2024, 12, 2), "Pepete", 20, 2);
        System.out.println(tra1.detalleServicio());
        RevisionAlarma ala1 = new RevisionAlarma("Manuel", LocalDate.of(2024, 5, 13), "Campo de Fútbol Candel", 4);
        System.out.println(ala1.detalleServicio());

        ArrayList<Abstracta_Servicio> trabajos = new ArrayList<>();
            trabajos.add(tra1);
            trabajos.add(ala1);

            double ct = 0;
            double cmo = 0;

            for (Abstracta_Servicio t: trabajos){
                ct += t.costeTotal();
                cmo += t.costeManoObra();
                System.out.println(t.detalleServicio() + "\n"+"\n");
            }
        System.out.println("Coste total de todos los trabajos: " + ct);
        System.out.println("Coste de mano de obra de todos los trabajos: " + cmo);
    }
}
