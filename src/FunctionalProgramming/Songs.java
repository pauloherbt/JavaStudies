package FunctionalProgramming;

import java.util.Comparator;

public class Songs implements Comparable<Songs>{
    private String name;
    private String artistName;
    public Songs(String name, String artistName) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Songs o) {
        return getName().compareTo(o.getName());
    }
}
