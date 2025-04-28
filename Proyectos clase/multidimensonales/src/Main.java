import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] mitabla = new int[3][3];

       //Scanner keyboard = new Scanner(System.in);
        int a = 1;

        for (int i = 0; i < mitabla.length; i++) {

            for (int j = 0; j < mitabla[i].length; j++) {

                        mitabla[i][j] = a;
                        //mitabla[i][j] = keyboard.nextInt();
                        //System.out.print(mitabla[i][j] + " ");
                        a++;

            }

            System.out.println();
        }

        for (int i = 0; i < mitabla.length; i++) {

            for (int j = 0; j < mitabla[i].length; j++) {

                System.out.print(mitabla[i][j] + " ");

            }
            System.out.println();
        }
    }
}