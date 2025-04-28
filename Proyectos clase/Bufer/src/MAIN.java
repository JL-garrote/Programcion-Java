import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) throws IOException {

        //String texto;

        BufferedOutputStream bos = null;

        //Scanner sc = null;

        try {

            //sc = new Scanner(System.in);

            bos = new BufferedOutputStream(new FileOutputStream("datos\\prueba.bin"));

            //texto = sc.nextLine();

            String texto = "Este es un ejemplo de escritura de un archivo en binario";
            byte[] escritura = texto.getBytes(StandardCharsets.UTF_8);
            bos.write(escritura);

        } catch (IOException e) {

            System.err.println(e.getMessage());

        }finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                /*if(sc != null){
                    sc.close();
                }*/
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }

    }
}
