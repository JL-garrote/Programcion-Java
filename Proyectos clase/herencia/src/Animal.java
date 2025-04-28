import java.util.Scanner;

public class Animal {

    String nombre;

    public void dormir() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del perro: ");
        nombre = sc.nextLine();

        String dormir = "a empezado a dormir";

        System.out.println(nombre + " " + dormir + " /" + " " + "el nombre del perro es " + nombre);

        sc.close();
    }
}