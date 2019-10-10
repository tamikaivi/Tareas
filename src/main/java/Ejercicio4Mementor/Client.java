package Ejercicio4Mementor;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        CareTaker caretaker = new CareTaker(); //Almacenador de mementos
        Originator originator = new Originator(); // creador de mementos
        Repositorio concreteObject;

        Random random = new Random();

        List<Integer> randoms = new LinkedList<>();
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));
        randoms.add(random.nextInt(100));


        concreteObject = new Repositorio("Commit 1","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(0),originator.createDataBase() ); // creamos memento [0] --> State2

        concreteObject = new Repositorio("Commit 2","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(1),originator.createDataBase() ); // creamos memento [1] --> State3

        concreteObject = new Repositorio("Commit 3","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(2),originator.createDataBase() );

        concreteObject = new Repositorio("Commit 4","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(3),originator.createDataBase() );
        concreteObject = new Repositorio("Commit 5","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(4),originator.createDataBase() );
        concreteObject = new Repositorio("Commit 6","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(5),originator.createDataBase() );

        concreteObject = new Repositorio("Commit 7","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(6),originator.createDataBase() );

        concreteObject = new Repositorio("Commit 8","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(7),originator.createDataBase() );

        concreteObject = new Repositorio("Commit 9","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(8),originator.createDataBase() );

        concreteObject = new Repositorio("Commit 10","CodigoCambiado","Autor","10/10/19");
        originator.setDataBase(concreteObject);

        caretaker.addDataBase( " "+randoms.get(9),originator.createDataBase() );


        originator.restoreDataBase( caretaker.getDataBase(" "+randoms.get(4)));
        //originator.restoreDataBase( caretaker.getDataBase("10/09/2018") );
    }
}
