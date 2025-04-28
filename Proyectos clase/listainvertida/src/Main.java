import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] mitabla;
        int a = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca la longitud de la matriz");
        a = keyboard.nextInt();

        mitabla = new int[a];

        for (int i = 0; i < mitabla.length;i++) {

                System.out.println("\t \\introduzca los valores\\");
                mitabla[i] = keyboard.nextInt();

        }

        System.out.println("Los valores son ");

        for (int i = mitabla.length -1; i >= 0;i--) {

            System.out.print(mitabla[i] + " ");

        }

    }
}