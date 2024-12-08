package TSK_Bonus.TSK_Bonus_2;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("Звуки животного... Опять... Раз 20 уже...");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("ГААААААААВ!!!!!!!!!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("МИАУ!");
    }
}

public class UpperBoundExample {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        makeSounds(dogList);
        makeSounds(catList);
    }

    public static void makeSounds(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
