public class Cafetera {

    int capacidadmaxima;
    int capacidadactual;

    public Cafetera() {

        capacidadmaxima = 1000;
        capacidadactual = 0;

    }

    public Cafetera(int capacidadmaxima) {

        this.capacidadmaxima = capacidadmaxima;
        capacidadactual = capacidadmaxima;

    }

    public Cafetera(int capacidadmaxima, int capacidadactual) {

        this.capacidadmaxima = capacidadmaxima;
        this.capacidadactual = capacidadactual;

        if (capacidadactual > capacidadmaxima) {

            capacidadactual = capacidadmaxima;

        }

    }

    public void llenarCafetera() {

        capacidadactual = capacidadmaxima;
        System.out.println(capacidadactual);

    }

    public void vaciarCafetera() {

        capacidadactual = 0;

    }

    public void servirTaza(int taza) {

        if (taza > capacidadactual) {

            taza = capacidadactual;
            capacidadactual = 0;

        }else if (taza < capacidadactual) {

            capacidadactual = taza - capacidadactual;

        }else {

            capacidadactual = 0;

        }

        System.out.println("Se a servido con " + capacidadactual);

    }

    public void agregarCafe(int cafe) {

        cafe += capacidadactual;

        if(cafe > capacidadmaxima) {

            System.out.println("La cafetera desborda");

        } else {

            System.out.println("Se agrega el cafe");

        }

    }
}
