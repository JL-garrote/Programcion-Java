public class Coche implements IVehiculo{

    int combustibleInicial = 0;

    public Coche(int combustibleInicial) {
        this.combustibleInicial = combustibleInicial;
    }

    @Override
    public void conducir(){
        if(combustibleInicial > 0 ){
            System.out.println("Esta conduciendo");
        }else {
            System.out.println("No tiene gasoi");
        }
    }

    @Override
    public boolean repostar(int combustibleRepostado) {
        combustibleInicial += combustibleRepostado;
        boolean repostado = false;

        if(combustibleInicial > 0 ){
            repostado = true;
        }else {

        }
        return repostado;
    }
}
