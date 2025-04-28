public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[]{6,5,4,3,8,9,7,2,1,10,11,22,44,55,66,77,5,4,34,344,43,55,49,646,675};

        for(int i = 0; i < numeros.length; i++){

            System.out.println(numeros[i]);

        }

        System.out.println("Despues del metodo");

        //ordenacionBurbuja(numeros);
        //ordenacionSeleccion(numeros);
        insercion(numeros);

        for(int i = 0; i < numeros.length; i++){

            System.out.println(numeros[i]);

        }

    }

   /* public static void ordenacionBurbuja(int[] array) {

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 -i; j++) {

                if (array[j] < array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }*/
   /* public static void ordenacionSeleccion(int[] array) {

        int n = array.length;

        for (int i =0; i < n; i++){

            int miniIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (array[j] < array[miniIndex]){

                    miniIndex = j;

                }
            }

            int temp = array[miniIndex];
            array[miniIndex] = array[i];
            array[i] = temp;

        }

    }*/

    public static void insercion (int[] array){

        int n = array.length;

        for(int i = 1; i < n; i++) {

            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key) {

                array[j+1] = array[j];
                j = j - 1;

            }

            array[j+1] = key;

        }

    }
}