public class Electrodomestico {

    final double precioBase;
    final String[] color = {"Blanco","Negro","Rojo","Azul","Gris"};
    final char[] letras = {'A','B','C','D','E','F'};
    final double peso;


    public Electrodomestico() {
        comprobarConsumoEnergetico(letras[0]);
        this.precioBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        comprobarConsumoEnergetico(letras[1]);
        this.precioBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(double precioBase,String color,char letras,double peso) {
        comprobarConsumoEnergetico(this.letras[2]);
        this.precioBase = 100;
        this.color[0] = color;
        this.letras[0] = letras;
        this.peso = 5;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String[] getColor() {
        return color;
    }

    public char[] getLetras() {
        return letras;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra) {

        for (int i = 0; i < letras.length; i++) {

            if (letras[0] == letra) {

                System.out.println(letras[i]);

            } else if (letras[1] == letra) {

                System.out.println(letras[i]);

            }else if (letras[2] == letra) {

                System.out.println(letras[i]);

            }else if (letras[3] == letra) {

                System.out.println(letras[i]);

            }else if (letras[4] == letra) {

                System.out.println(letras[i]);

            }else {

                System.out.println(letras[i]);

            }
        }

    }
}