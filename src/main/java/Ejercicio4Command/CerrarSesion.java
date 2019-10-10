package Ejercicio4Command;

public class CerrarSesion implements ICommand {
    private Computadora receiver;

    public CerrarSesion(Computadora receiver){
        this.receiver =receiver;

    }
    @Override
    public void excecute() {
        receiver.cerrarSesion();
    }
}
