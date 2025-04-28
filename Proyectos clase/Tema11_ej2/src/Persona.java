import java.util.Scanner;

public class Persona extends Profesor{

    String nombre;
    String apellido;
    String documentoIdentificacion;

    Scanner keyboard = new Scanner(System.in);

    public Persona(String nombre, String apellido, String documentoIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentificacion = documentoIdentificacion;
    }

    @Override
    public String especialidad() {
        especialidadDeProfesor = keyboard.nextLine();
        return especialidadDeProfesor;
    }

    @Override
    public String descripcion() {
        descaripcionDeEspecialidad = keyboard.nextLine();
        return descaripcionDeEspecialidad;
    }

    @Override
    public void solicitarPlaza(){
        System.out.println("Solicitando plaza");
    }

    @Override
    public void revisarConvacatoria(){
        System.out.println("se esta revisando la convocatoria");
    }
}
