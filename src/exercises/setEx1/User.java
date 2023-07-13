package exercises.setEx1;

import java.util.Objects;

public class User {
    private String name;
    private String acess;

    public User(String name, String acess) {
        this.name = name;
        this.acess = acess;
    }

    public String getName() {
        return name;
    }
    public String getAcess() {
        return acess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
