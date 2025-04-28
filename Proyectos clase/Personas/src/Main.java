import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        int edad = 0;
        String sexo;
        double peso;
        double altura;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        nombre = keyboard.next();
        System.out.println("Introduce tu edad");
        edad = keyboard.nextInt();
        System.out.println("Introduce tu sexo");
        sexo = keyboard.next();
        System.out.println("Introduce tu peso");
        peso = keyboard.nextDouble();
        System.out.println("Introduce tu altura");
        altura = keyboard.nextDouble();

        Persona carrera = new Persona(nombre,edad,sexo);
        Persona alan = new Persona(nombre,edad,sexo,peso,altura);
        Persona bola = new Persona();

        bola.setNombre("bola");
        bola.setSexo("h");

        carrera.calcularIMC(50,1.70);
        alan.calcularIMC(peso,altura);
        bola.calcularIMC(bola.setPeso(80.0),bola.setAltura(1.6));
        carrera.esMayorDeEdad(edad);
        alan.esMayorDeEdad(edad);
        bola.esMayorDeEdad(bola.setEdad(13));

        System.out.println(carrera.toString());
        System.out.println(alan.toString());
        System.out.println(bola.toString());
    }
}