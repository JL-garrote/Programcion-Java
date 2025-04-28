import java.util.Scanner;

public class Producto {

    String nombre;
    float precio;
    int cantidad;
    float descuento;

    Scanner keyboard = new Scanner(System.in);

    public Producto(String nombre, float precio, int cantidad) {

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public void detalles () {

        System.out.println("Nombre: " + nombre + "\nPrecio: " + precio + "\nCantidad: " + cantidad);
        System.out.println();

    }

    public float valorInventario(float valor) {

        valor = precio * cantidad;
        return valor;

    }

    public void descuento() {

        descuento = 0;
        System.out.println("Introduzca el descuento del producto");
        descuento = keyboard.nextFloat();
        descuento -= precio;
        System.out.println("Descuento: " + descuento);

    }
}
