package exercises.genericsTest.main;

public class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    private void doing(){
        System.out.println("doung");
    }
    public final String getName() {
        doing();
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name+" R$:"+price;
    }
    @Override
    public int compareTo(Product obj) {
        return Double.compare(price, obj.getPrice());
    }
}
