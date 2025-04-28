import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();
        TreeSet<Integer> arbol = new TreeSet<>();
        LinkedHashSet<Integer> linkeadoShiquillo = new LinkedHashSet<>();

        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(1);
        numeros.add(2);
        numeros.add(7);

        arbol.add(5);
        arbol.add(3);
        arbol.add(8);
        arbol.add(1);
        arbol.add(2);
        arbol.add(7);

        linkeadoShiquillo.add(5);
        linkeadoShiquillo.add(3);
        linkeadoShiquillo.add(8);
        linkeadoShiquillo.add(1);
        linkeadoShiquillo.add(2);
        linkeadoShiquillo.add(7);

        System.out.println("Hash " + numeros);
        System.out.println("ES UN ARBOL " + arbol);
        System.out.println("ER LINK " + linkeadoShiquillo);
    }
}