import java.util.Scanner;

public class Strings_Ejercicio2 {

        public class Main {
            public static void main(String[] args) {
                int n = 10; // puedes cambiar este valor para calcular otro término de la serie
                System.out.println(fibonacci(n));
            }

            public static int fibonacci(int n) {
                if (n <= 0) {
                    return 0;
                } else if (n == 1 || n == 2) {
                    return 1;
                } else {
                    int a = 1, b = 1, fib = 1;
                    for (int i = 3; i <= n; i++) {
                        fib = a + b;
                        a = b;
                        b = fib;
                    }
                    return fib;
                }
            }
        }


}
