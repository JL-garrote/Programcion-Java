class NoPerecedero extends Producto {

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
    }
}
