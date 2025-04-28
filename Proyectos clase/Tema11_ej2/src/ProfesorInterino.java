import java.util.Scanner;

public class ProfesorInterino extends Profesor {

    int annio;

    public ProfesorInterino(int annio) {
        this.annio = annio;
    }

    Scanner keyboard = new Scanner(System.in);

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
    void solicitarPlaza() {
        System.out.println("Solicitando plaza");
    }

    @Override
    void revisarConvacatoria() {
        System.out.println("se esta revisando la convocatoria");
    }
}
