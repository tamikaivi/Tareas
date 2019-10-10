package Ejercicio4Command;

public class Suspender implements ICommand {
    private Computadora receiver;

    public Suspender(Computadora receiver){
        this.receiver =receiver;

    }
    @Override
    public void excecute() {
        receiver.suspender();
    }
}
