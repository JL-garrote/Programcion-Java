package Ejercicio2;

public class Gato extends Animal{

    String nombre;
    String raza;
    int anios;

    public Gato(String nombre, String raza, int anios){
        super(raza);
        this.nombre = nombre;
        this.anios = anios;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " esta durmiendo");
    }
}
