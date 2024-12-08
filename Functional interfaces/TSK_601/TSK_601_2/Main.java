package TSK_601.TSK_601_2;

public class Main {
    public interface InterfaceA {
        default void showMessage() {
            System.out.println("Это вызывается из интерфейса A");
        }
    }
    
    // Второй интерфейс
    public interface InterfaceB {
        default void showMessage() {
            System.out.println("Это вызывается из интерфейса B");
        }
    }

    public class MyClass implements InterfaceA, InterfaceB {
        // Явное разрешение конфликта
        @Override
        public void showMessage() {
            InterfaceA.super.showMessage();
            InterfaceB.super.showMessage();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        MyClass myClassInstance = main.new MyClass();

        myClassInstance.showMessage();
    }
}