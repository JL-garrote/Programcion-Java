package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Perro as = new Perro("arturo","pastor",10);
        Gato bd = new Gato("callejero","microsoft",90);

        as.comer();
        as.dormir();
        as.anestesiar();
        as.cepillar();
        as.jugar("pelota");

        bd.comer();
        bd.dormir();
    }
}
