package javacompleto.programacaofuncional.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bolo", 80));
        products.add(new Product("Bolachao", 50));
        /*predicate recebe um parametro e a funcao test retorna um boolean*/
        //products.removeIf();
        products.stream()
                .filter((p)->p.getPrice()>50)
                .toList()
                .forEach(System.out::println);
        //System.out.println(products);
    }
}
