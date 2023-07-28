package exercises.estruturadedados.pilha;
class No<T>{
    T info;
    No<T> prox;

    @Override
    public String toString() {
        return info+"\n";
    }
}
public class Pilha<T> {
    No<T> inicio;

    public Pilha() {
        this.inicio = null;
    }

    public void push(T info){
        No<T> no = new No<>();
        no.info=info;
        no.prox = inicio; //se a pilha tiver vazia inicio e null ent prox sera null do msm jeito
        this.inicio=no;
    }
    public No<T> pop(){
        if(inicio==null)
            return null;
        No<T> toPop = inicio;
        inicio=inicio.prox;
        return toPop;

    }
    public void imprimirPilha(){
        No<T> aux = inicio;
        while (aux!=null){
            System.out.println(aux.info);
            aux=aux.prox;
        }
    }
    public No<T> peek(){
        return inicio;
    }
    public int qtdElementosPilha(){
        No<T> aux = inicio;
        int soum=0;
        while (aux!=null){
            soum++;
            aux=aux.prox;
        }
        return soum;
    }

    public static void main(String[] args) {
        Pilha<Integer> pilhaInt = new Pilha<>();
        pilhaInt.push(1);
        pilhaInt.imprimirPilha();
        No<?> no = pilhaInt.pop();
        //System.out.println(no);
        pilhaInt.imprimirPilha();
        System.out.println(pilhaInt.qtdElementosPilha());
        System.out.println(pilhaInt.inicio);
    }
}
