public class Main {
    public static void main(String[] args) {

        //Object[] array = {new Perro(),new Gato(),new Serpiente()}; // array con objetos genericos
        Animal[] array = {new Perro(),new Gato(),new Serpiente()};

        for(int i = 0; i < array.length; i++){

            if(array[i] instanceof Perro){

                System.out.println("Comportamiento del perro");
                Perro adorfo = (Perro) array[i];
                adorfo.desplazarse();
                adorfo.ladrar();
                System.out.println();

            } else if(array[i] instanceof Gato){

                System.out.println("Comportamiento del gato");
                Gato gato1 = (Gato) array[i];
                gato1.desplazarse();
                gato1.maullar();
                System.out.println();

            }else {

                System.out.println("Comportamiento de la serpiente");
                Serpiente ser = (Serpiente) array[i];
                ser.desplazarse();
                ser.reptar();
                System.out.println();

            }
        }
    }
}