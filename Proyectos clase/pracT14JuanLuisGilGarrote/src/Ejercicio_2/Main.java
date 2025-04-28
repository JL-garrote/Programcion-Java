package Ejercicio_2;

//Se han agrupado las bibliotecas las tenia separadas

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int opcion;
        String contenido;
        int contador = 0;

        Scanner keyboard = new Scanner(System.in);

        File archivo = new File("DAM_practica14.txt");

        FileReader fr = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        RandomAccessFile raf = null;

        try {

            if(archivo.exists()){

                pw = new PrintWriter(archivo);
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                System.out.println("Seleccione una opcion");
                do {

                    System.out.println("1.| Crear y escribir un fichero");
                    System.out.println("2.| Mostrar el contenido del fichero");
                    System.out.println("3.| Buscar una palabra");
                    System.out.println("4.| Salir");

                    opcion = keyboard.nextInt();

                    switch (opcion) {

                        case 1: {

                            try {

                                System.out.println("Ingrese el nombre de la marca del vehiculo");
                                contenido = keyboard.next();
                                pw.println(contenido);

                                System.out.println("Ingrese el año de fabricacion");
                                contenido = keyboard.next();
                                pw.println(contenido);

                                System.out.println("Ingrese el nombre del modelo");
                                contenido = keyboard.next();
                                pw.println(contenido);

                                break;

                            }catch (NullPointerException e){
                                System.out.println("Apuntando a una posicion vacia");
                            }catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                        }

                        case 2: {

                            try {

                                String linea;
                                while ((linea = br.readLine()) != null) {
                                    System.out.println(linea);
                                }

                            }catch (Exception e){
                                System.out.println(e.getMessage());
                            }
                            break;

                        }

                        case 3: {

                            try {

                                System.out.println("Introduzca el nombre del archivo y su extension correcto");
                                contenido = keyboard.next();

                                if(contenido.equals("Coches.txt")){

                                    String linea;
                                    while ((linea = br.readLine()) != null) {
                                        if (linea.toUpperCase().contains("BMW")) {
                                            contador++;
                                            System.out.println(linea);
                                        }
                                    }
                                }else {
                                    throw new FileNotFoundException("El archivo no es el correcto");
                                }

                                break;
                            }catch (Exception e){
                                System.out.println();
                            }
                        }

                        case 4:{
                            break;
                        }
                    }

                }while (opcion != 4);

            }else {
                throw new FileNotFoundException("El archivo no existe");
            }

        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            try {

                if(fr != null){
                    fr.close();
                }
                if(pw != null) {
                    pw.close();
                }
                if(br != null){
                    br.close();
                }

                keyboard.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}