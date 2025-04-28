//import java.util.Scanner;

public class EjemploValor {
    public static void main(String[] args) {

        EjemploValor cal = new EjemploValor();

        System.out.println(cal.sumar(5,10));
        System.out.println(cal.sumar(5,10,15));
        System.out.println(cal.sumar(5.5,10.5));
        System.out.println(cal.sumar(5,10.5));
        System.out.println(cal.sumar(5.5,10));

/*        int[]  numeros = {1, 2, 3};

        Scanner teclado = new Scanner(System.in);

        System.out.println("Antes de llamar al metodo: " + numeros[0]);

        cambiarValor(numeros);

        System.out.println("Despues de llamar al metodo: " + numeros[0]);

    }

    public static void cambiarValor(int [] arr) {

        arr[0] = 10;
*/
    }
    public int sumar (int a, int b) {

        return a + b;

    }

    public int sumar (int a, int b, int c) {

        return a + b + c;

    }

    public double sumar (double a, double b) {

        return a + b;

    }

    public double sumar (int a, double b) {

        return a + b;

    }

    public double sumar (double a, int b) {

        return a + b;

    }
}