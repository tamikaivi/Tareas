package Ejercicio4Command;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        Computadora receiver = new Computadora();

        Reiniciar reiniciar = new Reiniciar(receiver);
        Suspender suspender = new Suspender(receiver);
        Apagar apagar = new Apagar(receiver);
        CerrarSesion cerrarSesion = new CerrarSesion(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(new Date(),reiniciar);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        invoker.setCommand(new Date(),suspender);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        invoker.setCommand(new Date(),suspender);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        invoker.setCommand(new Date(),suspender);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        invoker.setCommand(new Date(),reiniciar);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        invoker.setCommand(new Date(),apagar);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        invoker.setCommand(new Date(),cerrarSesion);

        invoker.runCommands();

    }
}
