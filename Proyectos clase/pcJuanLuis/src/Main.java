import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalStateException {

        String[] nombre = null;
        int opciones;
        int longitud;

        Scanner keyboard = new Scanner(System.in);

        try {

            do {

                System.out.println("Opcion 1: Introduzca longitud y valores en el array");
                System.out.println("Opcion 2: Sustituye valores en el array");
                System.out.println("Opcion 3: Devuelve el valor de una posicion determinada en el array");
                System.out.println("Opcion 4: Salir");

                opciones = keyboard.nextInt();

                try {

                    switch (opciones) {

                        case 1: {

                            try {

                                System.out.println("Introduzca la longitud del array");
                                longitud = keyboard.nextInt();

                                nombre = new String[longitud];

                                System.out.println("Introduzca los valores en el array");
                                for (int i = 0; i < nombre.length; i++) {
                                    nombre[i] = keyboard.next();
                                }

                            } catch (InputMismatchException e) {
                                System.err.println(e.getMessage());
                                keyboard.nextLine();
                            }

                            break;
                        }

                        case 2: {

                            try {

                                System.out.println("Introduzca la posicion en el array que quiera modificar");
                                longitud = keyboard.nextInt();

                                if (longitud <= -1){
                                    throw new InputMismatchException("Posicion no valida");
                                }

                                for (int i = 0; i < nombre.length; i++) {

                                    if (i == longitud) {
                                        System.out.println("Introduzca el nuevo valor");
                                        nombre[i] = keyboard.next();
                                    }

                                }

                            } catch (InputMismatchException e) {
                                System.err.println(e.getMessage());
                                keyboard.nextLine();
                            }

                            break;
                        }

                        case 3: {

                            try {

                                System.out.println("Introduzca la posicon en el array");
                                longitud = keyboard.nextInt();

                                if (longitud <= -1){
                                    throw new InputMismatchException("Posicion no valida");
                                }

                                for (int i = 0; i < nombre.length; i++) {

                                    if (i == longitud) {
                                        System.out.println(nombre[i]);
                                    }

                                }

                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.err.println(e.getMessage());
                                keyboard.nextLine();
                            } catch (InputMismatchException e) {
                                System.err.println(e.getMessage());
                            }

                            break;
                        }

                        case 4: {
                            System.out.println("Saliendo del programa");
                            break;
                        }

                    }

                } catch (NullPointerException e) {
                    System.err.println(e.getMessage());
                    keyboard.nextLine();
                }

            } while (opciones != 4);


        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            keyboard.close();
        }
    }
}