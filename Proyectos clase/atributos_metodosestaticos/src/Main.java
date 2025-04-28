public class Main {
    public static void main(String[] args) {

        Coche micoche = new Coche("Peugeod" , "2008");
        Coche micoche2 = new Coche("Seat", "toledo");
        Coche micoche3 = new Coche("Michegan", "2008");

        micoche.mostrarDetalles();
        micoche2.mostrarDetalles();
        micoche3.mostrarDetalles();

        //micoche3.sinAlquilar();

        //System.out.println("El coche " + micoche.marca + " " + micoche.modelo + " " + "ha sido alquilado");
        micoche.Total();
        //System.out.println("El coche " + micoche2.marca + " " + micoche2.modelo + " " + "ha sido alquilado");
        micoche2.Total();

        Coche.alquileres(Coche.total);
        //Coche.sin(Coche.cochesSinalquilar);
    }
}