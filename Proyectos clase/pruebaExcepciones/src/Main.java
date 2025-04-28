import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int suma;
        float division;
        boolean validacion = false;

        Scanner keyboard = new Scanner(System.in);

        do {

            try{

                System.out.println("Introduce los numeros");
                a = keyboard.nextInt();
                b = keyboard.nextInt();
                division = (float) b / a;
                validacion = true;

            }catch (ArithmeticException e){
                System.err.println("Operacion imposible de hacer " + e.getMessage());
                keyboard.nextLine();
            } catch (InputMismatchException e){
                System.err.println("Formato incorrecto " + e.getMessage());
                keyboard.nextLine();
            }

        }while (!validacion);

    }
}
