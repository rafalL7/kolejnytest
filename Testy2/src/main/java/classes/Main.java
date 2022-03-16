package classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        User user = new User();
        user.setName("Aga");
        System.out.println(user.getName());
        user.toString();
        user.setAge(18);

    }
}
