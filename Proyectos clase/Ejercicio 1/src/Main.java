import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero_1 = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca un numero");

        numero_1 = keyboard.nextInt();

        System.out.println(calculodelospares(numero_1));

    }

    //funcion para sacar los pares
    public static int calculodelospares(int numero_1) {

        int numerodepares = 0;

        //Bucle for se repite un nemero determinado de veces hasta que sea 0
        for (int i = numero_1; i > 0; i--) {

            //Condicion si el resto de la division entre dos es 0 entra
            if (i %2 == 0) {

                System.out.println("numero par encontrado " + i);

                numerodepares ++;

            }

        }

        /*if (numero_1 %2 == 1) {

            System.out.println("el numero es impar " +numero_1);

        }
*/
        System.out.println("el total de pares son " + numerodepares);

        return numerodepares;

    }
}