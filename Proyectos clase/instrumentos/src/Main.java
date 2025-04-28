public class Main {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        Instrumentos[] musica = {new Guitarra(a,"cuerda","l","a"), new Guitarra(b,"cuerda","l","a"), new  Piano(a,"cuerda pulsada","e","f"),new  Piano(b,"cuerda pulsada","dadsl","dasfa"),new  Flauta(a,"viento","fdsl","fgfga"),new Flauta(b,"aire","lsaf","aggg")};

        for(int i = 0; i < musica.length; i++) {

            if(musica[i] instanceof Guitarra ) {

                Guitarra a1 = (Guitarra) musica[i];
                a1.tocar();
                System.out.println();
                Guitarra a14 = (Guitarra) musica[i];
                a14.tocar();
                System.out.println();

            }else if(musica[i] instanceof Piano){

                Piano a12 = (Piano) musica[i];
                a12.tocar();
                System.out.println();
                Piano a13 = (Piano) musica[i];
                a13.tocar();
                System.out.println();

            }else {

                Flauta a15 = (Flauta) musica[i];
                a15.tocar();
                System.out.println();

                Flauta a17 = (Flauta) musica[i];
                a17.tocar();
                System.out.println();

            }

        }
    }
}
