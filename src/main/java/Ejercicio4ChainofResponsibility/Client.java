package Ejercicio4ChainofResponsibility;

public class Client {

    public static void main(String[] args) {
        ProcesoCertificacion banco = new ProcesoCertificacion();
        banco.criterioCarnetizacion(true,true,true);
        banco.criterioCarnetizacion(false,false,false);
        banco.criterioCarnetizacion(false,true,true);
        banco.criterioCarnetizacion(true,false,true);


    }
}
