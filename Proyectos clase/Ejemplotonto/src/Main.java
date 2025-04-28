import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int n1;
        int n2;

        Scanner keyboard = new Scanner(System.in);

        try {

            System.out.println("Introduzca dos numeros enteros");
            n1 = keyboard.nextInt();
            n2 = keyboard.nextInt();

            int suma = sumar(n1, n2);

            System.out.println("El numero 1 es " + n1 + "\nEl numero 2 es " + n2);
            System.out.println("El resultado es " + suma);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            keyboard.close();
        }
    }

    public static int sumar(int n1,int n2){
        return n1 + n2;
    }
}