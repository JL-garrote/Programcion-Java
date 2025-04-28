import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declara nuestras variables
        float numeroA = 0;
        float numeroB = 0;
        float numeroC = 0;

        Scanner keyboard = new Scanner(System.in);

        //Introduce los 3 numeros introducidos por teclado
        System.out.println("Introduce el numero A");
        numeroA = keyboard.nextFloat();

        System.out.println("Introduce el numero B");
        numeroB = keyboard.nextFloat();

        System.out.println("Introduce el numero C");
        numeroC = keyboard.nextFloat();

        System.out.println("El resultado de nuestra ecuacion de segundo grado es " +ecuacionsegundogrado(numeroA,numeroB,numeroC));

    }

    public static float ecuacionsegundogrado(float numeroA, float numeroB , float numeroC) {

        float calculoalcuadrado = numeroA * numeroA;
        float resultado = calculoalcuadrado + numeroB + numeroC;

        return resultado;
    }
}