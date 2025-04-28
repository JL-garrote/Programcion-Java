import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero_ruedas = 0;
        boolean vehiculo = false;
        boolean numeroderuedasnopermitidas = true;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("introduzca el numero de ruedas");
        numero_ruedas = keyboard.nextInt();

        switch (numero_ruedas) {

            case 1 : {

                boolean vehiculopermitido = vehiculo || numeroderuedasnopermitidas;

                if (numero_ruedas == 2) {

                    System.out.println("Vehiculo de 2 ruedas");
                    break;

                } else if (vehiculopermitido == true) {

                    System.out.println("El vehiculo tiene menos de 2 ruedas");

                }

            }

            case 2 : {

                if (numero_ruedas == 4) {

                    System.out.println("Vehiculo de 4 ruedas");
                    break;

                } else if (numero_ruedas > 2 || numero_ruedas == 0 || numero_ruedas < 4) {

                    boolean vehiculonopermitido = vehiculo && numeroderuedasnopermitidas;

                    System.out.println("El vehiculo tiene menos de 4 ruedas");
                    break;

                }

            }

            case 3: {

                if (numero_ruedas == 16) {

                    System.out.println("Vehiculo de 16 ruedas");
                    break;

                } else if ( numero_ruedas > 2 || numero_ruedas < 4 || numero_ruedas > 4) {

                    boolean vehiculonopermitido = vehiculo && numeroderuedasnopermitidas;

                    System.out.println("El vehiculo tiene menos de 16 ruedas");
                    break;

                }
            }
        }


    }
}