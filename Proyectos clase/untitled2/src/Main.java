import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero_1;
        int numero_2;

        Scanner keyboard = new Scanner(System.in);

        numero_1 = keyboard.nextInt();
        numero_2 = keyboard.nextInt();

        System.out.println(suma(numero_1, numero_2));

    }

    public static int suma(int numero_1 ,int numero_2) {

        int resultadosuma = 0;

        resultadosuma = suma(8,2);

        return resultadosuma;

    }
}