/*Introduce 20 numeros de fomra aleatoria entre 0 y 99  calcular los numeros primos y pares de esos numeros dados*/

public class Main {
    public static void main(String[] args) {

        int[] almacen = new int[20];
        boolean pares = false;

        for (int i = 0; i < almacen.length; i++) {

            almacen[i] = (int) (Math.random() *100);

        }

        for (int i = 0; i < almacen.length; i++) {

            System.out.println(almacen[i]);

        }

        for (int i = 0; i < almacen.length; i++) {

            if (almacen[i] % 2 == 0) {

                pares = true;
                System.out.println("El numero par es " + almacen[i]);

            } else {

                pares = false;

            }

        }

        for (int i = 0; i < almacen.length; i++) {

            if (almacen[i] % 2 != 0 && almacen[i] % 3 != 0 && almacen[i] % 5 != 0 && almacen[i] % 7 != 0) {

                System.out.println("Los numeros primos son " +almacen[i]);

            }

        }
    }
}