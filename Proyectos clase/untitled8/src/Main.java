//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        int[] datos = {1, 23, 73, 94, 11, 8, 2, 33}; // 1º. Declaro el array

        ordenacionBurbuja(datos); // 4º. Devuelve los datos de ordenaciónBurbuja

        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]); // 5º. Muestra el resultado de cada vuelta
        }
    }


    public static void ordenacionBurbuja (int[] array) { // 2º. Se pasan aquí los datos declarados del array
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (array[j] < array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }


        }   // 3º. Se realiza la operación
    }
}
