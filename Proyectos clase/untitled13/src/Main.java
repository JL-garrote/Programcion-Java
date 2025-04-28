/*Crear una clase producto que contenga los atributos nombre precio cantidad la clase debe de tener metodos para calcular
* el valor total del inventario = precio x cantidad y aplicar un descuento sobre el precio.
* Crear una clase principal que genere al menos tres objetos de la clase productos y muestr el valor total del inventario
* y del precio con descuento todos los datos introducidos por pantalla*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        String[] nombre1 = new String[3];
        float[] precio1 = new float[3];
        int[] cantidad1 = new int[3];


        Scanner keyboard = new Scanner(System.in);

        do {

            System.out.println("Introduzca el nombre del producto");
            nombre1[x] = keyboard.next();
            System.out.println("Introduzca el precio del producto");
            precio1[x] = keyboard.nextFloat();
            System.out.println("Introduzca la cantidad del producto");
            cantidad1[x] = keyboard.nextInt();
            x++;

        } while (x < 3);

        x = 0;

        Producto raton = new Producto(nombre1[x], precio1[x], cantidad1[x]);
        x++;

        Producto monitor = new Producto(nombre1[x], precio1[x], cantidad1[x]);
        x++;

        Producto teclado = new Producto(nombre1[x], precio1[x], cantidad1[x]);

        int opcion = 0;

        do {

            raton.detalles();
            monitor.detalles();
            teclado.detalles();

            System.out.println("Salir");

            opcion = keyboard.nextInt();

            switch (opcion) {

                case 1: {

                    raton.valorInventario(raton.precio);
                    raton.descuento();
                    System.out.println(raton.descuento);
                    break;

                }

                case 2: {

                   monitor.valorInventario(monitor.precio);
                   monitor.descuento();
                   System.out.println(monitor.descuento);
                   break;

                }

                case 3: {

                    teclado.valorInventario(teclado.precio);
                    teclado.descuento();
                    System.out.println(teclado.descuento);
                    break;

                }

                default: {

                    break;

                }
            }
        }while (opcion != 4);
    }
}