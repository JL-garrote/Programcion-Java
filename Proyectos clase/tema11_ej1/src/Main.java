import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gasolina;

        Scanner keyboard = new Scanner(System.in);

        Coche audi = new Coche(0);

        audi.conducir();

        System.out.println("Ingrese la cantidad de combustible que quiera tener en el vehiculo");
        gasolina = keyboard.nextInt();

        audi.repostar(gasolina);

        audi.conducir();
        keyboard.close();

    }
}
