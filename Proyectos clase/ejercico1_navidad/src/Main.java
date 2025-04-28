import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String titularCuenta;
        String opcionCuenta;
        double saldo = 0;
        int opcion = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el titular de la cuenta");
        titularCuenta = keyboard.next().toLowerCase();

        System.out.println("Desea ingresar su saldo\n1.si \t2.no");
        opcion = keyboard.nextInt();

        switch (opcion){

            case 1: {

                System.out.println("Ingrese su saldo");
                saldo = keyboard.nextDouble();
                break;

            }

            case 2: {

                break;

            }
        }

        Cuenta a1 = new Cuenta(titularCuenta);
        Cuenta a2 = new Cuenta(titularCuenta,saldo);

        do {

            System.out.println("1.Cuenta " + a1.titular);
            System.out.println("2.Cuenta " + a2.titular);
            opcion = keyboard.nextInt();

            switch (opcion) {

                case 1: {

                    System.out.println("Que operacion desea realizar \nIngreso \tRetirada \nver Titular y saldo de la cuenta \nCambiar el titular de la cuenta");
                    opcionCuenta = keyboard.next().toLowerCase();

                    switch (opcionCuenta) {

                        case "ingreso": {

                            System.out.println("Saldo: " + a1.getCantidad());

                            saldo = keyboard.nextDouble();

                            while (saldo < 0) {

                                saldo = keyboard.nextDouble();

                            }

                            a1.ingresar(saldo);
                            break;
                        }

                        case "retirada": {

                            System.out.println("Saldo: " + a1.getCantidad());

                            saldo = keyboard.nextDouble();

                            while (saldo < 0) {

                                saldo = keyboard.nextDouble();

                            }

                            a1.retirar(saldo);
                            break;

                        }

                        case "titular": {

                            System.out.println(a1.toString());
                            break;

                        }

                        case "cambio": {

                            System.out.println(a1.getTitular());
                            System.out.println("Ingrese el nombre del nuevo titular de la cuenta");

                            titularCuenta = keyboard.next();
                            a1.setTitular(titularCuenta);
                        }

                    }
                    break;
                }

                case 2: {

                    System.out.println("Que operacion desea realizar \nIngreso \nRetirada \nver Titular y saldo de la cuenta \nCambiar el titular de la cuenta");
                    opcionCuenta = keyboard.next().toLowerCase();

                    switch (opcionCuenta) {

                        case "ingreso": {

                            System.out.println("Saldo: " + a2.getCantidad());

                            saldo = keyboard.nextDouble();

                            while (saldo < 0) {

                                saldo = keyboard.nextDouble();

                            }

                            a2.ingresar(saldo);
                            break;
                        }

                        case "retirada": {

                            System.out.println("Saldo: " + a2.getCantidad());

                            saldo = keyboard.nextDouble();

                            while (saldo < 0) {

                                saldo = keyboard.nextDouble();

                            }

                            a2.retirar(saldo);
                            break;

                        }

                        case "titular": {

                            System.out.println(a2.toString());
                            break;

                        }

                        case "cambio": {

                            System.out.println(a2.getTitular());
                            System.out.println("Ingrese el nombre del nuevo titular de la cuenta");

                            titularCuenta = keyboard.next();
                            a2.setTitular(titularCuenta);
                        }

                    }
                }
            }
        }while (opcion != 3);
    }
}