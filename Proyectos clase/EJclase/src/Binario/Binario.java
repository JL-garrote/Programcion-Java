/* Crea un programa que escriba un array de enteros (int) en un archivo binario */

package Binario;

import java.io.*;

public class Binario {
    public static void main(String[] args) throws FileNotFoundException {

        String ar = "ad.bin";

        File arshivo = new File(ar);

        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedOutputStream bos = null;

        int[] numerosEscritura = {1,2,3,4};

        try {

            fis = new FileInputStream(arshivo);
            dis = new DataInputStream(fis);

            if(arshivo.exists()){

                try {

                    System.out.println("El archivo existe");

                    bos = new BufferedOutputStream(new FileOutputStream(arshivo));

                    for (int i = 0; i < numerosEscritura.length; i++) {
                        bos.write(numerosEscritura[i]);
                    }


                    for (int i = 0; i < numerosEscritura.length; i++){
                        System.out.println("contiene " + a);
                    }

                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }else {
                throw new FileNotFoundException("Archivo no encontrado");
            }

        }catch (Exception e){

        }finally {

            try {
                if(bos != null){
                    bos.close();
                }
                if(dis != null){
                    dis.close();
                }
                if(fis != null){
                    fis.close();
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}
