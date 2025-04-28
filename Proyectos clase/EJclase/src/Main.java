/* Crea un programa que cuente el numero de lineas que tiene un archivo de texto y saque un mensaje por pantalla */

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String archivo = "MiTexto.txt";
        File archivoF = new File(archivo);

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        RandomAccessFile raf = null;

        try {

            try {

                if (archivoF.exists()) {
                    System.out.println("Existe el archivo");

                    fr = new FileReader(archivoF);
                    br = new BufferedReader(fr);

                    String linea;
                    int contador = 0;
                    while ((linea = br.readLine()) != null) {
                        contador++;
                    }

                    System.out.println("Este archivo tiene este numero de lineas: " + contador);

                    fw = new FileWriter("ContadorLineas.txt");
                    fw.write("Este archivo tiene este numero de lineas: " + contador + "\n");

                    try {

                        if (archivoF.exists()) {
                            System.out.println("El archivo existe");

                            raf = new RandomAccessFile(archivoF, "r");

                            while ((linea = raf.readLine()) != null) {
                                if (linea.toLowerCase().contains(".")) {
                                    System.out.println(linea);
                                }
                            }

                        } else {
                            throw new Exception("Error");
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                } else {
                    throw new Exception("Error");
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {

            try {
                if(br != null){
                    br.close();
                }
                if(fr != null) {
                    fr.close();
                }
                if(fw != null){
                    fw.close();
                }
                if(raf != null){
                    raf.close();
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
