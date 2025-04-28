import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("miArchivo.bin"));

            bos.write(101);

            FileInputStream fis = new FileInputStream("miArchivo.bin");
            DataInputStream dis = new DataInputStream(fis);

            int valor = dis.readInt();

            while ((valor = dis.read()) != -1) {
                System.out.println(valor);
            }

        }catch (EOFException e) {
            System.out.println(e.getMessage());
        }
    }
}