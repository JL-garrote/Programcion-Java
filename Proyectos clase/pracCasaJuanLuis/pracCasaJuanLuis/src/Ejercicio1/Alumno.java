package Ejercicio1;

public class Alumno {

    String nombre;
    String apellidos;

    Dni a = new Dni();

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        a.generarDNI();
    }

    public void comprabarNombre() throws IllegalArgumentException {

        char[] letras = nombre.toCharArray();

        try {

            if(letras.length < 3 || letras.length > 25){
                nombre = null;
                throw new IllegalArgumentException("Nombre invalido");
            }

        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void comprabarApellido() throws IllegalArgumentException {

        char[] letras = apellidos.toCharArray();

        try {

            if(letras.length < 3 || letras.length > 25){
                apellidos = null;
                throw new IllegalArgumentException("Apellidos invalido");
            }

        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        return "EL alumno llamado " + nombre + " con apellido " + apellidos + " con DNI " + a.dni;
    }
}