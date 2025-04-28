import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MAIN {
    public static void main(String[] args) throws IOException {

        File file;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            file = new File("a.txt");

            if(file.exists()){
                System.out.println("el archivo exixte");
            }

            /*fr = new FileReader(file);
            int caracteres;
            while ((caracteres = fr.read()) != -1) {
                System.out.print((char) caracteres);
            }*/

            br = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            /*if (fr != null) {
                fr.close();
            }*/
            if (br != null) {
                br.close();
            }
            //File no tiene metodo de cerrado.
        }
    }
}
