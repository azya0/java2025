package TSK_803.TSK_803_2;

public class Main {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Результат деления: " + result);
        } catch (final ArithmeticException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        System.out.println("Программа продолжает работу после обработки исключения.");
    }
}
