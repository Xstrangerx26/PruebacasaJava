import java.util.Scanner;

public class ejerciciodehoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce la primera hora (formato HH:MM:SS):");
        String hora1 = scanner.nextLine();
        int segundos1 = convertirASegundos(hora1);

        System.out.println("Por favor, introduce la segunda hora (formato HH:MM:SS):");
        String hora2 = scanner.nextLine();
        int segundos2 = convertirASegundos(hora2);
        if (segundos1 > segundos2) {
            System.out.println("Hora 1 es mayor");
        } else if (segundos1 < segundos2) {
            System.out.println("Hora 2 es mayor");
        } else {
            System.out.println("Las dos horas son iguales");
        }
    }

    public static int convertirASegundos(String hora) {
        String[] partes = hora.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);

        return horas * 3600 + minutos * 60 + segundos;
    }
}

