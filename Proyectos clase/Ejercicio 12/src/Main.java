import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroIntroducido1 = 0;
        int numeroIntroducido2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        numeroIntroducido1 = teclado.nextInt();

        System.out.println("Introduzca el segundo numero");
        numeroIntroducido2 = teclado.nextInt();

        if (numeroIntroducido1 == numeroIntroducido2) {

           System.out.println("Los numeros son identicos");

        }

    }

    public static void suma7en7desdeelmenor (int numeromenor, int numeromayor, int incremento) {

        if (numeromayor < numeromenor) {

        }
    }
}