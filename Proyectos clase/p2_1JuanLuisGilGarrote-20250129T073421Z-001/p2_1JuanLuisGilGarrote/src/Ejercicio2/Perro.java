package Ejercicio2;

public class Perro extends Animal implements ICuidable{

    String nombre;
    int anios;

    public Perro( String nombre,String raza, int anios){
        super(raza);
        this.nombre = nombre;
        this.anios = anios;
    }

    @Override
    public void comer() {
        System.out.println("El perro de raza " + tipo + " esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro de raza " + tipo + " esta durmiendo");
    }

    @Override
    public void jugar(String juguete) {

        System.out.println("El perro " + nombre + " esta jugando con " + juguete);

    }

    @Override
    public void anestesiar() {
        ICuidable.super.anestesiar();
        System.out.print(" Nombre: " + nombre + " raza: " + tipo + " con la edad de " + anios + " años\n");
    }

    @Override
    public void cepillar() {
        ICuidable.super.cepillar();
    }
}
