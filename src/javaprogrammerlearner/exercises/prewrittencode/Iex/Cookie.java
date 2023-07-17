package javaprogrammerlearner.exercises.prewrittencode.Iex;

public class Cookie implements Item{
    private String name;
    private double price;
    private String department;

    public Cookie(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    public static void main(String[] args) {
        Cookie cokk = new Cookie("cookie","bakery");
        System.out.println(cokk.getName()+cokk.getDepartment());
    }
}
