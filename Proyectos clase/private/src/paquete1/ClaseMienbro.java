package paquete1;

public class ClaseMienbro {

    private String privado = "Soy privado";
    String defecto = "Soy defecto";
    public String publico = "Soy publico";

    private void soyPrivado(){

        System.out.println("Soy privado");

    }

    void soyDefecto(){

        System.out.println("Soy defecto");

    }

    public void soyPublico(){

        System.out.println("Soy publico");

    }
}