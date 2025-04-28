public class Perro extends Animale {

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public void ladrar(){
        System.out.println("El perro " + nombre + " esta ladrando");
    }
}
