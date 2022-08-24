import java.util.ArrayList;
import java.util.List;

public class Laptop {
    private final String name;
    private final int rating;

    public Laptop(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    void introduce() {

        if (rating >= 0 && rating <= 9) {
            System.out.println("Hi, I’m " + name + " and I’m a very slow laptop.");
        } else if (rating >= 10 && rating <= 24) {
            System.out.println("Hi, I’m " + name + " and I’m a quite decent laptop.");
        } else if (rating >= 25 && rating <= 50) {
            System.out.println("Hi, I’m " + name + " and I’m a gaming machine!");
        } else {
            System.out.println("The grade is out of the range of [0,50]");
        }
    }


    public static void main(String[] args) {
        Laptop laptopAsus = new Laptop("ASUS NOVAGO TP370QL", 9);
        laptopAsus.introduce();
        Laptop laptopAcer = new Laptop("ACER PREDATOR 21 X", 39);
        laptopAcer.introduce();
        Laptop laptopDell = new Laptop("DELL LATITUDE 7390", 24);
        laptopDell.introduce();
        Laptop laptopAlienWare = new Laptop("ALIENWARE 15 R3", 48);
        laptopAlienWare.introduce();

        List<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(laptopAsus);
        laptops.add(laptopAcer);
        laptops.add(laptopDell);
        laptops.add(laptopAlienWare);
        for (Laptop l : laptops) {
            if (l.rating > 20) {
                System.out.println(l.name + " is rated " + l.rating);
            }

        }
    }
}
