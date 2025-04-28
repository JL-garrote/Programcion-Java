package Ejercicio1;

public class Dni {

    String dni;

    void generarDNI(){

        try {

            String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
            int parteNumerica;

            parteNumerica = (int) (Math.random() * 99999999);

            for (int i = 0; i < letra.length; i++) {

                int temp = parteNumerica % 23;

                if (temp == i) {
                    dni = parteNumerica + letra[i];
                }
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
