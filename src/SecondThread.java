public class SecondThread extends Thread{
    PrincipalClass ejemplito;

    public SecondThread(PrincipalClass ejemplito) {
        this.ejemplito = ejemplito;
    }

    @Override
    public void run() {
        int repeat=Main.numero;
        int veces=0;
        Long empieza = System.currentTimeMillis();
        for(int i=0;i<repeat;i++){
            try {
                sleep(2000);
                veces=i+1;
                System.out.println("Procesando...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Long acaba = (System.currentTimeMillis()-empieza)/1000;

        String cadena = "Se ha ejecutado "+veces+" veces el programa";
        String tiempo = "Ha tardado "+acaba+ " segundos";
        ejemplito.muestraString(cadena,tiempo);
    }
}
