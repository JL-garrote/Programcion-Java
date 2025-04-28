public class Persona {

    String nombre;
    String apellido;
    int edad;

    public Persona(String nombre, String apellido, int edad) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public Persona(Persona persona) {

        nombre = persona.nombre;
        apellido = persona.apellido;
        edad = persona.edad;

    }

    public String toString() {

        return nombre + " " + apellido + " " + edad;

    }

    public void setNombre(String nombre1) {

        nombre = nombre1;

    }
}