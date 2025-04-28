import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] almacen = new int[10];
        int mayor = 0;
        int menor = 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < almacen.length; i++) {

            almacen[i] = keyboard.nextInt();

        }

        for (int i = 0; i < almacen.length; i++) {

            if (almacen[i] > mayor) {

                mayor = almacen[i];

            }
        }

        for (int i = 0; i < almacen.length; i++) {

            if (almacen[i] < menor) {

                menor = i;

            }

        }
        System.out.println("Maximo " +mayor);

        System.out.println( "Minimo " +menor);
    }
}