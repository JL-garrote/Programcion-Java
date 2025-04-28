import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String fichero =  "";
        int opcion;

        File archivo = new File(fichero);

        Binarios meNuBinario = new Binarios();
        Texto ficheroTexto = new Texto();
        Directorios dr = new Directorios();
        Lista lt = new Lista();

        Scanner keyboard = new Scanner(System.in);

        try {

           do {

               System.out.println("1.| Quiere trabajar con archivos binarios");
               System.out.println("2.| Quiere trabajar con archivos de texto");
               System.out.println("3.| Gestion de carpetas");
               System.out.println("4.| Listar todos los archivos de una carpeta");
               System.out.println("5.| Salir");

               opcion = keyboard.nextInt();

               switch (opcion) {

                   case 1: {
                       meNuBinario.menuBinario();
                       break;
                   }

                   case 2: {
                       ficheroTexto.menuTexto();
                       break;
                   }

                   case 3: {
                       dr.menuDirectorios();
                       break;
                   }

                   case 4: {
                       lt.listar();
                       break;
                   }

                   case 5:{
                       break;
                   }
               }

           }while (opcion != 5);

        }catch (NoSuchElementException e){
            System.out.println("No cieres el teclado en otro lado");
        } catch(Exception e) {
            System.err.println("Error en el sistema.");
        }
    }
}