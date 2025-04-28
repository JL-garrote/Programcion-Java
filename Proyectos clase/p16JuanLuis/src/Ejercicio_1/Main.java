package Ejercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MisPacientes pacientes = new MisPacientes();
        Scanner keyboard = new Scanner(System.in);

        int opciones;
        boolean valido = false;

        do {
            try {
                do {
                    System.out.println("Recepción de nuevo paciente");
                    System.out.println("Alta del paciente");
                    System.out.println("Ingreso del paciente");
                    System.out.println("Listado de pacientes");
                    System.out.println("Listado de pacientes ingresados");
                    System.out.println("Salir");

                    opciones = keyboard.nextInt();

                    switch (opciones) {

                        case 1: {
                            pacientes.registro();
                            break;
                        }

                        case 2: {
                            pacientes.darAlta();
                            break;
                        }

                        case 3: {
                            pacientes.ingreso();
                            break;
                        }

                        case 4: {
                            pacientes.lista();
                            System.out.println();
                            break;
                        }

                        case 5: {
                            pacientes.listaIngreso();
                            System.out.println();
                            break;
                        }

                        case 6: {
                            System.exit(1);
                            break;
                        }
                    }

                } while (opciones != 7);
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                valido = true;
                keyboard.nextLine();
            }
        } while (!valido);
    }
}