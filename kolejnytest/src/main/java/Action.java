public class Action {
    public static void main(String[] args) {
        System.out.print("Hello World");
        User user = new User();
        String name=user.setName("Rafał");
        name = user.getName();
        System.out.println(name+" "+" "+name);




    }
}

