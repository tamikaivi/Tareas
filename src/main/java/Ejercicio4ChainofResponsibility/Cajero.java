package Ejercicio4ChainofResponsibility;

public class Cajero implements IPrestamo {

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
     if (certificado && !pagoBanco && ficha){
         System.out.println("Tarea atendida por Cajero");
     }else{
         next.criterioCarnetizacion(certificado, pagoBanco,ficha);
     }
    }
}