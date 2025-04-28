import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroentero = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero por teclado");
        numeroentero = teclado.nextInt();

        System.out.println(calcularnumeroprimo(numeroentero));

    }


    public static boolean calcularnumeroprimo(int numeroentero) {

        Scanner teclado = new Scanner(System.in);

        boolean primo = true;

        do {

            for (int i = 2; i < numeroentero; i++) {

                if (numeroentero % i == 1) {

                    primo = true;

                    if (primo == true){

                        System.out.println("El numero es primo");
                        break;

                    }

                }

                if (numeroentero % i == 0) {

                    primo = false;

                    if (primo == false){

                        System.out.println("El numero no es primo");
                        break;

                    }

                }
            }

        } while (primo = false);

        return primo;

    }
}