import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero = 4;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("El factorial de " +numero + " es " + factorial(numero));
    }

    public static int factorial(int n) {

        if (n <= 1) {

            return 1;

        }

        return n * factorial(n - 1);

    }
}