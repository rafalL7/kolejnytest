package classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        User user = new User();
        user.toString();
        user.setAge(18);
        user.setName("Aga");
        System.out.println(user.getName()+" "+user.getAge());
        int itemvalue = 100 + 50;
        System.out.println(itemvalue);
        itemvalue+=50;
        System.out.println(itemvalue);
        if (itemvalue >=200){
            System.out.println("Zmienna równa lub mniejsza 200");
        }
        String someText = "Great string!";
        Integer someNumber = 0;
        checkSomeObject(someNumber);
        checkSomeObject(someText);

    }
    static void checkSomeObject(Object object) {
        if (object instanceof String){
            String someText = (String) object;
            System.out.println("Text: "+someText);
        }
        else {
            System.out.println("other type");
        }
    }
}
