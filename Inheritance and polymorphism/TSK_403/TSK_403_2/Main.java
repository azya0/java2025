package TSK_403.TSK_403_2;

public class Main {
    class A {
        int a = 10;

        void method() {
            System.out.println("Метод из класса A, значение a: " + a);
        }
    }

    class B extends A {
        // B не добавляет новых переменных или методов
    }

    class C extends B {
        void method() {
            int a = super.a;
            System.out.println("Значение a в классе C: " + a);
            
            // Вызов метода класса A
            super.method();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        C obj = main.new C();
        obj.method();
    }
}
