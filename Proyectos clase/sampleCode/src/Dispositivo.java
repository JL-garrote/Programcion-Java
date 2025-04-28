interface Dispositivo {

    float version = 1.0F;

    void encender();
    void apagar();

    default void mostrarVersion() {
        System.out.println("La version del sistema es la " + version);
    }
}
