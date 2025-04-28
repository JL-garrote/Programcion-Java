import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File archivo;
        PrintWriter escritura = null;
        BufferedReader entrada = null;
        Scanner keyboard;

        try {

            archivo = new File("Ejemplo_Escritura.txt");

            if (archivo.exists()) {

                try{

                    System.out.println("El archivo existe");
                    escritura = new PrintWriter(archivo);
                    keyboard = new Scanner(System.in);

                    String[] texto = new String[20];

                    System.out.println("Escribe el archivo de texto");
                    for (int i = 0; i < texto.length; i++) {
                        texto[i] = keyboard.nextLine();
                        escritura.println(texto[i]);

                        if(texto[i].contains("finalizar_texto")){

                            entrada = new BufferedReader(new FileReader(archivo));
                            String linea;

                            while((linea = entrada.readLine()) != null){
                                System.out.println(linea);
                            }

                        }
                    }

                    /*
                    escritura.println("Nombre:juan luis");
                    escritura.println("Asignatura:programacion");
                    escritura.println("nota: 7");
                    */

                }catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("No se puede escribir el texto");
                }catch (InputMismatchException e) {
                    System.err.println(e.getMessage());
                }finally {

                    try{

                        if (escritura != null){
                            escritura.close();
                        }

                        if (entrada != null){
                            entrada.close();
                        }

                    }catch (Exception e){
                        System.err.println(e.getMessage());
                    }

                }
            }

            entrada = new BufferedReader(new FileReader(archivo));
            String linea;

            while((linea = entrada.readLine()) != null){
                System.out.println(linea);
            }

        }catch (FileNotFoundException e) {
            System.err.println("No se encontro el archivo");
        } catch (IOException e){
            System.err.println(e.getMessage());
        }finally {
            if(entrada != null){
                entrada.close();
            }
        }
    }
}