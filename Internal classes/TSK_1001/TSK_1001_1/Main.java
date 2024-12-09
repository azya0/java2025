public class Main {
    // Подробнее в answer.md
    public class PublicInnerClass {
        public void display() {
            System.out.println("Hello from Public Inner Class.");
        }
    }

    private class PrivateInnerClass {
        public void display() {
            System.out.println("Hello from Private Inner Class.");
        }
    }

    // Метод для создания и работы с приватным внутренним классом
    public void createPrivateInner() {
        PrivateInnerClass inner = new PrivateInnerClass();
        inner.display();
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        
        // Работа с публичным внутренним классом
        PublicInnerClass publicInner = mainInstance.new PublicInnerClass();
        publicInner.display();
        
        // Работа с приватным внутренним классом
        mainInstance.createPrivateInner();
    }
}