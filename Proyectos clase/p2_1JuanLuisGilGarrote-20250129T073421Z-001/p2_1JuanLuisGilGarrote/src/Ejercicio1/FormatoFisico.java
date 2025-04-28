package Ejercicio1;

public class FormatoFisico extends Pelicula implements  Prestable {

    int iff;
    boolean prestado;

    public FormatoFisico(int iff, int id, String titulo, String fecha){
        super(id, titulo, fecha);
        this.iff = iff;
        this.prestado = false;
    }

    @Override
    public void prestar(){
        prestado = true;
        System.out.println("La pelicula ha sido prestada");
    }

    @Override
    public void devolver(){

        if(!prestado){
            System.out.println("La pelicula no ha sido prestada");
        }else {
            System.out.println("La pelicula en formato fisico a sido devuelta");
        }

    }

    @Override
    public void estaPrestado(){
        if(prestado){
            System.out.println("La pelicula esta prestada");
        }else {
            System.out.println("La pelicula no esta prestada");
        }
    }
}
