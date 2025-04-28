import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero = 0;
        int cuentanumeros = 0;
        int total = 0;

        Scanner keyboard = new Scanner(System.in);

        do {

            System.out.println("Introduce un numero");
            numero = keyboard.nextInt();

            if (numero <= -1) {

                break;

            } else if (numero >= 0) {

                cuentanumeros++;
                total = total + numero;

            }

        } while (numero >= 0);

        System.out.println("La media total es "+media(total,cuentanumeros));

    }

    public static float media (float total, float cuentanumeros) {

        float resultado = total / cuentanumeros;
        return resultado;

    }
}