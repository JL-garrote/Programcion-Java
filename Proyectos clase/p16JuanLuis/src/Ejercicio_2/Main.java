package Ejercicio_2;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String palabras;
        int longitud;

        Scanner keyboard = new Scanner(System.in);
        LinkedHashMap<Integer,String> cuentaLetras = new LinkedHashMap<>();

        System.out.println("Introduca palabras cuando quiera salir introduzca exit");
        do {
            palabras = keyboard.next().toLowerCase();
            longitud = palabras.length();
            cuentaLetras.put(longitud,palabras);
        }while (!palabras.equals("exit"));

        System.out.println(cuentaLetras);
    }
}