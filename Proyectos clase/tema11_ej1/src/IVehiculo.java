public interface IVehiculo {

    void conducir();

    default boolean repostar(int combustibleRepostado) {
        return true;
    }
}
