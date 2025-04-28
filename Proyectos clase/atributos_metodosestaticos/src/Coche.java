public class Coche {

    String marca;
    String modelo;
    public static int total = 0;
    public static int cochesSinalquilar = 0;

    public Coche(String marca,String modelo) {

        this.marca = marca;
        this.modelo = modelo;

    }

    public void mostrarDetalles() {

        System.out.println("Marca: " + marca + " Modelo: " + modelo);

    }

    /*public void sinAlquilar() {

        cochesSinalquilar++;
        System.out.println("El coche " + marca + " " + "Modelo " + modelo + " no se a alquilado");

    }

    public static void sin (int cochesSinalquilar) {

        System.out.println("El total de coche sin alquiler: " + cochesSinalquilar);

    }*/

    public void Total() {

        total++;
        System.out.println("El coche " + marca + " " + modelo + " " + "ha sido alquilado");

    }

    public static void alquileres(int total) {

        System.out.println("El total de alquileres: " + total);

    }
}