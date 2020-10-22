public class SecondThread extends Thread{
    PrincipalClass ejemplito;

    public SecondThread(PrincipalClass ejemplito) {
        this.ejemplito = ejemplito;
    }

    @Override
    public void run() {
        int veces=0;
        Long empieza = System.currentTimeMillis();
            try {
                for(int i=0;i<Main.numero;i++){
                    sleep(2000);
                    veces++;
                    System.out.println("Procesando...");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        Long acaba = (System.currentTimeMillis()-empieza);
        ejemplito.muestraString("Se ha ejecutado "+veces+" veces el programa","Ha tardado "+acaba/1000+ " segundos");
    }
}
