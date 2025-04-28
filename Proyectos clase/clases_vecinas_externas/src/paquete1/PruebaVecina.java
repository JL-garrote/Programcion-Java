package paquete1;

//import paquete2.PruebaExterna;

public class PruebaVecina {
    public static void main(String[] args) {

        ClasePublica a = new ClasePublica();
        //PruebaExterna b = new PruebaExterna();
        ClaseSinModificardor c = new ClaseSinModificardor();

        a.mensaje();
        //b.mensaje();
        c.mensaje();

    }
}


