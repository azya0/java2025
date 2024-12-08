package TSK_402.TSK_402_2;

public class Main {
    // Объявляем финальный класс
    final class FinalClass {
        public void display() {
            System.out.println("Это метод финального класса.");
        }
    }

    // Попытка создать подкласс финального класса
    // class SubClass extends FinalClass { // <- Ошибка компиляции
    //     public void show() {
    //         System.out.println("Это метод подкласса.");
    //     }
    // }

    public static void main(String[] args) {
        Main main = new Main();
        FinalClass finalClass = main.new FinalClass();
        finalClass.display();
        
        // Создаем экземпляр подкласса (это уже невозможно, код не компилируется)
        // SubClass subClass = main.new SubClass();
        // subClass.show();
    }
}
