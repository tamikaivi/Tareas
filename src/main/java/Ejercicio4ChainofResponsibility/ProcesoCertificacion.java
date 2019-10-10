package Ejercicio4ChainofResponsibility;

public class ProcesoCertificacion implements IPrestamo {

    private IPrestamo next;

    @Override
    public void setNext(IPrestamo handler) {
        next=handler;
    }

    @Override
    public IPrestamo next() {
        return next;
    }

    @Override
    public void criterioCarnetizacion(boolean certificado, boolean pagoBanco, boolean ficha) {
         Carnetizacion handlerConcreto1 = new Carnetizacion();
         this.setNext(handlerConcreto1);

         Notario handlerConcreto2 = new Notario();
         handlerConcreto1.setNext(handlerConcreto2);

         Cajero handlerConcreto3 = new Cajero();
         handlerConcreto2.setNext(handlerConcreto3);

        Ayuda handlerConcreto4 = new Ayuda();
        handlerConcreto3.setNext(handlerConcreto4);


         next.criterioCarnetizacion(certificado,pagoBanco,ficha);
    }
}
