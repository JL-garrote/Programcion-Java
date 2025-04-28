public class TelefonoMovil implements Dispositivo{

    @Override
    public void encender() {
        System.out.println("Telefono movil se esta encendiendo");
    }

    @Override
    public void apagar() {
        System.out.println("Telefono movil se esta apagando");
    }

    @Override
    public void mostrarVersion() {
        Dispositivo.super.mostrarVersion();
    }

    public static void main(String[] args) {

        TelefonoMovil telefono1 = new TelefonoMovil();

        telefono1.encender();
        telefono1.apagar();
        telefono1.mostrarVersion();

    }
}