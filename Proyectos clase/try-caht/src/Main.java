import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int edad;
        boolean valido = false;

        Scanner keyboard = new Scanner(System.in);

        do {
            try {

                System.out.println("Ingrese su edad: ");
                edad = keyboard.nextInt();

                if(edad < 0 | edad > 120) {

                }

                valido = true;

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
                keyboard.nextLine();
            }

        }while (!valido);
    }
}
