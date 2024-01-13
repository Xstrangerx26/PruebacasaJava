import java.util.Scanner;

public class otraprueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        System.out.println("Dime un número");
        num = sc.nextInt();
        numero(num);
        System.out.println("Dime otro número");
        num2 = sc.nextInt();
        numero(num2);

    }
    public static void numero(int todos){
        if ( todos % 2 == 0 ){
            System.out.println("El números es: " + todos + " par");
        } else{
            System.out.println("El números es: " + todos + " impar");
        }

    }
}
