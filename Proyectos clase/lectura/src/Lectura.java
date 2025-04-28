import java.io.*;

public class Lectura {
    public static void main(String[] args) throws IOException {

        BufferedReader leer = null;
        File archivo = new File("a.txt");

        try{

            leer = new BufferedReader(new FileReader(archivo));

            String linea;
            while ((linea = leer.readLine()) != null){
                System.out.println(linea);
            }

        }catch (Exception e){
            System.err.println(e.getMessage());

        }finally {
            if (leer != null){
                leer.close();
            }
        }
    }
}
