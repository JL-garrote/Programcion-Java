import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] movientos;
        int[] longitud = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] casilla = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String pieza;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca la pieza que quiere mover");

        pieza = keyboard.nextLine();
        pieza = pieza.toLowerCase();

        for(int i = 0; i < longitud.length; i++){
            for(int j = 0; j < casilla.length; j++){

                System.out.print(longitud[i] + casilla[j] + " ");

            }
            System.out.println();
        }

        if(pieza.equals("peon")) {



        } else if(pieza.equals("torre")) {



        } else if(pieza.equals("caballo")) {



        }else if(pieza.equals("alfil")) {



        } else if(pieza.equals("rey")) {



        }else {



        }
    }

    public static void peon(int[][] movimiento) {

        movimiento = new int[movimiento.length][movimiento[0].length];
        int longitud = 0;
        int tablero = 0;
        String posicion;

        Scanner keyboard = new Scanner(System.in);

        posicion = keyboard.nextLine();
        posicion = posicion.toLowerCase();

        for(int i = 0; i < movimiento.length; i++){
            for(int j = 0; j < movimiento[0].length; j++){

                switch (posicion) {

                    case "a1" ,"a2" ,"a3","a4","a5","a6","a7","a8": {

                        if(posicion ==) {

                        }

                    }

                }

            }
        }
    }

    public static void torre(int[][] movimiento) {

    }

    public static void caballo(int[][] movimiento) {

    }

    public static void alfil(int[][] movimiento) {

    }

    public static void rey(int[][] movimiento) {

    }

    public static void reina(int[][] movimiento) {

    }
}