import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroX = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        numeroX = keyboard.nextInt();

        System.out.println(tablademultiplicar(numeroX));

    }

    public static int tablademultiplicar(int numeroX) {

        switch (numeroX) {

            //Aqui hago todas las operaciones matimaticas y sacamos el resultado por pantalla
            case 1: {

                int multiplode1 = 1;
                multiplode1 = numeroX * multiplode1;
                System.out.println(multiplode1);

            }

            case 2: {

                int multiplode2 = 2;
                multiplode2 = numeroX * multiplode2;
                System.out.println(multiplode2);

            }

            case 3: {

                int multiplode3 = 3;
                multiplode3 = numeroX * multiplode3;
                System.out.println(multiplode3);

            }

            case 4: {

                int multiplode4 = 4;
                multiplode4 = numeroX * multiplode4;
                System.out.println(multiplode4);

            }

            case 5: {

                int multiplode5 = 5;
                multiplode5 = numeroX * multiplode5;
                System.out.println(multiplode5);

            }

            case 6: {

                int multiplode6 = 6;
                multiplode6 = numeroX * multiplode6;
                System.out.println(multiplode6);

            }

            case 7: {

                int multiplode7 = 7;
                multiplode7 = numeroX * multiplode7;
                System.out.println(multiplode7);

            }

            case 8: {

                int multiplode8 = 8;
                multiplode8 = numeroX * multiplode8;
                System.out.println(multiplode8);

            }

            case 9: {

                int multiplode9 = 9;
                multiplode9 = numeroX * multiplode9;
                System.out.println(multiplode9);

            }

            default: {

                int multiplode10 = 10;
                multiplode10 = numeroX * multiplode10;
                System.out.println(multiplode10);

            }

            System.exit(1);

        }
        return numeroX;

    }
}