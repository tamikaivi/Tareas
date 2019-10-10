package Ejercicio4Mementor;

public class Memento {

    private Repositorio state;

    public Memento(Repositorio stateToSave)
    {
        state = stateToSave;
    }

    public Repositorio getSavedState()
    {
        return state;
    }

}
