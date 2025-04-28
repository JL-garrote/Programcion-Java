package Ejercicio3;

public abstract class Porducto {

    String nombre;
    double precio;

    public Porducto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void calcular(int cantidadAvender){}
}