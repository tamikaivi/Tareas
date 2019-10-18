package ejercicio6B;

public interface IStrategyNotas {
    void buscarPorPrecio(int precio);
    void bucarPorModelo(String modelo);
    void bucarPorModeloPrecio(int precio, String modelo);
}
