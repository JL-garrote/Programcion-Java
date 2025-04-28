class Perecedero extends Producto {

    int diasACaducar;

    public Perecedero(String nombre,double precio,int diasACaducar) {
        super(nombre,precio);
        this.diasACaducar = diasACaducar;
        comprobarCaducidad();
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    public void comprobarCaducidad(){

        int diasMinimos = 5;

        if(diasACaducar >= diasMinimos){
            System.out.println("El producto no esta cerca de caducarse");
        }

    }
}
