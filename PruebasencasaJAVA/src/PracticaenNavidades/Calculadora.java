package PracticaenNavidades;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner r = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        double num1 = r.nextDouble();

        System.out.println("Introduzca el segundo número:");
        double num2 = r.nextDouble();

        System.out.println("Introduzca la operación:");
        String operation = r.next();

        System.out.println("El primer número recibido es: " + num1);
        System.out.println("El segundo número recibido es: " + num2);
        System.out.println("La operación es: " + operation);
        double result = docalcula(num1, num2, operation);

        System.out.println("El resultado de la operación " + operation + " es " + result);

    }
    private static double docalcula(double num1, double num2, String operation) throws IllegalAccessException {
        switch (operation) {
            case "+":
                return sum(num1, num2);
            case "-":
                return minus(num1, num2);
            case "*":
                return multiply(num1, num2);
            default:
             throw new IllegalAccessException("Operación desconocida");
        }

    }

    private static double sum(double num1, double num2){
        return num1 + num2;
    }
    private static double minus(double num1, double num2){
        return num1 - num2;
    }
    private static double multiply(double num1, double num2){
        return num1 * num2;
    }
}
