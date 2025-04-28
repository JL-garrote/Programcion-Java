import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Declaracion de los arrays
        float[] nota = new float[10];
        String[] nombres = new String[10];
        String[] resultado = {"Suspenso","Bien","Notable","Sobresaliente"};

        Scanner keyboard = new Scanner(System.in);
//Primer bucle para escribir los dos primeros arrays
        for(int i = 0; i < nota.length; i++){

            System.out.println("Ingrese el nombre la nota del alumno: ");
            nota[i] = keyboard.nextFloat();
//Comprobacion por si los valores salen del rango
            while(nota[i] < 0 || nota[i] > 10){

                System.out.println("Nota no valida vuelva a ingresar la nota del alumno");
                nota[i] = keyboard.nextFloat();

            }

            System.out.println("Ingrese el nombre del alumno: ");
            nombres[i] = keyboard.next();

        }
//Comprobacion de que todo se haya escrito bien
        for(int i = 0; i < nota.length; i++){

            System.out.println(nombres[i]);
            System.out.println(nota[i]);

        }
//Bucle con la comprobacion de las notas y saca su resultado
        for(int i = 0; i < nota.length; i++){

            if(nota[i] <= 4.99) {

                System.out.println("El alumno " + nombres[i] + "con nota " + nota[i] + " a: " + resultado[0]);

            } else if (nota[i] > 5 && nota[i] < 6.99) {

                System.out.println("El alumno " + nombres[i] + "con nota " + nota[i] +" a: " + resultado[1]);

            } else if (nota[i] > 7 && nota[i] < 8.99) {

                System.out.println("El alumno " + nombres[i] + "con nota " + nota[i] + " a: " + resultado[2]);

            }else {

                System.out.println("El alumno " + nombres[i] + "con nota " + nota[i] + " a: " + resultado[3]);

            }
        }
    }
}