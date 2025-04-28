public class Flauta extends Instrumentos {

    boolean travesera;

    public Flauta(boolean travesera,String tipo,String marca,String modelo) {
        super(tipo,marca,modelo);
        this.travesera = travesera;
    }

    @Override
    void tocar(){

        tipoInstrumento = "Flauta";
        System.out.println(tipoInstrumento);

        System.out.println("suena la flauta");

       //aire = true;
        System.out.println("Es un instrumento de aire");

        if(!travesera){
            System.out.println("Es una flauta travesera");
        } else {
            System.out.println("Es una flauta normal");
        }

        System.out.println("Es una flauta marca " + marca + " modelo " + modelo);
    }
}
