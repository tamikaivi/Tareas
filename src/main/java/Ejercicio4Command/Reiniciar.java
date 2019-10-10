package Ejercicio4Command;

public class Reiniciar implements ICommand {
    private Computadora receiver;

    public Reiniciar(Computadora receiver){
        this.receiver =receiver;

    }
    @Override
    public void excecute() {
        receiver.reiniciar();
    }
}
