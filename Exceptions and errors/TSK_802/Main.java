package TSK_802;

public class Main {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка ArithmeticException: " + e.getMessage());
        }

        String str = null;
        
        @SuppressWarnings("null")
        int length = str.length();
        System.out.println("Длина строки: " + length);
    }
}