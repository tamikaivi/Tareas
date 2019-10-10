package Ejercicio4ChainofResponsibility;

public interface IPrestamo {
    public void setNext(IPrestamo handler);
    public IPrestamo next();
    public void criterioCarnetizacion(boolean certificado, boolean pagoBanco, boolean ficha);

}
