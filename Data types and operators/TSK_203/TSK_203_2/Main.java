package TSK_203.TSK_203_2;

public class Main {
    public static void main(String[] arg) {
        var dog = new Dog();
        var cat = new Cat();

        if (dog instanceof Dog) {
            System.out.println("myDog is an instance of Dog");
        }
        
        if (cat instanceof Cat) {
            System.out.println("myCat is an instance of Cat");
        }
        
        if (dog instanceof Animal) {
            System.out.println("myDog is also an instance of Animal");
        }

        Animal myNullAnimal = null;
        if (myNullAnimal instanceof Animal) {
            System.out.println("This won't print because myNullAnimal is null.");
        } else {
            System.out.println("myNullAnimal is null, so it cannot be an instance of Animal.");
        }

        Flyable fly = new Fly();
        Flyable plane = new Airplane();
        
        if (fly instanceof Flyable) {
            System.out.println("myBird is Flyable");
        }
        
        if (plane instanceof Flyable) {
            System.out.println("myPlane is Flyable");
        }
        
        if (fly instanceof Fly) {
            System.out.println("myPlane is also a Bird (this won't execute)");
        } else {
            System.out.println("myPlane is not a Bird");
        }

        Flyable myNullFlyable = null;
        if (myNullFlyable instanceof Flyable) {
            System.out.println("This won't print because myNullFlyable is null.");
        } else {
            System.out.println("myNullFlyable is null, so it cannot be an instance of Flyable.");
        }
    }
}
