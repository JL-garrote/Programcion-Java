public class Main {
    public static void main(String[] args) {

        int[] alejando = new int[10];

        for (int i = 0; i < alejando.length; i++) {

            alejando[i] = i + 1;

        }

        if (lineal(alejando,8)) {

            System.out.println("el numero a zio encontrao");

        } else {

            System.out.println("el numero no a zio encontrao");

        }

    }
    public static boolean lineal (int[] alejandro, int elecccion) {

        boolean elemento = false;

        for (int i = 0; i < alejandro.length; i++) {

            if (alejandro[i] == elecccion) {

                elemento = true;

            }

        }

        return elemento;
    }
}