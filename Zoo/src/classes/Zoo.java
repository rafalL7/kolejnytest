package classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Animal bear = new Bear()
        bear.setId(1);
        bear.setName("Yogi");
        bear.setWeight(200);
        bear.setFurLenght(40);
        Tiger tiger = new Tiger();
        tiger.setId(2);
        tiger.setName("Jataka");
        tiger.setWeight(150);
        tiger.setClawLength(25);
        Wolf wolf = new Wolf();
        wolf.setId(3);
        wolf.setName("Howler");
        wolf.setWeight(70);
        wolf.setFangLength(40);
        Dog dog = new Dog();
        dog.setId(4);
        dog.setName("Scooby");
        dog.setWeight(30);
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(bear);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(dog);
        for(Animal anim : animals){
            System.out.print(anim.getId());
        anim.introduce();

        }
    }
}
