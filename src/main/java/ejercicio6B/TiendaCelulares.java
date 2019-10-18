package ejercicio6B;

import java.util.LinkedList;
import java.util.List;

public class TiendaCelulares {
    private IStrategyNotas strategy;
    private List<Celular> celularList = new LinkedList<>();
    private int precio;
    private String modelo;

    ///enves de tiempo cantidad de estudiantes y dependiendo de la cantidadd recien ordenara las notas que tenga
    //

    public IStrategyNotas getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategyNotas strategy) {
        this.strategy = strategy;
    }

    public void setEstudiantes(List<Celular> celularList) {
        this.celularList = celularList;

        if (celularList.size() >=1 && celularList.size() <= 10){
            hacerBusqueda1(celularList);
        }else if (celularList.size() >=11 && celularList.size() <= 30){
            hacerBusqueda2(celularList);
        }else {
            hacerBusqueda2(celularList);
        }

    }


    public void hacerBusqueda2(List<Celular> celularList) {
        this.celularList = celularList;
        this.strategy = new BackLinearSearch(celularList);
    }

    public void hacerBusqueda1(List<Celular> celularList) {
        this.celularList = celularList;
        this.strategy = new LinearSearch(celularList);
    }


    public TiendaCelulares(){

    }
    public void buscarPorPrecio(int precio){
        this.precio=precio;
        strategy.buscarPorPrecio(precio);
    }

    public void buscarPorModelo(String modelo){
        this.modelo=modelo;
        strategy.bucarPorModelo(modelo);
    }

    public void buscarPorModeloPrecio(int precio,String modelo){
        this.modelo=modelo;
        this.precio=precio;
        strategy.bucarPorModeloPrecio(precio,modelo);
    }
    //otros metodos
}
