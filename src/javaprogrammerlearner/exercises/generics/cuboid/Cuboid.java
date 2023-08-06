package javaprogrammerlearner.exercises.generics.cuboid;

public class Cuboid<T extends Number>{
    private T length;
    private T breadth;
    private T height;

    public Cuboid(T length, T breadth, T height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public Double getVolume(){
        return length.doubleValue()*breadth.doubleValue()*height.doubleValue();
    }
    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getBreadth() {
        return breadth;
    }

    public void setBreadth(T breadth) {
        this.breadth = breadth;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                '}';
    }
}
