abstract class Profesor implements Especialidad{

    String especialidadDeProfesor = especialidad();
    String descaripcionDeEspecialidad = descripcion();

    abstract void solicitarPlaza();

    abstract void revisarConvacatoria();

}
