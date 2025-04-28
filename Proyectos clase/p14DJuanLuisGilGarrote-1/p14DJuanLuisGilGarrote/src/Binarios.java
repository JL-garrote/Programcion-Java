import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Binarios {

    private int b;
    private float c;
    private double d;
    private String e;

    FileInputStream fis = null;
    DataInputStream dis = null;

    BufferedOutputStream bos = null;

    Scanner keyboard = new Scanner(System.in);

    public void menuBinario() throws IOException {

        String archivo = "MiArchivoBinario.bin";
        int opciones;

        do {

            System.out.println("1.| Escribir un archivo Binario");
            System.out.println("2.| Leer un archivo Binario");
            System.out.println("3.| Salir");
            opciones = keyboard.nextInt();

            switch (opciones) {

                case 1: {

                    bos = new BufferedOutputStream(new FileOutputStream(archivo));

                    opciones = 0;

                    System.out.println("Introduzca el numero de datos que quiera escribir");
                    opciones = keyboard.nextInt();

                    for(int i = 0; i < opciones;i++){

                        System.out.println("Introduzca un numero entero");
                        b = keyboard.nextInt();
                        bos.write(b);

                        System.out.println("Introduzca un numero flotante/decimal");
                        c = keyboard.nextFloat();
                        bos.write((int) c);

                        System.out.println("Introduzca un numero decimal");
                        d = keyboard.nextDouble();
                        bos.write((int) d);

                        System.out.println("Introduzca una cadena de texto");
                        e = keyboard.next();
                        byte[] cadena = e.getBytes(StandardCharsets.UTF_8);
                        bos.write(cadena);

                    }

                    break;
                }

                case 2: {

                    System.out.println("Introduzca el nombre del archivo sin la extension");
                    archivo = keyboard.next();

                    fis = new FileInputStream(archivo + ".bin");
                    dis = new DataInputStream(fis);

                    int numeroEntero = dis.readInt();
                    float numeroFlotante = dis.readFloat();
                    double numeroDecimal = dis.readDouble();
                    String cadenadeTexto = dis.readUTF();

                    while (fis.read() != -1){
                        System.out.println("Entero " + numeroEntero);
                        System.out.println("Flotante " + numeroFlotante);
                        System.out.println("Decimal " + numeroDecimal);
                        System.out.println("Cadena de texto " + cadenadeTexto);
                    }

                    break;
                }

                case 3:{
                    break;
                }

            }
        }while (opciones != 3);
    }
}