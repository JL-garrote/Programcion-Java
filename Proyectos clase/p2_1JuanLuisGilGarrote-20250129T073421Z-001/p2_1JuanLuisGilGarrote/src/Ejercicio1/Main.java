package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        FormatoDigital pelicula1 = new FormatoDigital(32, 1, "fast", "20-01-2014");
        FormatoDigital pelicula2 = new FormatoDigital(3562, 6, "sad", "20-01-2014");

        FormatoFisico fisico2 = new FormatoFisico(3257, 9, "furius", "16-08-2004");
        FormatoFisico fisico = new FormatoFisico(123, 4, "HARRY", "19-04-1999");

        for (int i = 0; i < 20; i++) {

            pelicula1.esComprable();
            pelicula1.comprar(pelicula1.compra);

            pelicula2.esComprable();
            pelicula2.comprar(pelicula2.compra);

            System.out.println();

        }

        fisico.prestar();
        fisico.devolver();
        fisico.estaPrestado();

        System.out.println();
        fisico2.estaPrestado();
        fisico2.prestar();
        fisico2.devolver();

    }
}
