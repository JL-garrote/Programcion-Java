package Ejercicio3;

public class Perecedero extends Porducto{

    int diasCaducar;

    public Perecedero(String nombre,double precio,int diasCaducar) {
        super(nombre,precio);
        this.diasCaducar = diasCaducar;
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasACaducar) {
        this.diasCaducar = diasACaducar;
    }

    public void comprobarCaducidad(){

        int diasMinimos = 5;

        if(diasCaducar >= diasMinimos){
            System.out.println("El producto no esta cerca de caducarse");

        }

        switch (diasCaducar){

            case 1:{
                precio = (precio / 4);
                System.out.println("El precio del producto es: " + precio);
                break;
            }

            case 2:{
                precio = (precio / 3);
                System.out.println("El precio del producto es: " + precio);
                break;
            }

            case 3:{
                precio = (precio / 2);
                System.out.println("El precio del producto es: " + precio);
                break;
            }

            default: {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Perecedero{" + "diasCaducar=" + diasCaducar + ", nombre='" + nombre + '\'' + ", precio=" + precio + '}';
    }
}