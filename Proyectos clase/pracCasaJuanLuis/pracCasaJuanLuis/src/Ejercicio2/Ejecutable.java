package Ejercicio2;

public class Ejecutable {
    public static void main(String[] args) throws Exception {

        try {

            Grupo medac = new Grupo();

            medac.anadirAlumno("pedro");

            for (int i = 0; i < medac.alumnos.length; i++) {
                System.out.println(medac.alumnos[i]);
            }

            medac.modificarAlumno("javier", 1);
            medac.modificarAlumno("PAU", 2);
            medac.modificarAlumno("Alex", 4);

            System.out.println();
            for (int i = 0; i < medac.alumnos.length; i++) {
                System.out.println(medac.alumnos[i]);
            }

            medac.eliminarAlumno(3);

            System.out.println();
            for (int i = 0; i < medac.alumnos.length; i++) {
                System.out.println(medac.alumnos[i]);
            }

            medac.modificarAlumno("javier", 3);

            medac.eliminarAlumno(3);

        }catch (IllegalArgumentException e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
