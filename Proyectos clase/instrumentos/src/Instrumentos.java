abstract class Instrumentos {

    String tipoInstrumento;
    //boolean cuerda = false;
    //boolean aire = false;
    String marca;
    String modelo;

    public Instrumentos(String tipoInstrumento, String marca, String modelo) {
        this.tipoInstrumento = tipoInstrumento;
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract void tocar();
}