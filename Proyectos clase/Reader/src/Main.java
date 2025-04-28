import javax.swing.*;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        DataInputStream dis = null;

        try {

            fis = new FileInputStream("datos.bin");
            dis = new DataInputStream(fis);

            int datoEntero = dis.readInt();
            float datoFlotante = dis.readFloat();
            double datoDouble = dis.readDouble();

            while (fis.read() != -1) {
                System.out.println(datoEntero);
                System.out.println(datoFlotante);
                System.out.println(datoDouble);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            fis.close();
            dis.close();
        }
    }
}