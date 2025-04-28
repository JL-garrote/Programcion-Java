import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0;

        Scanner keyboard = new Scanner(System.in);

        HashMap<Integer,String> elmapa = new HashMap<>();

        elmapa.put(100,"padilla");
        elmapa.put(39,"argos");
        elmapa.put(50,"calzadilla");

        System.out.println("Sacar elemento por pantalla");
        a = keyboard.nextInt();
        System.out.println(elmapa.get(a));

        System.out.println("Eliminar elemento");
        a = keyboard.nextInt();
        elmapa.remove(a);

        for(int i = 0; i < elmapa.size(); i++) {
            System.out.println("Introduce clave");
            a = keyboard.nextInt();
            if(elmapa.containsKey(a)){
                System.out.println(a + " " + elmapa.get(a));
            }
        }

        /* for(int i = 0; i < elmapa.size() -1; i++) {
            System.out.println("Claves " + elmapa.keySet() + " Valores " + elmapa.values());
        } */
    }
}