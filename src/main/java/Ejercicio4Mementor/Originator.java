package Ejercicio4Mementor;

public class Originator {
    private Repositorio state;

    public void setDataBase(Repositorio state)
    {
       System.out.println("Originator: Setting commit to "+state.getMensajeCommit());
       state.show();
       this.state = state;
    }

    public Memento createDataBase()
    {
        System.out.println("Originator: Create Version");
        state.show();
        return new Memento(state);
    }

    public void restoreDataBase(Memento m)
    {
        state = m.getSavedState();
        System.out.println("Originator: State after restoring from Resositorio: "+state.getMensajeCommit());
        state.show();
    }
}
