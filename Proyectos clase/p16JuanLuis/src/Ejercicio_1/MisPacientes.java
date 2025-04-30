package Ejercicio_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MisPacientes {

    private static String nombre;
    private static String apellidos;
    private static String dni;
    private static String enfermedad;
    private static String tratamiento;
    private static int numeros;
    private static String letra;

    ArrayList<Pacientes> personas = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);

    void registro() {
        try {

            System.out.println("Ingrese el nombre");
            nombre = keyboard.next();

            System.out.println("Ingrese los apellidos");
            apellidos = keyboard.next();

            System.out.println("Ingresa DNI");

            do {
                System.out.println("Ingrese la parte numerica");
                numeros = keyboard.nextInt();
                System.out.println("Ingrese la letra");
                letra = keyboard.next().toUpperCase();

                dni = numeros + letra;
            } while (dni.length() < 9 && numeros < 99999999);

            if (existe(dni)) {
                System.out.println("El paciente ya existe");
                return;
            }

            System.out.println("Ingrese la enfermedad");
            enfermedad = keyboard.next();

            System.out.println("Ingrese el tratamiento");
            tratamiento = keyboard.next();

            Pacientes a = new Pacientes(nombre, apellidos, dni, enfermedad, tratamiento);
            personas.add(a);
        }catch (Exception e) {
            System.err.println("Error en el registro");
        }
    }

    boolean existe(String dni) {
        boolean existe = false;

        for(Pacientes a : personas) {
            if (a.getDni().equalsIgnoreCase(dni)) {
                existe = true;
            }
        }
        return existe;
    }

    void darAlta() {
        try {
            System.out.println("Introduzca el documento de identificacion del paciente");
            do {
                System.out.println("Ingrese la parte numerica");
                numeros = keyboard.nextInt();
                System.out.println("Ingrese la letra");
                letra = keyboard.next().toUpperCase();

                dni = numeros + letra;
            } while (dni.length() < 9 && numeros < 99999999);

            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).getDni().equals(dni)) {
                    personas.remove(i);
                    ;
                }
            }
        }catch (Exception e){
            System.out.println("Error al dar de alta");
        }
    }

    void ingreso() {
        try {
            Pacientes a = new Pacientes(nombre, apellidos, dni, enfermedad, tratamiento);
            System.out.println("Introduzca el documento de identificacion del paciente");
            do {
                System.out.println("Ingrese la parte numerica");
                numeros = keyboard.nextInt();
                System.out.println("Ingrese la letra");
                letra = keyboard.next().toUpperCase();

                dni = numeros + letra;
            } while (dni.length() < 9 && numeros < 99999999);

            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).getDni().equals(dni)) {
                    a.setIngresado(true);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en el ingreso");
        }
    }

    void listaIngreso() {
        for (Pacientes a : personas) {
            if(!a.isIngresado()) {
                System.out.println("El nombre del paciente es " + a.getNombre());
                System.out.println("El apellido del paciente es " + a.getApellidos());
                System.out.println("El documento de identificacion del paciente es " + a.getDni());
                System.out.println("La enfermedad del paciente es " + a.getEnfermedad());
                System.out.println("El tratamiento del paciente es " + a.getTratamiento());
                System.out.println("El paciente esta ingresado");
            }
        }
    }

    void lista() {
        for (Pacientes a : personas) {
            System.out.println("El nombre del paciente es " + a.getNombre());
            System.out.println("El apellido del paciente es " + a.getApellidos());
            System.out.println("El documento de identificacion del paciente es " + a.getDni());
            System.out.println("La enfermedad del paciente es " + a.getEnfermedad());
            System.out.println("El tratamiento del paciente es " + a.getTratamiento());
        }
    }

}