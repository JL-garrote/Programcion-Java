package Ejercicio_1;

//Se han agrupado las bibliotecas las tenia separadas

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int opcion;
        String frase;
        int entero;

        File archivo = new File("practica14_DAM.bin");

        FileInputStream fis = null;
        DataInputStream dis = null;

        BufferedOutputStream bos = null;

        Scanner keyboard = new Scanner(System.in);

        try {

            do {

                System.out.println("1.| Escritura");
                System.out.println("2.| Lectura");
                System.out.println("3.| Salir");
                opcion = keyboard.nextInt();

                switch (opcion) {

                    case 1: {

                        try {

                            bos = new BufferedOutputStream(new FileOutputStream(archivo));

                            System.out.println("Escriba una cadena de texto");
                            frase = keyboard.next();

                            System.out.println("Introduzca un numero entero");
                            entero = keyboard.nextInt();

                            byte[] escribe = frase.getBytes(StandardCharsets.UTF_8);
                            bos.write(escribe);
                            bos.write(entero);

                            break;

                        } catch (FileNotFoundException e) {
                            System.out.println(e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("error caracter no valido");
                        } catch (Exception e) {
                            System.out.println("Error");
                        }

                    }

                    case 2: {

                        try {

                            fis = new FileInputStream(archivo);
                            dis = new DataInputStream(fis);

                            frase = dis.readUTF();
                            entero = dis.read();

                            while(fis.read() != -1){
                                System.out.println(frase);
                                System.out.println(entero);
                            }

                        } catch (FileNotFoundException e) {
                            System.out.println("Error");
                        }
                    }

                    case 3: {
                        break;
                    }
                }

            } while (opcion != 3);

        }catch (Exception e){
            System.out.println("No se encuentra el archivo");
        }finally {
            if(fis != null){
                fis.close();
            }
            if(dis != null){
                dis.close();
            }
            if(bos != null){
                bos.close();
            }
            keyboard.close();
        }
    }
}
