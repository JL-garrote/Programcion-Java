public class Main {
    public static void main(String[] args) {

        int numeromaximo = 320;
        int numerominimo = 160;

      /* do {

            numeromaximo = numeromaximo -20;
            if (numeromaximo == numerominimo){
                break;
            }
            System.out.println(numeromaximo);

        } while(numeromaximo >= numerominimo);*/



        for (int i = numeromaximo; i >= numerominimo; i = i -20) {

            System.out.println(i);
        }


    }
}