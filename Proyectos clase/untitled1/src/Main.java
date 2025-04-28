import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  for (int i = 0; i <10; i++) {
            System.out.println("ejecutado");
        }*/

        int lado = 0;
        int area = 0;
        int numeropar = 0;
        int opcion = 0;
        int contador = 0;


        Scanner keyboard = new Scanner(System.in);

        do {

            System.out.println("opcion 1/Solicitar el lado de un cuadrdo y mostrar el área del cuadrado");
            System.out.println("opcion 2/Solicitar un numero por pantalla e indicar si el numero es primo");
            System.out.println("opcion 3/Salir del programa");
            System.out.println("opcion 4/solicitar numeros pares");

            opcion = keyboard.nextInt();

            switch (opcion) {

                case 1: {

                    System.out.println("Introduce el valor del lado");
                    lado = keyboard.nextInt();
                    area = lado * lado;
                    System.out.println("El valor del area es " + area);
                    break;

                }

                case 2: {

                    System.out.println("Introduce el numero");
                    numeropar = keyboard.nextInt();

                    if (numeropar % 2 == 0) {
                        System.out.println("El numero es par");
                    } else {
                        System.out.println("El numero es impar");
                    }

                    break;

                }

                case 3: {
                    System.out.println("Vete ar carajo churrita");
                    break;
                }

                case 4: {

                    numeropar = keyboard.nextInt();

                    while (numeropar > 0) {

                        if (numeropar % 2 == 0) {

                            System.out.println("numero par encntrado " +numeropar);
                            numeropar--;
                            contador++;

                        } else  {

                            numeropar--;

                        }

                    }
                    System.out.println("los pares son " +contador);
                }

                default: {

                }

            }

         /*  if (opcion == 1) {

               System.out.println("Introduce el valor del lado");
               lado = keyboard.nextInt();
               area = lado * lado;
               System.out.println("El area de un cuadrado " +area);

           } else if (opcion == 2) {

               System.out.println("Introduce el numero");
               numeropar = keyboard.nextInt();

                    if ( numeropar %2 == 0) {
                        System.out.println("El numero es par");
                    } else {
                        System.out.println("el numero es impar");
                    }

           } else if (opcion == 3){

               System.exit(1);

           } else {

               System.out.println("EL numero es incorecto ");

           }*/

        } while (opcion != 3);

    }

    public static int n (int numero1, int numero2) {

        Scanner keyboard = new Scanner(System.in);

        numero1 = keyboard.nextInt();
        numero2 = keyboard.nextInt();

        int resultado = (numero1 + numero2);

        return resultado;

    }

}