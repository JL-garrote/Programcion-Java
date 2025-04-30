package Ejercicio_2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    static LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();
    static ArrayList<String> palabreria = new ArrayList<>();
    static Scanner keyboard = new Scanner(System.in);
    static int longitud;
    static String palabras;

    public static void main(String[] args) {
        mapa();
        System.out.println(mapa);
    }

    static void mapa() {

        System.out.println("Introduzca palabras \nIntroduzca exit para salir");
        do {

            palabras = keyboard.next();
            longitud = palabras.length();

            switch (palabras) {

                case "exit": {
                    break;
                }

                default: {
                    palabreria.add(palabras);
                    mapa.put(longitud, String.valueOf(palabreria));
                    break;
                }
            }

        }while (!palabras.equals("exit"));
    }
}