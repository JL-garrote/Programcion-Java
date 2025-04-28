import java.util.LinkedList;

public class Main {

    static LinkedList<String> ciudades = new LinkedList<>();

    public static void main(String[] args) {

        ciudades.add("Cordoba");
        ciudades.add("Sevilla");
        ciudades.add("Malaga");
        ciudades.add("Antequera");

        introducir();
        eliminar();

    }

    public static void introducir(){
        ciudades.addFirst("Palma del rio");
        ciudades.addLast("Cabra");

        System.out.println(ciudades);

    }

    public static void eliminar() {

        ciudades.removeFirst();
        ciudades.removeLast();

        System.out.println(ciudades);
        System.out.println("La primera ciudad es " + ciudades.get(0));

    }
}