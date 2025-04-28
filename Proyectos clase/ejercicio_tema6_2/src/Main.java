public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numeros.length;i++){

            numeros[i] = (int) (Math.random() * 101);

        }

        for (int i = 0; i < numeros.length;i++){

            cuadrado[i] = numeros[i] * numeros[i];

        }

        for (int i = 0; i < numeros.length;i++){

            cubo[i] = numeros[i] * numeros[i] * numeros[i];

        }

        for (int i = 0; i < numeros.length;i++){

            System.out.println(numeros[i] + "    " +cuadrado[i] + "    " +cubo[i]);

        }
    }
}