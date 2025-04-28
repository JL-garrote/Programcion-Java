/*Implementa una clase llamada Persona que permita crear objetos con atributos nombre,apellidos y edad. Ademas
* la clase debe cumplir las siguientes especificaciones:
*
* Constructor parametrizado
* Constructor de copia: Implementa un constructor de copia que reciba un objeto de tipo Persona y cree un nuevo objeto
* con los mismos volores de nombre, apellidos y edad, pero de manera independiente de la original.
* implimenta el metodo toString
* crea un objeto Persona inicial con valores dados
* Utiliza el operador de asignacion (=) para igualar este objeto a otro y demuestra que ambos comparten la misma direccion de memoria
* Usa el constructor de copia para crear un nuevo objeto indeoendiente a partir del original y demuestra que los cambios en uno no
* afectan al otro*/
public class Main {
    public static void main(String[] args) {

        Persona a = new Persona("Mendoza","AAA",40);
        Persona b = a;
        Persona c = new Persona("Mendoza","BBB",20);
        Persona d = new Persona(c);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        a.setNombre("Ale");
        c.setNombre("Lucia");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

    }
}