package Ejercicio4Mementor;

public class Repositorio {
    private String mensajeCommit;
    private String cambioCodigo;
    private String autor;
    private String fecha;
   // private S

    public Repositorio(String mensajeCommit, String cambioCodigo, String autor, String fecha){
        this.mensajeCommit = mensajeCommit;
        this.cambioCodigo = cambioCodigo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public void show(){
        System.out.println("Current Values --> MensajeCommit : "+mensajeCommit+" Codigo: "+ cambioCodigo +" Autor :"+ autor+" Fecha: "+ fecha);
   }

    public String getMensajeCommit() {
        return mensajeCommit;
    }

    public void setMensajeCommit(String mensajeCommit) {
        this.mensajeCommit = mensajeCommit;
    }

    public String getCambioCodigo() {
        return cambioCodigo;
    }

    public void setCambioCodigo(String cambioCodigo) {
        this.cambioCodigo = cambioCodigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
