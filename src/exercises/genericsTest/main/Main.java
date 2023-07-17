package exercises.genericsTest.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //exercises.genericsTest.main.Arrays a1 = new Arrays();
        ArrayList<Product> a=new ArrayList<>();
        a.add(new Product("queijo",100));
        a.add(new Product("baiao",250));
        a.add(new Product("mugunza",90));
        a.add(new Product("straps",12));
        //a.removeIf(x->x>10);
        a.sort((b,c)->Double.compare(b.getPrice(),c.getPrice()));
        Arroz arroz = new Arroz("arroiz",100);
        arroz.getName();
        System.out.println(a);


    }


}
