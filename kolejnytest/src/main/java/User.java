import java.nio.file.attribute.UserPrincipal;
import java.util.Objects;

public class User implements UserTest{
    String name;
    String surName;
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {

        return name;
    }
    public void setSurName(String surName) {

        this.surName = surName;
    }
    public String getSurName() {

        return surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) && Objects.equals(getSurName(), user.getSurName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurName());
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }




}
