package state;

import java.util.Date;

public class Bloqueado implements IState {

    private String password;
    private String passwordGuardado="hola";
    private  int intentos=3;
    private int segundos=3;
    private int miliegGundos = segundos*1000;
    private int nuevosIntentos=1;
    private long tiempoactual;
    private long tiempoDeDetenciaon;
    private long tiempoQueFalta;
    private boolean puedesDesbloquear =true;

    public Bloqueado(String password) {
        this.password = password;
}

    @Override
    public void handle() {
        if (password.equals(passwordGuardado)&& puedesDesbloquear){
            System.out.println("Desbloqueadooooo");
        } else if (nuevosIntentos==intentos && puedesDesbloquear){
                puedesDesbloquear=false;
                tiempoDeDetenciaon = new Date().getSeconds();
                System.out.println("Ya no puedes Intentar tienes que esperar: "+segundos+ " seg.");
        }else if(nuevosIntentos > intentos && !puedesDesbloquear){
                tiempoactual = new Date().getSeconds();
                System.out.println(tiempoactual);
                System.out.println(tiempoDeDetenciaon);

            if (tiempoactual - tiempoDeDetenciaon<0){
                if(tiempoactual==0 && !puedesDesbloquear){
                    puedesDesbloquear=true;
                    nuevosIntentos=0;
                }
                tiempoQueFalta = segundos - ((tiempoactual - tiempoDeDetenciaon)+60);
                System.out.println("Ya no puedes Intentar tienes que esperar: "+tiempoQueFalta +" seg.");
                tiempoQueFalta=0;


            }else{
                if(tiempoactual==0 && !puedesDesbloquear){
                    puedesDesbloquear=true;
                    nuevosIntentos=0;
                }
                tiempoQueFalta = segundos - ((tiempoactual - tiempoDeDetenciaon));
                System.out.println("Ya no puedes Intentar tienes que esperar: "+tiempoQueFalta +" seg.");
                tiempoQueFalta=0;


            }
        }else if(puedesDesbloquear && ! password.equals(passwordGuardado) ){
                nuevosIntentos++;
                puedesDesbloquear=true;
                System.out.println("Cambie de Contrasenia");
        }else{
                nuevosIntentos++;
        }


    }
}
