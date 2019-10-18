package ejercicio6B;

import java.util.List;

public class BackLinearSearch implements IStrategyNotas {
    private List<Celular> celularList;

    public BackLinearSearch(List<Celular> celularList) {
        this.celularList = celularList;
    }

    @Override
    public void buscarPorPrecio(int precio) {
        System.out.println("Los celulares Disponibles con el precio de: "+precio+" Son los modelos: ");
        for(int i = celularList.size()-1; i>=0;i--){
            if(celularList.get(i).getPrecio() == precio){
                System.out.println(celularList.get(i).getModelo()+", "+ celularList.get(i).getGama()+", "+ celularList.get(i).getMarca()+", "+ celularList.get(i).getPrecio());
            }

        }

    }

    @Override
    public void bucarPorModelo(String modelo) {
        System.out.println("Los celulares Disponibles con el modelo: "+modelo+" Son los modelos: ");
        for(int i = celularList.size()-1; i>=0;i--){
            if(celularList.get(i).getModelo().equals(modelo)){
                System.out.println(celularList.get(i).getModelo()+", "+ celularList.get(i).getGama()+", "+ celularList.get(i).getMarca()+", "+ celularList.get(i).getPrecio());
            }
        }
    }

    @Override
    public void bucarPorModeloPrecio(int precio, String modelo) {
        System.out.println("Los celulares Disponibles con el modelo de: "+modelo+" y el precio de: "+precio+" Son los modelos: ");
        for(int i = celularList.size()-1; i>=0;i--){
            if(celularList.get(i).getModelo().equals(modelo) && celularList.get(i).getPrecio() == precio){
                System.out.println(celularList.get(i).getModelo()+", "+ celularList.get(i).getGama()+", "+ celularList.get(i).getMarca()+", "+ celularList.get(i).getPrecio());
            }
        }
    }
}
