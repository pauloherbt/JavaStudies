package exercises.estruturadedados.lista;

public class MetodosLista<T> {
    public ListaEncadeada<T> inserir(ListaEncadeada<T> ls, T info){
        ListaEncadeada<T> newls =new ListaEncadeada<>();
        newls.info=info;
        newls.prox=null;
        if(ls==null)
            return newls;
        ListaEncadeada<T> laux=ls;
        while(laux.prox!=null)
            laux=laux.prox;
        laux.prox=newls;
        return ls;
    }
    public  ListaEncadeada<T> busca(ListaEncadeada<T> ls,T info){
        ListaEncadeada<T> laux=ls;
        while(laux!=null){
            if(laux.info==info)
                return laux;
            laux=laux.prox;
        }
        return null;
    }
    public  ListaEncadeada<T> remover(ListaEncadeada<T> ls,T info){
        ListaEncadeada<T> toRemove=busca(ls,info);
        if(toRemove==null){
            System.out.println("elemento nao esta presente");
            return ls;
        }
        if(toRemove==ls)
            return ls.prox;
        if(toRemove.prox==null){
            ListaEncadeada<T> laux=ls;
            while((laux.prox!=toRemove))
                laux=laux.prox;
            laux.prox=null;
            return ls;
        }
        ListaEncadeada<T> lant=ls,lprox=ls;
        while(lprox!=(toRemove)){
            lant=lprox;
            lprox=lprox.prox;
        }
        lant.prox=lprox.prox;
        return ls;
    }
    public void imprimir(ListaEncadeada<T> ls){
        ListaEncadeada<T> aux=ls;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.prox;
        }
    }
    public ListaEncadeada<T> criarLista(){
        return null;
    }

    public static void main(String[] args) {
       MetodosLista<Integer> mt = new MetodosLista<>();
        ListaEncadeada<Integer> ls=mt.criarLista();
        //imprimir(ls);
        ls=mt.inserir(ls,1);
        ls=mt.inserir(ls,2);
        ls=mt.inserir(ls,3);
        ls=mt.inserir(ls,4);
        ls=mt.inserir(ls,5);
        ls=mt.inserir(ls,6);
        ls=mt.inserir(ls,7);
        mt.imprimir(ls);
        /*ls=mt.remover(ls,2);
        ls=mt.remover(ls,1);
        ls=mt.remover(ls,4);
        ls=mt.remover(ls,6);
        ls=mt.remover(ls,7);
        */mt.imprimir(ls);
        System.out.println();
    }
}
