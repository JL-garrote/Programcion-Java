public class Main {
    public static void main(String[] args) {

        int numero = 20;

        for (int i = 0; i <= numero; i++) {

            System.out.println(fibonacci(i) + " ");

        }

    }

    public static int fibonacci (int n) {

        if (n == 0 || n == 1) {

            return n;

        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}