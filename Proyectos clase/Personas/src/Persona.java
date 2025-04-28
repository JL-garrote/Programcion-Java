public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private final String sexo = "H";
    private double peso;
    private double altura;

    Persona(){
        generarDNI();
    }

    Persona(String nombre,int edad, String sexo){

        generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        sexo = sexo;

    }

    Persona(String nombre,int edad,String sexo,double peso,double altura){

        generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int setEdad(int edad){
        this.edad = edad;
        return edad;
    }

    public void setSexo(String sexo){
        sexo = sexo;
    }

    public double setPeso(double peso){
        this.peso = peso;
        return peso;
    }

    public double setAltura(double altura){
        this.altura = altura;
        return altura;
    }

    public void calcularIMC(double peso, double altura){

        double imc = 0;

        this.altura = altura * altura;
        imc = peso / altura;

        if(imc < 20) {

            imc = -1;
            System.out.println("IMC:" + imc);

        }else if(imc <= 25) {

            imc = 0;
            System.out.println("IMC:" + imc);

        } else {

            imc = 1;
            System.out.println("IMC:" + imc);

        }
    }

    public boolean esMayorDeEdad(int edad){

        boolean mayoriaEdad = false;

        if (edad <= 17) {

            mayoriaEdad = false;
            System.out.println("Menor de edad");
        }else {

            mayoriaEdad = true;
            System.out.println("Mayor de edad");

        }

        return mayoriaEdad;
    }

    public String toString() {

        return  nombre + " tiene " + edad + " años con DNI:" + dni + " del sexo " + sexo + " pesa " + peso + " kilos con una altura de unos " + altura;

    }

    public String comprobraSexo(String sexo){

        if(sexo.equals("h")){

            sexo = "h";

        } else if (sexo.equals("f")){

            sexo = "f";

        }else {

            sexo = "h";

        }

        return sexo;

    }

    private void generarDNI() {

        int parteNumerica;
        int temp = 0;
        //int l = 0;
        String[] dniLetra = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        parteNumerica = (int) (Math.random() * 99999999);

        temp = parteNumerica % 23;

        for(int i = 0;i < temp;i++) {

            dni = parteNumerica + dniLetra[i];

        }

        /*while(l < temp) {

            l++;
            dni = parteNumerica + dniLetra[l];

        }*/

        /*if (temp == 0) {

             l = 0;
             dni = parteNumerica + dniLetra[l];

        } else if (temp == 1) {

            l = 1;
            dni = parteNumerica + dniLetra[l];

        } else if (temp == 2) {

            l = 2;
            dni = parteNumerica + dniLetra[l];

        } else if (temp == 3) {

            l = 3;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 4) {

            l = 4;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 5) {

            l = 5;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 6) {

            l = 6;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 7) {

            l = 7;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 8) {

            l = 8;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 9) {

            l = 9;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 10) {

            l = 10;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 11) {

            l = 11;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 12) {

            l = 12;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 13) {

            l = 13;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 14) {

            l = 14;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 15) {

            l = 15;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 16) {

            l = 16;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 17) {

            l = 17;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 18) {

            l = 18;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 19) {

            l = 19;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 20) {

            l = 20;
            dni = parteNumerica + dniLetra[l];

        }else if (temp == 21) {

            l = 21;
            dni = parteNumerica + dniLetra[l];

        }else{

            l = 22;
            dni = parteNumerica + dniLetra[l];

        }*/

        System.out.println("DNI:" + dni);

    }
}