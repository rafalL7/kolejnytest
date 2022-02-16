public class Action {
    public static void main(String[] args) {
        System.out.print("Hello World");
        User user = new User();
        String name=user.setName("Rafał");
        name = user.getName();
        System.out.println(name+" "+" "+name);




    }

// --Commented out by Inspection START (16.02.2022 12:07):
//    public Action() {
//        super();
//    }
// --Commented out by Inspection STOP (16.02.2022 12:07)
}

