public class Main {
    public static void main(String[] args) {

        Profesor[] profesores = {new ProfesorInterino(10), new ProfesorTitular("20-12-2012"), new Persona("Pedro","Capo","43567812X")};

        for(int i = 0; i < profesores.length; i++){

            if (profesores[i] instanceof ProfesorInterino){

                ProfesorInterino dam = (ProfesorInterino) profesores[i];
                dam.revisarConvacatoria();
                dam.solicitarPlaza();
                dam.especialidad();
                dam.descripcion();
                System.out.println(dam.annio);
                System.out.println();

            } else if (profesores[i] instanceof Persona){

                ProfesorTitular a3 = (ProfesorTitular) profesores[i];
                a3.revisarConvacatoria();
                a3.solicitarPlaza();
                a3.especialidad();
                a3.descripcion();
                System.out.println();

            } else {

                Persona a2 = (Persona) profesores[i];
                a2.revisarConvacatoria();
                a2.solicitarPlaza();
                a2.especialidad();
                a2.descripcion();
                System.out.println();

            }
        }
    }
}
