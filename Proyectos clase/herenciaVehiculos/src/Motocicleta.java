public class Motocicleta extends Vehiculo{

    protected String tipo;

    Motocicleta(String tipo, String modelo, int anio) {

        super(modelo,anio);
        this.tipo = tipo;

    }

}
