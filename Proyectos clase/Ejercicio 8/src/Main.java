import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        short cobinacion = 1234;
        short intentodecontrasena = 0;
        int intentos = 4;

        Scanner keyboard = new Scanner(System.in);

        for (int i = intentos; i >= 0; i--) {

            System.out.println("Introduzca la contraseña");

            intentodecontrasena = keyboard.nextShort();


            if (intentodecontrasena == cobinacion) {

                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                System.exit(1);

            } else {

                System.out.println("Lo siento esa no es la combinacion");

            }

        }
    }
}