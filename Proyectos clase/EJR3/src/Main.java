import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MisAnimales a = new MisAnimales();
        Animal bicho = new Animal("a","f",28,6);

        Scanner keyboard = new Scanner(System.in);
        int opciones;

        do {
            System.out.println("Añadir animal");
            System.out.println("Eliminar animal por nombre");
            System.out.println("Obtener toda la informacion del animal");
            System.out.println("Sacar todas las razas");
            System.out.println("Obtener la media del peso de todos los animales");

            opciones = keyboard.nextInt();

            switch (opciones) {

                case 1: {
                    a.anadirAnimal(bicho);
                    break;
                }

                case 2: {
                    a.eliminarAnimal();
                    break;
                }

                case 3: {
                    a.obtenerInfo();
                    break;
                }

                case 4: {
                    a.obtenerRazas();
                    break;
                }

                case 5: {
                    a.obtenerMedia(bicho);
                    break;
                }
            }
        }while (opciones != 8);
    }
}