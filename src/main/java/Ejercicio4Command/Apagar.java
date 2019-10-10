package Ejercicio4Command;

public class Apagar implements ICommand {
    private Computadora receiver;

    public Apagar(Computadora receiver){
        this.receiver =receiver;

    }
    @Override
    public void excecute() {
        receiver.apagar();
    }
}
