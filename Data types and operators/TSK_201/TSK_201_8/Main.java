package TSK_201.TSK_201_8;

public class Main {
    public static void testAnimal(Animal animal) {
        animal.sound();
        animal.eat();
    }
    
    public static void main(String[] arg) {
        testAnimal(new Dog());
        testAnimal(new Cat());
    }
}
