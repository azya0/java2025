public class Main {
    public interface MyInterface {
        default void displayMessage(String message) {
            System.out.println("Message: " + message);
        }
    
        static void printStaticMessage() {
            System.out.println("Это вызывается из интерфейса.");
        }
    }

    public class MyClass implements MyInterface {
        public void customMethod() {
            displayMessage("А это из класса!");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        MyClass myClassInstance = main.new MyClass();

        myClassInstance.customMethod();

        myClassInstance.displayMessage("Тестим, осталось ли.");

        MyInterface.printStaticMessage();
    }
}
