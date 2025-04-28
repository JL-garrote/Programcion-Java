public class Password {

    int longitud = 8;
    String contrasena;

    public Password(int longitud, String contrasena) {

        generarPassword();
        this.longitud = longitud;
        this.contrasena = contrasena;

    }

    public Password() {generarPassword();}

    final void generarPassword() {

        String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f","g","h","i","j","k","l","m","n","*","/","+","'","^"};
        int u = 0;

        for (int i = 0; i < longitud; i++) {

            u = (int) (Math.random() * 48);

            contrasena = letras[u];

            System.out.print(contrasena);

        }
    }

    public void esFuerte() {

        boolean esFuerte = false;
        String[] letraMinuscula = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n"};
        String[] numeros = {"1","2","3","4","5","6","7","8","9","0"};
        int d = 0;
        int h = 0;
        int u = 0;

        for (int i = 0; i < longitud; i++) {

            char[] a = contrasena.toCharArray();
            char[] b = letraMinuscula[i].toCharArray();
            char[] c = numeros[i].toCharArray();

            if(contrasena.charAt(i) == a[i]) {

                u++;

            } else if (contrasena.charAt(i) == b[i]) {

                h++;

            }else {

                d++;

            }

            if(u >= 2 && h >= 2 && d > 5) {

                esFuerte = true;

            }
        }

        System.out.println(" " + esFuerte);

    }
}