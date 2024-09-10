package TSK_101;

public class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.print(String.format("Hello! My name is %s!", this.name));
    }
}
