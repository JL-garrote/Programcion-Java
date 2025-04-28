public class Guitarra extends Instrumentos {

    boolean electrica;

    public Guitarra(boolean electrica,String tipo,String marca,String modelo) {
        super(tipo, modelo, modelo);
        this.electrica = electrica;
    }

    @Override
    void tocar(){

        tipoInstrumento = "Guitarra";
        System.out.println(tipoInstrumento);

        System.out.println("suena la guitarra");

        //cuerda = true;

       /* if(cuerda){
            System.out.println("Es un instrumento de cuerda");
        }*/

        if(electrica){
            System.out.println("Es una guitarra electrica");
        }

        modelo = "colgate";
        marca = "Override";

        System.out.println("Es una flauta marca " + marca + " modelo " + modelo);
    }
}
