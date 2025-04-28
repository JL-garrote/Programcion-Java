import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int as = 0;
        int b = 0;
        boolean valido = false;
        Scanner sc = new Scanner(System.in);

        do {

            try {

                System.out.println("a");
                as = sc.nextInt();
                //valido = true;

                System.out.println("b");
                b = sc.nextInt();
                valido = true;

            } catch (Exception e) {

                System.out.println("Error");
                sc.nextLine();

            }

        }while (!valido);

        double media = (double) (as + b) / 2;
        System.out.println("La media es: " + media);
    }
}
