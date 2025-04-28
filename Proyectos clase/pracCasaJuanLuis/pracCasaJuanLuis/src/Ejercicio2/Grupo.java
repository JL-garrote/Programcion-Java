package Ejercicio2;

public class Grupo {

    static int tamannio = 5;
    public String[] alumnos = new String[tamannio];

    public void anadirAlumno(String nombre) throws Exception{

        try {

            for (int i = 0; i < alumnos.length; i++) {

                if (alumnos[i] == null) {
                    alumnos[i] = nombre;
                }

                if(alumnos[i].length() <= 1){
                    throw new Exception("El espacio esta ocupado");
                }

            }

        }catch (IndexOutOfBoundsException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void eliminarAlumno(int posicion) throws Exception{

        try {

            for (int i = 0; i < alumnos.length; i++) {

                if (alumnos[i] == null) {
                    throw new Exception(" Posicon vacia");
                }

                if (i == posicion) {
                    alumnos[i] = null;
                }
            }

        }catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void modificarAlumno(String nombre,int posicion) throws IllegalArgumentException{

        try {

            for (int i = 0; i < alumnos.length; i++) {

                if (alumnos[i] == null) {
                    throw new IllegalArgumentException(" Posicon vacia");
                }

                if (i == posicion) {
                    alumnos[i] = nombre;
                }
            }

        }catch (NullPointerException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}