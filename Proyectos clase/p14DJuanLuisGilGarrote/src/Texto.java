import java.io.*;
import java.util.Scanner;

public class Texto {

    private String archivo;
    private int opciones;

    public void menuTexto() throws IOException {

        File archi = new File(archivo + ".txt");

        FileReader fr = null;
        BufferedReader br = null;

        PrintWriter pr = null;
        FileWriter fw = null;

        Scanner keyboard = new Scanner(System.in);

        try {

            System.out.println("Introduzca el archivo sin su extension");
            archivo = keyboard.next();

            if(archi.exists()){

                try {

                    do {
                        System.out.println("1.| Leer archivo de texto");
                        System.out.println("2.| Escribir archivop de texto");
                        System.out.println("3.| Salir");

                        opciones = keyboard.nextInt();

                        switch (opciones) {

                            case 1: {
                                fr = new FileReader(archivo + ".txt");
                                br = new BufferedReader(fr);

                                String linea;
                                while ((linea = br.readLine()) != null) {
                                    System.out.println(linea);
                                }

                                break;
                            }

                            case 2: {
                                System.out.println("Introduce la ruta del archivo");
                                archivo = keyboard.next();

                                pr = new PrintWriter(archivo + ".txt");
                                fw = new FileWriter(archivo + ".txt");

                                String escribir;
                                System.out.println("Primer metodo de escritura");
                                escribir = keyboard.next();

                                pr.print(escribir);

                                System.out.println("Segundo metodo de escritura");
                                escribir = keyboard.next();

                                fw.write(escribir);

                                break;
                            }

                            case 3: {
                                break;
                            }
                        }

                    } while (opciones != 3);

                }catch (FileNotFoundException e){
                    System.err.println("Error");
                }

            }else if (archi.createNewFile()) {

                try {

                    do {
                        System.out.println("1.| Leer archivo de texto");
                        System.out.println("2.| Escribir archivop de texto");
                        System.out.println("3.| Salir");

                        opciones = keyboard.nextInt();

                        switch (opciones) {

                            case 1: {
                                System.out.println("Introduzca el archivo sin su extension");
                                archivo = keyboard.next();

                                fr = new FileReader(archivo + ".txt");
                                br = new BufferedReader(fr);

                                String linea;
                                while ((linea = br.readLine()) != null) {
                                    System.out.println(linea);
                                }

                                break;
                            }

                            case 2: {
                                System.out.println("Introduce la ruta del archivo");
                                archivo = keyboard.next();

                                pr = new PrintWriter(archivo + ".txt");
                                fw = new FileWriter(archivo + ".txt");

                                String escribir;

                                escribir = keyboard.next();

                                pr.print(escribir);

                                escribir = keyboard.next();

                                fw.write(escribir);

                                break;
                            }

                            case 3: {
                                break;
                            }
                        }
                    } while (opciones != 3);

                } catch (Exception e) {
                    System.err.println("Error");
                }
            }
        }catch (FileNotFoundException e){
            System.err.println("No se pudo encontrar el archivo");
        }catch (NullPointerException e){
            System.err.println("Apuntando a una direccion nula");
        }catch (IOException e){
            System.err.println("Error");
        }finally {
            if(fw != null){
                fw.close();
            }
            if(pr != null){
                pr.close();
            }
            if(fr != null){
                fr.close();
            }
            if (br != null){
                br.close();
            }
        }
    }
}