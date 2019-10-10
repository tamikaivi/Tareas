package Ejercicio4Command;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Invoker {
   // private List<ICommand> commandList = new ArrayList<>();
    //mapa alias de comando
    //hasmap
    private Map<Date, ICommand> commandList = new HashMap<>();
    public void setCommand (Date hora,ICommand command){
        commandList.put(hora,command);
        System.out.println("Añadiendo al Mapa ");
    }
    public  void runCommands(){
        for (Map.Entry<Date,ICommand> elem : commandList.entrySet()){
            ICommand comman = elem.getValue();
            comman.excecute();
            System.out.println(elem.getKey().getHours()+":"+elem.getKey().getMinutes()+":"+elem.getKey().getSeconds());
        }
        commandList.clear();
    }
}
