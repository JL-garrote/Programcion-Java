package Ejercicio2;

public interface ICuidable {

    void jugar(String juguete);

    default void cepillar() {
        System.out.println("Esta siendo cepillado");
    }

    default void anestesiar(){
        System.out.print("El animal ha sido anestesiado");
    }

}
