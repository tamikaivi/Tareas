package state;

public class Client {
    public static void main(String[] args) {
         IState state = new Bloqueado("hol");
         Celular context = new Celular();
         context.setState(state);
         context.request();
         context.request();
         context.request();
         context.request();

        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}

        context.request();

        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}

        context.request();

        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}

        context.request();

        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}

        context.request();

        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}

        context.request();

        context.request();
        state = new Bloqueado("hola");
        context.request();


         state = new Desbloqueado();
         context.setState(state);
         context.request();
    }
}
