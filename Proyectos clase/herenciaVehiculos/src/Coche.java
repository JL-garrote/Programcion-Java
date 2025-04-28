public class Coche extends Vehiculo{

    public int numeroPuertas;

    Coche(int numeroPuertas,String modelo) {

        super(modelo);
        this.numeroPuertas = numeroPuertas;

    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println("Numero de puertas: " + numeroPuertas + " El modelo: " + modelo);

    }
}
