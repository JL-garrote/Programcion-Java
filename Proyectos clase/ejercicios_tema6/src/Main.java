import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] almacen = new int[10];

        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < almacen.length;i++){

            System.out.println("Ingrese un numero en el almacen");

            almacen[i] = keyboard.nextInt();

        }

        System.out.println("Los valores de la lista invertida ");

        for(int i = almacen.length -1; i >= 0; i--){

            System.out.print(almacen[i] + " ");

        }
    }
}