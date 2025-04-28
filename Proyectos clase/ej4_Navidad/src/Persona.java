public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private final String sexo = "H" ;
    private double peso;
    private double altura;

    public Persona(){}

    public Persona(String nombre, int edad , String sexo){

        this.nombre = nombre;
        this.edad = edad;
        sexo = "H";

    }

    public Persona(String nombre, int edad, String sexo, String dni, double peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        sexo = "H";
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;

    }

    public void calcularIMC(double peso, double altura){}
}
