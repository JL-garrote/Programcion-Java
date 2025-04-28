public class Vehiculo {

    private String marca;
    protected String modelo;
    public int anio;

    Vehiculo(String modelo, int anio) {

        this.modelo = modelo;
        this.anio = anio;

    }

    public void mostrar() {

        System.out.println("Marca: " + marca);

    }

}