/*Ejercicio 2 y 3 son dos ejercicios diferentes pero lo has unido.Realiza una modificacion poniendo los ejercicios por separado
 * y que cumpla lo indicado.Modificar los errores para que no salga el error de java,solamente el error propio*/

package Ejercicio1;

public class Ejecutable {
    public static void main(String[] args) {

        try {

            Alumno medac = new Alumno("mhff","gffff");
            medac.comprabarNombre();
            medac.comprabarApellido();
            System.out.println(medac.toString());

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
