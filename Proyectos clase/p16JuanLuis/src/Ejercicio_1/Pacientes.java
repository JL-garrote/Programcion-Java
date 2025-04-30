package Ejercicio_1;

public class Pacientes {

    String nombre;
    String apellidos;
    String dni;
    String enfermedad;
    String tratamiento;
    boolean ingresado = false;

    public Pacientes(String nombre, String apellidos, String dni, String enfermedad, String tratamiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.enfermedad = enfermedad;
        this.tratamiento = tratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public boolean isIngresado() {
        return ingresado;
    }

    public void setIngresado(boolean ingresado) {
        this.ingresado = ingresado;
    }
}

}