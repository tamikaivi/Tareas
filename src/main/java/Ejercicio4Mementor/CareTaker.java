package Ejercicio4Mementor;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    //private ArrayList<MementoDataBase> savedStates = new ArrayList<MementoDataBase>();
    private Map<String, Memento> mapaSaveedStates = new HashMap<>();

    public void addDataBase(String k, Memento m) {
        mapaSaveedStates.put(k,m);
        System.out.println("Guardando Commit"+k);
    }

    public Memento getDataBase(String index) {
       return mapaSaveedStates.get(index);

    }
}