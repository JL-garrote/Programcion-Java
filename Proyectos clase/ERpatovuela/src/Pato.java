public class Pato implements Volador,Nadador{

    @Override
    public void volador() {
        System.out.println("Pato esta volando");
    }

    @Override
    public void nadador() {
        System.out.println("Pato esta nadando");
    }
}
