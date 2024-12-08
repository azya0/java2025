package TSK_405;

public class Main {
    // Ответ в answer.md
    
    class A {
        public static void method() {
            System.out.println("A's static method");
        }
    }

    class B extends A {
        public static void method() {
            System.out.println("B's static method");
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Main main = new Main();
        A obj = main.new B();
        obj.method(); // Выведет: "A's static method"
    }
}
