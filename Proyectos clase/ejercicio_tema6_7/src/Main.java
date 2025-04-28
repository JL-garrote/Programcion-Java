import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] tabla;
        int a = 0;
        int b = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca la longitud de la tabla: ");

        a = keyboard.nextInt();
        b = keyboard.nextInt();

        while (a < b || a > b) {

            System.out.println("Introduzca la longitud de la tabla: ");

            a = keyboard.nextByte();
            b = keyboard.nextByte();

        }

        tabla = new int[a][b];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                tabla[i][j] = (int) (Math.random() * 101);

            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                System.out.print(tabla[i][j] + "| ");

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {

                System.out.print(tabla[a -j -1][i] + "| ");

            }

            System.out.println();
        }
    }
}