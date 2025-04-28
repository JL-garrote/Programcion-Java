import java.io.File;
import java.util.Scanner;

public class Lista {

    private String ruta;

    public void listar(){

        try {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Introduzca la ruta");
            ruta = keyboard.next();

            File fl = new File(ruta);

            if (fl.exists() && fl.isDirectory()) {
                File[] archivos = fl.listFiles();
                if (archivos != null) {
                    for (int i = 0; i < archivos.length; i++) {
                        File archivo = archivos[i];
                        if (archivos[i].isFile()) {
                            System.out.println("archivo: " + archivo.getName());
                        } else {
                            System.out.println("directorio: " + archivo.getName());
                        }
                    }
                }
            } else {
                System.out.println("No se pudo encontrar");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}