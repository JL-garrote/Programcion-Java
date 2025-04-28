import java.util.ArrayList;
import java.util.Scanner;

public class MisAnimales {

    ArrayList<Animal> bisho = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);

    private String nombre;

    void anadirAnimal(Animal a) {
        bisho.add(a);
    }

    void eliminarAnimal() {

        System.out.println("Introduzca el nombre del animal");
        nombre = keyboard.next();

        for (int i = 0; i < bisho.size(); i++){
            if(bisho.get(i).getNombre().equals(nombre)){
                bisho.remove(i);
            }
        }
    }

    void obtenerInfo() {
        for (Animal d : bisho) {
            System.out.println("El nombre es " + d.getNombre() + " la raza " + d.getRaza() + " el peso es " + d.getPeso() + " y tiene " + d.getEdad() + " años");
        }
    }

    void obtenerRazas() {
        for (Animal d : bisho) {
            System.out.println(d.getRaza());
        }
    }

    void obtenerMedia(Animal a) {

        double media = bisho.size() /a.peso;
        System.out.println("La media es " + media);

    }
}
