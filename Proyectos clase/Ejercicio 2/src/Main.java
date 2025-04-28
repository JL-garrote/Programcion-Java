import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero1;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduce un numero ");

        numero1 = keyboard.nextInt();

        System.out.println("el numero de impares encontrados son " + esimpar(numero1));

    }

    public static int esimpar(int numero1) {

        int sumadeimpares = 0;

        for (int i = numero1; i > 0; i--) {

            if (i %2 == 1){

                System.out.println("numero impar encontrado " + i);

                sumadeimpares = sumadeimpares +i;

            }

        }

        return sumadeimpares;
    }
}