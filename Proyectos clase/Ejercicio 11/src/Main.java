import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroX = 0;
        int numeroY = 100;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca el numero");
        numeroX = keyboard.nextInt();

        if (numeroX <= 0) {

            System.out.println("El numero es incorrecto");

        } else {

            System.out.println(suma(numeroX,numeroY));

        }

    }

    public static int suma (int numeroEntrada, int incremento) {

        int resultado = 0;

        for (int i = numeroEntrada; i <= (numeroEntrada + incremento); i++) {

            resultado = resultado + i;

        }

        return  resultado;

    }
}