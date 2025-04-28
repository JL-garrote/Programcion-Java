import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String ruta = "Archivo_busqueda.txt";
        File archivo;
        BufferedReader entrada = null;

        try{
            archivo = new File(ruta);

            if(archivo.exists()){
                System.out.println("Archivo existente");
            }

            entrada = new BufferedReader(new FileReader(archivo));
            String linea;

            while((linea = entrada.readLine()) != null ){
                System.out.println(linea);
            }

        }catch (FileNotFoundException e){
            System.err.println("Archivo no encontrado");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}