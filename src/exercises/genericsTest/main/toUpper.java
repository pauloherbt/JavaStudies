package exercises.genericsTest.main;

import java.util.function.Function;

public class toUpper implements Function<Product,String> {

    @Override
    public String apply(Product o) {
        String result= o.getName().substring(0,o.getName().length()-1);
                return result+String.valueOf(o.getName().charAt(o.getName().length()-1)).toUpperCase();
    }
}
