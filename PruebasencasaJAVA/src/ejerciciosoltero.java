import java.util.Scanner;

public class ejerciciosoltero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce el estado civil de la persona (S-Soltero, C-Casado, V-Viudo, D-Divorciado):");
        String estadoCivil = scanner.nextLine().toUpperCase();

        System.out.println("Por favor, introduce la edad de la persona:");
        int edad = scanner.nextInt();

        double porcentajeRetencion = calcularPorcentajeRetencion(estadoCivil, edad);

        System.out.println("El porcentaje de retención que se debe aplicar es: " + porcentajeRetencion + "%");
    }

    public static double calcularPorcentajeRetencion(String estadoCivil, int edad) {
        if ((estadoCivil.equals("S") || estadoCivil.equals("D")) && edad < 35) {
            return 12.0;
        } else if (edad > 50) {
            return 8.5;
        } else if ((estadoCivil.equals("V") || estadoCivil.equals("C")) && edad < 35) {
            return 11.3;
        } else {
            return 10.5;
        }
    }
    }

