import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numerosViables = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);

        int numeroIntroducido;

        try {

            do {
                System.out.println("Introduzca un numero entre el 2 y el 7");
                numeroIntroducido = keyboard.nextInt();
            } while (numeroIntroducido < 2 || numeroIntroducido > 7);

            for (int i = 0; i <= 100; i++) {
                if (i % numeroIntroducido == 0) {
                    numerosViables.add(i);
                }
            }

            System.out.println(numerosViables);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }finally {
            keyboard.close();
        }
    }
}