public class Main {
    public static void main(String[] args) {

        int[][] mitabla = new int[3][3];

        int mobile = 1;

        for (int i = 0; i < mitabla.length; i++) {

            for (int j = 0; j < mitabla[i].length; j++) {

                mitabla[i][j] = mobile;
                System.out.println(mitabla[i][j] + " ");

                mobile++;

            }
            System.out.println();

        }
    }
}