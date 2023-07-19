package exercises.genericsTest.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws SQLException {
        //exercises.genericsTest.main.Arrays a1 = new Arrays();
        ArrayList<Product> a=new ArrayList<>();
        a.add(new Arroz("queijo",100));
        a.add(new Arroz("baiao",250));
       // a.add(new Product("mugunza",90));
        //a.add(new Product("straps",12));
        //a.removeIf(x->x>10);
        //System.out.println(s);
        //a.sort((b,c)->Double.compare(b.getPrice(),c.getPrice()));
        /*Arroz arroz = new Arroz("arroiz",100);
        arroz.getName();
        System.out.println(a);*/
    }


}
