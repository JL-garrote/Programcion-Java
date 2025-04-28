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
                dni = keyboard.next();
            } while (dni.length() < 9);

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

        }catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    boolean existe(String dni) {

        boolean existe = false;

        for (Pacientes a : personas) {
            if (a.getDni().equalsIgnoreCase(dni)) {
                existe = true;
            }
        }
        return existe;
    }

    void darAlta() {

        System.out.println("Introduzca el documento de identificacion del paciente");
        do {
            dni = keyboard.next();
        } while (dni.length() < 9);

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                personas.remove(i);

            }
        }
    }

    void ingreso() {

        Pacientes a = new Pacientes(nombre, apellidos, dni, enfermedad, tratamiento);
        System.out.println("Introduzca el documento de identificacion del paciente");
        do {
            dni = keyboard.next();
        } while (dni.length() < 9);

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                a.setIngresado(true);
            }
        }
    }

    void listaIngreso() {

        for (Pacientes a : personas) {
            if(a.getDni().equals(true)) {
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