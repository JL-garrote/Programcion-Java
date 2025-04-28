package paquete2;

import paquete1.ClaseMienbro;

public class ClaseExterna {
    public static void main(String[] args) {

        ClaseMienbro mienbro = new ClaseMienbro();

        mienbro.soyPublico();
        //mienbro.soyDefecto(); Como es un metodo por defecto de otro paquete no nos deja usarlo fuera de ese paquete
        //mienbro.soyPrivado(); Como es un metodo privado no puedes acceder a el desde otra clase o paquete.

    }


}
