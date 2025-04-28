import java.util.Scanner;

public class Main {
    public enum vehiculos {

        COCHE("KM/H: 120 / Vehiculo de cuatro ruedas"),
        MOTO("KM/H: 120 / Vehiculo de dos ruedas"),
        CAMION("KM/H: 90 / Vehiculo de 16 ruedas");

        private String descripcion;

        vehiculos(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }
    public static void main(String[] args) {

        String opcion;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el vehiculo o todos");
        opcion = keyboard.nextLine().toUpperCase();

        switch (opcion) {

            case "COCHE": {
                System.out.println(vehiculos.COCHE + " " + vehiculos.COCHE.getDescripcion());
                break;
            }

            case "MOTO": {
                System.out.println(vehiculos.MOTO + " " + vehiculos.MOTO.getDescripcion());
                break;
            }

            case "CAMION": {
                System.out.println(vehiculos.CAMION + " " +vehiculos.CAMION.getDescripcion());
                break;
            }

            default: {
                vehiculos[] transporte = vehiculos.values();

                for (int i = 0; i < transporte.length; i++) {
                    System.out.println(transporte[i] + " " + transporte[i].getDescripcion());
                }
            }
        }
    }
}