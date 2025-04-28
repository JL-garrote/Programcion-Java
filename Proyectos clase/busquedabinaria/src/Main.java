public class Main {
    public static void main(String[] args) {

        int[] javi = {3,10,20,25};

        boolean verdaderofalso = busquedabinaria(javi,25);

        if (verdaderofalso == true) {

            System.out.println("encontrado");

        } else {

            System.out.println("no encontrado");

        }

    }

    public static boolean busquedabinaria(int[] javii,int eleccion) {

        boolean encontrado = false;
        int izquierda = 0;
        int derecha = javii.length -1;

        while(izquierda <= derecha && !encontrado) {

            int medio = izquierda + (derecha - izquierda) /2;

            if(javii[medio] == eleccion) {

                encontrado = true;

            } else if (javii[medio] > eleccion) {

                derecha = medio -1;

            }else {

                izquierda = medio + 1;

            }
        }
        return encontrado;
    }
}