import java.util.Scanner;


public class BOLETIN1_6EJERCCIO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, e, resul = 1;
        System.out.println("Dime dos números que este en base y exponente");
        b = sc.nextInt();
        e = sc.nextInt();
        if (b == 0){
            if (e != 0){
                resul = 0;
            }
        }else {
            for (int i = 1; i<=e; i++){
                resul *=b;
            }
        }
        System.out.println("Resultado es " + resul);
    }
}
