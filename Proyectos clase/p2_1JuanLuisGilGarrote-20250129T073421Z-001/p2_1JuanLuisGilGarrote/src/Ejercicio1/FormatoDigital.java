package Ejercicio1;

public class FormatoDigital extends Pelicula implements Comprable{

    int ifd;
    public boolean compra = false;
    int contador = 0;

    public FormatoDigital(int ifd,int id, String titulo, String fecha){
        super(id, titulo, fecha);
        this.ifd = ifd;
    }

    @Override
    public void comprar(boolean a) {

        if(compra && contador <= 10) {
            System.out.println("Se ha realizado la compra");
        } else {
            System.out.println("No se ha podido realizar la compra");
        }

    }

    @Override
    public boolean esComprable() {

        contador++;

        if(contador > 10) {
            System.out.println("No queda stock");
        }else {
            compra = true;
        }

        return compra;
    }
}