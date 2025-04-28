package Ejercicio2;

abstract class Animal {

    String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    abstract void comer();

    abstract void dormir();

}
