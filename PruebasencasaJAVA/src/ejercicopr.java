import java.util.Scanner;

public class ejercicopr {
    //Realizar un programa que lea un carácter y dos números enteros por
    //teclado. Si el carácter leído es un operador aritmético, calcular la operación
    //correspondiente, si es cualquier otro debe mostrar un error
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un caracter");
        char caracter = sc.next().charAt(0);

        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();
        switch (caracter){
            case '+':
                System.out.println("Resultado " + (num1+ num2));
                break;
            case '-':
                System.out.println("Resultado " + (num1- num2));
                break;
            case '/':
                System.out.println("Resultado " + (num1 /  num2));
                break;
            case '*':
                System.out.println("Resultado " + (num1* num2));
                break;
            default:
                System.out.println("Error: Carácter no válido ");
        }
    }
}
