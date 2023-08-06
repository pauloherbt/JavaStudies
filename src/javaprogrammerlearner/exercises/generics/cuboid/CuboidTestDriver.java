package javaprogrammerlearner.exercises.generics.cuboid;

public class CuboidTestDriver {
    public static void main(String[] args) {
        Cuboid<Integer> intC= new Cuboid(1,2,3);
        Cuboid<Double> doubC= new Cuboid(1.3,2.2,2);
        System.out.println(intC.getVolume());
        System.out.println(doubC.getVolume());

    }
}
