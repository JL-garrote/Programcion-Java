import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int taza = 0;
        int capacidadmax = 0;
        int capacidadmin = 0;
        int opcion = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese capacidad maxima");
        capacidadmax = keyboard.nextInt();

        Cafetera cafetera1 = new Cafetera();
        Cafetera cafetera2 = new Cafetera(capacidadmax);

        System.out.println("Ingrese capacidad maxima");
        capacidadmax = keyboard.nextInt();
        System.out.println("Ingrese capacidad minima");
        capacidadmin = keyboard.nextInt();

        while (capacidadmin <= 0) {

            System.out.println("El valor no es correcto");
            capacidadmin = keyboard.nextInt();

        }

        Cafetera cafetera3 = new Cafetera(capacidadmax, capacidadmin);

        do {

            System.out.println("Cafetera1");
            System.out.println("Cafetera2");
            System.out.println("Cafetera3");
            System.out.println("Salir");

            opcion = keyboard.nextInt();

            switch (opcion) {

                case 1: {

                    do {

                        System.out.println("Llenar cafetera");
                        System.out.println("Vaciar cafetera");
                        System.out.println("Servir taza");
                        System.out.println("Agregar cafe");
                        System.out.println("Salir");

                        opcion = keyboard.nextInt();

                        switch (opcion){

                            case 1: {

                                cafetera1.llenarCafetera();
                                break;

                            }

                            case 2: {

                                cafetera1.vaciarCafetera();
                                break;

                            }

                            case 3: {

                                System.out.println("Que cantidad de cafe quieres en la taza");
                                taza = keyboard.nextInt();

                                cafetera1.servirTaza(taza);
                                break;

                            }

                            case 4: {

                                System.out.println("Que cantidad de cafe quieres en la cafetera");
                                taza = keyboard.nextInt();

                                cafetera1.agregarCafe(taza);
                                break;

                            }

                            default: {

                                break;

                            }

                        }

                    }while (opcion != 5);

                }

                case 2: {

                }

                case 3: {

                }

                default: {

                    break;

                }
            }

        }while (opcion != 4);



    }
}