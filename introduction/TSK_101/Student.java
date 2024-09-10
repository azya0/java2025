package TSK_101;

public class Student extends Human {
    public Student(String name) {
        super(name);
    }

    public void greet() {
        super.greet();
        System.out.print(" I am a poor student!");
    }
}
