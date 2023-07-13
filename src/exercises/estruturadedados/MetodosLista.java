package exercises.estruturadedados;

public class MetodosLista {
    public static ListaEncadeada inserir(ListaEncadeada ls, int info){
        ListaEncadeada newls=new ListaEncadeada();
        newls.info=info;
        newls.prox=null;
        if(ls==null)
            return newls;
        ListaEncadeada laux=ls;
        while(laux.prox!=null)
            laux=laux.prox;
        laux.prox=newls;
        return ls;
    }
    public static ListaEncadeada busca(ListaEncadeada ls,int info){
        ListaEncadeada laux=ls;
        while(laux!=null){
            if(laux.info==info)
                return laux;
            laux=laux.prox;
        }
        return null;
    }
    public static ListaEncadeada remover(ListaEncadeada ls,int info){
        ListaEncadeada toRemove=busca(ls,info);
        if(toRemove==null){
            System.out.println("elemento nao esta presente");
            return ls;
        }
        if(toRemove.equals(ls))
            return ls.prox;
        if(toRemove.prox==null){
            ListaEncadeada laux=ls;
            while(!laux.prox.equals(toRemove))
                laux=laux.prox;
            laux.prox=null;
            return ls;
        }
        ListaEncadeada lant=ls,lprox=ls;
        while(!lprox.equals(toRemove)){
            lant=lprox;
            lprox=lprox.prox;
        }
        lant.prox=lprox.prox;
        return ls;
    }
    public static void imprimir(ListaEncadeada ls){
        ListaEncadeada aux=ls;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.prox;
        }
    }
    public static ListaEncadeada criarLista(){
        return null;
    }

    public static void main(String[] args) {
        ListaEncadeada ls=criarLista();
        //imprimir(ls);
        ls=inserir(ls,1);
        ls=inserir(ls,2);
        ls=inserir(ls,3);
        ls=inserir(ls,4);
        ls=inserir(ls,5);
        ls=inserir(ls,6);
        ls=inserir(ls,7);
        imprimir(ls);
        ls=remover(ls,2);
        ls=remover(ls,1);
        ls=remover(ls,4);
        ls=remover(ls,6);
        ls=remover(ls,7);
        imprimir(ls);
    }
}
