public class Piano extends Instrumentos{

    boolean deCola;

    public Piano(boolean deCola,String tipo,String marca,String modelo) {
        super(tipo,marca,modelo);
        this.deCola = deCola;
    }

    @Override
    void tocar(){

        System.out.println(tipoInstrumento);

        System.out.println("suena el piano");

        if(deCola){
            System.out.println("Es un piano de cola");
        }else {
            System.out.println("No es de cola");
        }

        System.out.println("Es una flauta marca " + marca + " modelo " + modelo);
    }
}
