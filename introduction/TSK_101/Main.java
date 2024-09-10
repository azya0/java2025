package TSK_101;

public class Main {
    public static void greet(Human human) {
        human.greet();
        System.out.println();
    }

    public static void main(String[] args) {
        greet(new Human("Dave"));
        greet(new Student("Azya"));
    }
}
