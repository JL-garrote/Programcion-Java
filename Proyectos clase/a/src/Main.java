/* ESCRIBE UN PROGRMA QUE ESCRIBA 10 NUMEROS LOS ALMACENE EN UN ARRAY POR TECLADO
Y QUE LUEGO MUESTRE EL MAXIMO Y EL MINIMO Y TE DIGA LA POSICION */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] almacen = new int[10];
        int postmayor = 0;
        int postmenor = 0;
        boolean encontrado = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese 10 valores");

        for(int i = 0; i <= almacen.length -1; i++) {

            almacen[i] = keyboard.nextInt();

        }

        for(int i = 0; i <= almacen.length && !encontrado; i++) {

            if (almacen[i] == 0) {

                encontrado = true;

            }

        }

        /*int menor = 0;

        for(int j = 0; j < almacen.length -1; j++) {

            if (almacen[j] < menor) {

                menor = almacen[j];
                postmenor = j;

            }

        }

        int mayor = 0;

        for(int j = 0; j < almacen.length -1; j++) {

            if (almacen[j] < mayor) {

                mayor = almacen[j];
                postmayor = j;

            }

        }

        System.out.println("El valor de mayor es: " + mayor + " " + postmayor);
        System.out.println("El valor del menor es: " + menor + " " +postmenor);
        */
    }
}