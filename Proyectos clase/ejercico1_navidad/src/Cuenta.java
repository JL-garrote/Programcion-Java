public class Cuenta {

    String titular;
    double cantidad;

    public Cuenta(String titular){

        this.titular = titular;

    }

    public Cuenta(String titular, double cantidad){

        this.titular = titular;
        this.cantidad = cantidad;

    }

    public String getTitular(){

        return titular;

    }

    public double getCantidad(){

        return cantidad;

    }

    public void setTitular(String titular){

        this.titular = titular;

    }

    public void setCantidad(double cantidad){

        this.cantidad = cantidad;

    }

    public void ingresar(double cantidad){

        if(cantidad >= 0) {

            this.cantidad += cantidad;

        }else {

            System.out.println("No es posible hacer la operacion");

        }

    }

    public void retirar(double cantidad) {

        this.cantidad -= cantidad;

        if(this.cantidad < cantidad) {

            this.cantidad = 0;

        }

    }

    public String toString(){

        return "El titular de la cuenta es " + titular + " con saldo de " + cantidad;

    }
}