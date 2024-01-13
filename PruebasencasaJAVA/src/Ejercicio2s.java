import java.util.Scanner;

public class Ejercicio2s {
    /*Realizar un programa que lea la edad de una persona menor a 100 años e
    informe de si es un niño (0-12 años), un adolescente (13-17), un joven (18-29) o un adulto.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad =sc.nextInt();
        if (edad >= 0 && edad <= 12 ){
            System.out.println("Es un niño");
        }else if (edad >= 13 && edad <= 17){
            System.out.println("Es un adolecente");
        }else if (edad >= 18 && edad <= 29){
            System.out.println("Es un joven");
        }else if (edad >= 30 && edad <= 100){
            System.out.println("Es un adulto");
        }else {
            System.out.println("Introduce un número menor de 100");
        }
    }
}
