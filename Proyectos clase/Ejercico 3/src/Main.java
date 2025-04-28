import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce un numero por teclado");
        num1 = teclado.nextInt();

        System.out.println(factorial(num1));

    }

    public static int factorial (int num1) {

        int factorial = 1;

        for (int i = 2; i <= num1; i++) {

            factorial *= i;

        }

        return factorial;
    }
}