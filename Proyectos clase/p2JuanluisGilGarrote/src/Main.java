// Ejercicio Nº2



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaro mis variables una de tipo entero para las opciones y otra de tipo real para las conversiones
         int opcion = 0;
        float milla = 1;
        float kilometros = 1;

        //declaro mi Scanner llamado keyboard(teclado en ingles)
        Scanner keyboard = new Scanner(System.in);

        //un bucle con las opciones
        do {

            System.out.println("Opcion 1/Convertir millas a kilómetros");
            System.out.println("Opcion 2/Convertir kilómetros a millas");
            System.out.println("Opcion 3/salir");

            opcion = keyboard.nextInt();

            //un switch con todas las conversiones
            switch (opcion) {

                case 1: {

                    System.out.println("Introduzca las millas");
                    milla = keyboard.nextInt();
                    kilometros = milla * (float) 1.60934;

                    System.out.println(kilometros);
                    break;
                }

                case 2: {

                    System.out.println("Introduzca los kilometros");
                    milla = keyboard.nextInt();
                    milla = kilometros / (float) 1.60934;

                    System.out.println(milla);
                    break;

                }

                default: {

                    break;

                }
            }

            // la condicion para que se cumpla el bucle
        }while (opcion!=3);
    }
}


//Fin del ejercicio Nº2.

//Ejercicio Nº3
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaro las variables
        int nota = 0;
        float rendimiento = 0;
        int contadordenotas = 0;
        int contador = 0;

        //declaro el Scanner
        Scanner keyboard = new Scanner(System.in);

        //mensaje por pantalla para pedir las 5 notas
        System.out.println("Introduzca la primera nota");

        //bucle do para la entrada de las 5 notas
        do {

            nota = keyboard.nextInt();
            contadordenotas++;
            contador = nota + contador;
            System.out.println("Introduzca la siguiente nota");

        }while (contadordenotas < 5);

        //calculo del rendimiento academico
        rendimiento = contador / (float)contadordenotas;

        //las condiciones if / else if / else con sus respectivos mensajes por pantalla
        if (rendimiento < 50) {

            System.out.println(rendimiento);
            System.out.println("Reprobado");

        } else if (rendimiento >= 50 && rendimiento <= 59) {

            System.out.println(rendimiento);
            System.out.println("Aprobado");

        } else if (rendimiento >= 60 && rendimiento <= 74) {

            System.out.println(rendimiento);
            System.out.println("Regular");

        } else if (rendimiento >= 75 && rendimiento <= 89){

            System.out.println(rendimiento);
            System.out.println("Bueno");

        } else {

            System.out.println(rendimiento);
            System.out.println("Excelente");

        }
    }
}
*/
// Fin del ejercico Nº3.

// Ejercicio Nº4
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaro mis variables
        int lado1 = 0;
        int lado2 = 0;
        int perimetro = 0;
        byte intentos = 10;

        //Declaro mi Scanner
        Scanner keyboard = new Scanner(System.in);

        //Pido los datos
        System.out.println("Introduzca el primer lado");
        lado1 = keyboard.nextInt();

        System.out.println("Introduzca el segundo lado");
        lado2 = keyboard.nextInt();

        //Calculo del perimetro
        perimetro = lado1 + lado2;

        System.out.println(perimetro);

        //Condicion
        if (perimetro < 500) {

            System.out.println("El perimetro es insuficiente");

            //Bucle for por que sabemos cuantas beces se va a repetir
            for (int i = perimetro; intentos > 0; intentos--) {

                System.out.println("Introduzca el primer lado");
                lado1 = keyboard.nextInt();

                System.out.println("Introduzca el segundo lado");
                lado2 = keyboard.nextInt();

                System.out.println("Perimetro insuficiente " +perimetro);

            }

        } else if (perimetro >= 500) {

            System.out.println("El perimetro es " +perimetro);

        }

    }
}
*/
//Fin del ejercicio Nº4