package headfirst.lambda_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*crie uma lista de números inteiros e use streams
         para filtrar apenas os números pares, elevar cada número ao quadrado e, em seguida, imprimir o resultado.*/
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = list.stream().filter(a -> (a%2==0)).map(a ->(a*a)).toList();
        result.forEach(System.out::println);

        /*Crie uma lista de objetos representando livros com atributos como autor, título e anoPublicacao.
        Use streams para agrupar os livros por autor e contar quantos livros cada autor possui.*/
        List<Livro> livros = List.of(new Livro("Joao","Quinze",2004),new Livro("Joao","Escrava isaura",2008)
            ,new Livro("Rafael","OS tres",2010), new Livro("Henrique","Juaadao", 2018));
        System.out.println(livros.stream().sorted(Comparator.comparing(Livro::getAutor).thenComparing(Livro::getTitulo)).toList());
    }
}
