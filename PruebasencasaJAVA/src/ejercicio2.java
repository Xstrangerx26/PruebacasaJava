import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        String[] e = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre"};
        double[] d = {33, 18.5, 22, 25.6, 4, 25.6, 38, 40, 39.9};
        mostrarGrafica(e,d);
    }

    public static void mostrarGrafica(String[] etiquetas, double[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print((etiquetas[i] + "        ").substring(0, 8) + ":");
            // Rellenamos con espacio hasta 8 caracteres para mantener la gráfica alineada
            //for (int j = 0; j < 8 - etiquetas[i].length(); j++) {
            //    System.out.print(" ");
            //}
            for (int k = 0; k < datos[i]; k++) {
                System.out.print('\u2588');
            }
            System.out.println("");
        }
    }
}
