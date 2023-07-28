package datastructures.lista;

public class ListaEncadeada<T> {
    T info;
    ListaEncadeada<T> prox;

    @Override
    public String toString() {
        return info.toString();
    }
}
