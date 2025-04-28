import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroX = 0;
        int numeroY = 20;
        int resultado = 1;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca el numero");
        numeroX = keyboard.nextInt();

        if (numeroX < 500) {

            System.out.println("El numero es incorrecto");

        } else {

            for (int i = numeroX; i < (numeroX + numeroY); i++) {

                resultado = resultado + i;

            }

        }

        System.out.println(resultado);

    }
}