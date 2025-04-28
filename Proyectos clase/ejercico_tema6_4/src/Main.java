import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] temperatura = new int[12];

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduce la temperatura media de los 12 meses del año");

        for(int i = 0; i < temperatura.length; i++){

            temperatura[i] = keyboard.nextInt();

        }

        for(int i = 0; i < temperatura.length; i++){

            String asterisco = "*";

            for(int j = 0; j < temperatura[i]; j++){

                System.out.print(asterisco);

            }

            System.out.println();

        }
    }
}