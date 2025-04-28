package Ejercicio3;

public class NoPerecedero extends Porducto{

    String tipo;

    public NoPerecedero(String nombre,double precio,String tipo) {
        super(nombre,precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void calcular(int cantidad) {
        super.calcular(cantidad);
        precio = precio * (double) cantidad;
        System.out.println("El precio es de " + precio);
    }

    @Override
    public String toString() {
        return "NoPerecedero{" + "tipo='" + tipo + '\'' + ", nombre='" + nombre + '\'' + ", precio=" + precio + '}';
    }
}
