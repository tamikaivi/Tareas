package state;

public class Desbloqueado implements IState {

    private String llamar="llamando";
    private String jugar="Jugando";
    private String sacarFoto="Sacando Fotos";

    @Override
    public void handle() {
        System.out.println("Ya puedes estar : " +llamar+ ", "+ jugar+"y " +sacarFoto);
    }


    public void llamar(){
        System.out.println(llamar);
    }

    public  void  jugar(){
        System.out.println(jugar);
    }

    public  void  sacarFoto(){
        System.out.println(sacarFoto);
    }
}
