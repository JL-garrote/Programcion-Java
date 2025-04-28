public class Main {
    public static void main(String[] args) {

        int[][] tabla = new int[4][5];
        int[] sumaparcialcolumna= new int[5];
        int[] sumaparcialfila= new int[4];
        int sumatotal = 0;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {

                while(tabla[i][j] <= 100){

                    tabla[i][j] = (int) (Math.random() * 1000);

                }

            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {

                System.out.print(tabla[i][j] + "|" + " ");

                sumaparcialcolumna[j] += tabla[i][j];

                sumaparcialfila[i] += tabla[i][j];

            }

            System.out.println(sumaparcialfila[i]);

        }

        for (int i = 0; i < sumaparcialcolumna.length; i++) {

            System.out.print(sumaparcialcolumna[i] + " ");

        }

        for (int i = 0; i < sumaparcialfila.length; i++) {

            sumatotal += sumaparcialfila[i];

        }

        System.out.println("|" + sumatotal);
    }
}