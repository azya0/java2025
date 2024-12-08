package TSK_304;

public class Main {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        // Перегрузка
        System.out.println("Sum of two integers: " + mathUtils.add(5, 10));
        System.out.println("Sum of three integers: " + mathUtils.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + mathUtils.add(5.5, 10.5));

        AbstractAnimal myDog = new Dog();
        AbstractAnimal myCat = new Cat();

        // Переопределение
        myDog.makeSound();
        myCat.makeSound();
    }
}