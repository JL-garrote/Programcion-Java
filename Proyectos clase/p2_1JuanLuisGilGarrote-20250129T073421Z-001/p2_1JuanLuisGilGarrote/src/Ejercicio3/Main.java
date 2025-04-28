package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Porducto[] compra = {

                new Perecedero("aro de cebolla",40.0,6),
                new Perecedero("lechuga",35.6,6),
                new Perecedero("tomate",60.0,6),
                new Perecedero("doritos",40.8,4),
                new Perecedero("pelotazos",4.5,6),

                new NoPerecedero("pelota",13.5,"jugar"),
                new NoPerecedero("guantes",20.9,"portero"),
                new NoPerecedero("pantalone",18.5,"ropa"),
                new NoPerecedero("chaqueta",50,"ropa"),
                new NoPerecedero("camisa",80.8,"ropa")

        };

        for (int i = 0; i < compra.length; i++) {

            if (compra[i] instanceof Perecedero) {

                System.out.println("Producto perecedero");
                Perecedero p = (Perecedero) compra[i];
                p.comprobarCaducidad();
                System.out.println("la fecha de caducidad se cumplira dentro de " + p.getDiasCaducar() + " dias");
                System.out.println(p.toString());
                p.setDiasCaducar(3);
                p.comprobarCaducidad();
                System.out.println("la fecha de caducidad se cumplira dentro de " + p.getDiasCaducar() + " dias");
                System.out.println(p.toString());
                p.setDiasCaducar(2);
                p.comprobarCaducidad();
                System.out.println("la fecha de caducidad se cumplira dentro de " + p.getDiasCaducar() + " dias");
                System.out.println(p.toString());
                p.setDiasCaducar(1);
                p.comprobarCaducidad();
                System.out.println("la fecha de caducidad se cumplira dentro de " + p.getDiasCaducar() + " dias");
                System.out.println(p.toString());
                System.out.println();

            } else {

                System.out.println("Producto no perecedero");
                NoPerecedero n = (NoPerecedero) compra[i];
                System.out.println("El tipo de producto es " + n.getTipo());
                n.calcular(5);
                n.setTipo("futbol");
                System.out.println("El tipo de producto es " + n.getTipo());
                System.out.println();

            }
        }
    }
}
