package paquete1;

public class ClaseVecina {
    public static void main(String[] args) {

        ClaseMienbro mienbro = new ClaseMienbro();

        mienbro.soyDefecto();
        mienbro.soyPublico();
        //mienbro.soyPrivado(); Como es un metodo privado no puedes acceder a el desde otra clase.

    }
}
