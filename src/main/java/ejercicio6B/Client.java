package ejercicio6B;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Celular> celularList = new LinkedList<>();

        Celular cel1 = new Celular("Modelo 1", "Marca 1", "Gama 1",300);
        Celular cel2 = new Celular("Modelo 2", "Marca 2", "Gama 2",500);
        Celular cel3 = new Celular("Modelo 3", "Marca 3", "Gama 3",600);
        Celular cel4 = new Celular("Modelo 5", "Marca 4", "Gama 4",300);
        Celular cel5 = new Celular("Modelo 5", "Marca 5", "Gama 5",300);

        celularList.add(cel1);
        celularList.add(cel2);
        celularList.add(cel3);
        celularList.add(cel4);
        celularList.add(cel5);

        TiendaCelulares context = new TiendaCelulares();

        context.setEstudiantes(celularList);
        context.buscarPorPrecio(300);
        context.buscarPorModelo("Modelo 3");
        context.buscarPorModeloPrecio(300,"Modelo 5");



        List<Celular> celularList2 = new LinkedList<>();

        Celular celular1 = new Celular("Modelo 1", "Marca 1", "Gama 1",300);
        Celular celular2 = new Celular("Modelo 2", "Marca 2", "Gama 2",500);
        Celular celular3 = new Celular("Modelo 3", "Marca 3", "Gama 3",600);
        Celular celular4 = new Celular("Modelo 5", "Marca 4", "Gama 4",300);
        Celular celular5 = new Celular("Modelo 5", "Marca 5", "Gama 5",300);
        Celular celular6 = new Celular("Modelo 1", "Marca 1", "Gama 1",300);
        Celular celular7 = new Celular("Modelo 2", "Marca 2", "Gama 2",500);
        Celular celular8 = new Celular("Modelo 3", "Marca 3", "Gama 3",600);
        Celular celular9 = new Celular("Modelo 5", "Marca 4", "Gama 4",900);
        Celular celular10 = new Celular("Modelo 5", "Marca 5", "Gama 5",700);
        Celular celular11 = new Celular("Modelo 1", "Marca 1", "Gama 1",400);
        Celular celular12 = new Celular("Modelo 2", "Marca 2", "Gama 2",200);

        celularList2.add(celular1);
        celularList2.add(celular2);
        celularList2.add(celular3);
        celularList2.add(celular4);
        celularList2.add(celular5);
        celularList2.add(celular6);
        celularList2.add(celular7);
        celularList2.add(celular8);
        celularList2.add(celular9);
        celularList2.add(celular10);
        celularList2.add(celular11);
        celularList2.add(celular12);


        TiendaCelulares context2 = new TiendaCelulares();

        context2.setEstudiantes(celularList2);
        context2.buscarPorPrecio(300);
        context.buscarPorModelo("Modelo 3");
        context.buscarPorModeloPrecio(300,"Modelo 5");



    }
}
