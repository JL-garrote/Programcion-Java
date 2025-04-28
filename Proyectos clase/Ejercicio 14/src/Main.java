import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numerodeprimos = 0;
        int primerprimo = 2;
        boolean esprimo;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduce el numero de primos que quieres sacar");
        numerodeprimos = keyboard.nextInt();

        System.out.println(sacapimos(numerodeprimos,primerprimo));
    }

    public static int sacapimos (int numero, int primo) {

        int enumero = 0;
        int contador = 0;

        while (contador < numero) {

            if (esprimo()){

            }
        }

        return primo;
    }

    public static boolean esprimo (int numeroentero, boolean primo) {

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

        return primo;
    }
}