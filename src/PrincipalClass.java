public class PrincipalClass {
    public PrincipalClass() throws InterruptedException {
        PrimerThread th1 = new PrimerThread();
        SecondThread th2 = new SecondThread(this);
        th1.start();
        th1.join();
        th2.start();
    }

    public void muestraString(String nombre,String tiempo){
        System.out.println(nombre+"\n"+tiempo);
    }
}
