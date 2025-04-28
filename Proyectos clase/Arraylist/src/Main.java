import java.util.ArrayList;

public class Main {

    static ArrayList<String> frutas = new ArrayList<>();

    public static void main(String[] args) {

        String fruta;

        frutas.add("a");
        frutas.add("h");
        frutas.add("d");
        frutas.add("f");
        frutas.add("y");

        for(int i = 0; i < frutas.size();i++) {
            System.out.println(frutas.get(i));
        }

        introducirPrincipio();
        eliminarPosicion();
        eliminarEmBuclePosicion();

    }

    public static void eliminarPosicion() {

        System.out.println();
        System.out.println("Elimina la posicion indicada");
        frutas.remove(frutas.get(1));

        System.out.println("Lista actualizada");
        for (int i = 0;i < frutas.size();i++){
            System.out.println(frutas.get(i));
        }
    }

    public static void eliminarEmBuclePosicion() {

        System.out.println();
        System.out.println("Eliminacion en bucle");
        for(int i = 0; i < frutas.size();i++){
            System.out.println(frutas);
            frutas.remove(frutas.get(i));
        }

        System.out.println("Lista actualizada");
        for (int i = 0;i < frutas.size();i++){
            System.out.println(frutas.get(i));
        }
    }

    public static void introducirPrincipio() {

        System.out.println();
        System.out.println("Añadir a la primera posicion");
        frutas.addFirst("Pera");

        System.out.println(frutas.size());
    }
}