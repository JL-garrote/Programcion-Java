public class Jugador {

    String nombredejugador;
    String equipodefutbol;
    int edad = 0;

    public Jugador(String nombredejugador, String equipodefutbol, int edad) {

        this.nombredejugador = nombredejugador;
        this.equipodefutbol = equipodefutbol;
        this.edad = edad;

    }

    /*public void mostrarDetalle() {

        System.out.println("Nombre de jugador: " + nombredejugador + "\nEdad: " + edad + "\nEquipo donde juega: " + equipodefutbol);
        System.out.println();

    }*/

    public String toString() {

        return "Nombre de jugador: " + nombredejugador + "\nEdad: " + edad + "\nEquipo donde juega: " + equipodefutbol + "\n";

    }

}
