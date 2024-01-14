package Practica_Examen_Objetos.Ejercicio5;

import java.util.Scanner;

public class Principal {

     static Parking par1 = new Parking("Centro", 10);
    static int opcion;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do{
        menu();
        accion();
        }while (opcion!=4);

    }
    public static void accion(){
        switch (opcion){
            case 1 -> EntradaCoche();
            case 2 -> SalidaCoche();
            case 3 -> System.out.println(par1 + "\n \n");
            case 4 -> System.out.println("Fin del programa");
            default -> System.out.println("Error al elegir una opción. Las opciones son del 1 al 4 \n\n");
        }
    }

    public static void EntradaCoche(){
        try{
        System.out.println("Introduzca la matricula: ");
        String m = sc.next();
        System.out.println("Introduza la plaza: ");
        int p = Integer.parseInt(sc.next());
        par1.entrada(m,p);
        }catch (ParkingException ex){
            //gestiono el error
            System.out.println("Error: " + ex.getMessage());
            System.out.println("No se realizo la entrada del coche con matricula "+ ex.getMatricula()+" en el parking");
        }catch (NumberFormatException ex){
            System.out.println("Formato de número incorrecto");
        }catch (Exception ex){
            System.out.println("Error desconocido");
        }
    }

    public  static  void  SalidaCoche(){
        try {
            System.out.println("Introduzca la matricula: ");
            String m = sc.next();
            int p = par1.salida(m);
            System.out.println("El coche " +m+ " salido de la plaza " + p + "\n \n");
            System.out.println("Plazas totales: " + par1.getPlazasTotales() + "\n");
            System.out.println("Plazas ocupadas: " + par1.getPlazasOcupadas() + "\n");
            System.out.println("Plazas libres: " + par1.getPlazasLibres() + "\n\n");
        }catch (ParkingException ex){
            System.out.println("Error: " + ex.getMessage());
            System.out.println("No se realizo la salida del coche con matricula " + ex.getMatricula() + " en el parking");
        }catch (Exception ex){
            System.out.println("Error desconocido");
        }

    }

    public static void menu(){
        System.out.println("""
                1) Entrada de coche
                2) Salida de coche
                3) Mostrar parking
                4) Salir del programa
                ->
                """);
        try {
            opcion = Integer.parseInt(sc.next());
        }catch (Exception ex){
           opcion = 0;
        }
    }
}
