package TSK_Bonus.TSK_Bonus_2;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("Звуки животного... Опять... Ну нет у меня фантазии, что поделать?");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("ГААААВВВ!!!!");
    }
}

class LowerBoundExample {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        addDog(animals);
        
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void addDog(List<? super Dog> dogs) {
        dogs.add(new Dog());
    }
}