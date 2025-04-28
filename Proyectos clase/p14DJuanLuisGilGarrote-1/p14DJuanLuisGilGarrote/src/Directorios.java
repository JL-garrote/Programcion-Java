import java.io.File;
import java.util.Scanner;

public class Directorios {

    private String directorio;
    private int opciones;
    private String ruta;

    Scanner keyboard = new Scanner(System.in);

    public void menuDirectorios() {

        try {

            do {
                System.out.println("1.| Creacion de directorio padre");
                System.out.println("2.| Creacion de directorio hijo");
                System.out.println("3.| Salir");

                opciones = keyboard.nextInt();

                switch (opciones) {
                    case 1: {

                        System.out.println("Introduzca el nombre del directorio");
                        directorio = keyboard.next();

                        File dir = new File(directorio);

                        if (dir.exists()) {
                            System.out.println("El directorio ya existe");
                        } else {
                            if (dir.mkdir()) {
                                System.out.println("El directorio se ha creado correctamente");
                            } else {
                                System.out.println("No se ha podido crear el directorio");
                            }
                        }

                        break;
                    }

                    case 2: {

                        File subDir = new File(ruta + "\\" +directorio);

                        System.out.println("Introduzca la ruta del archivo");
                        ruta = keyboard.next();

                        if (subDir.exists()) {
                            System.out.println("El directorio ya existe");
                        } else {
                            System.out.println("Introduzca el nombre del directorio");
                            directorio = keyboard.next();
                            if (subDir.mkdirs()) {
                                System.out.println("El directorio se ha creado correctamente");
                            } else {
                                System.out.println("No se ha podido crear el directorio");
                            }
                        }

                        break;
                    }
                    case 3: {
                        break;
                    }
                }
            } while (opciones != 3);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}