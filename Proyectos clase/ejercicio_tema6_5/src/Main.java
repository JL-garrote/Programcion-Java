import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numero = new int[8];

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++) {

            numero[i] = keyboard.nextInt();

        }

        for (int i = 0; i < numero.length; i++) {

            if(numero[i] %2==0) {

                System.out.println("El numero es par : "+numero[i]);

            } else {

                System.out.println("El numero es impar : "+numero[i]);

            }
        }
    }
}