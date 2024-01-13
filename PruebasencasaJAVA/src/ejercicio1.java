import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++){
            boolean num7 = i % 7 == 0;
            boolean num13 = i % 13 == 0;
            if (num7){
                if (num13){
                    System.out.printf("El nultiplo de 7\n", i);
                }else{
                    System.out.printf("El multiplos 7 y 13\n", i);

                }
            }
            else{
                if (num13) {
                    System.out.printf("El multiplo de 13\n", i);
                }
            }
        }

    }
}
