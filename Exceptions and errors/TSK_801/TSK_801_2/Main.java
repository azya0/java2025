public class Main {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка ArithmeticException: " + e.getMessage());
        }

        int[] array = {1, 2, 3};
        try {
            System.out.println("Элемент массива: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            throwIllegalArgumentException(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка IllegalArgumentException: " + e.getMessage());
        }

        try {
            Object obj = "Hello";
            @SuppressWarnings("unused")
            Integer number = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Ошибка ClassCastException: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println("Длина строки: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Ошибка NullPointerException: " + e.getMessage());
        }
    }

    private static void throwIllegalArgumentException(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение не должно быть отрицательным");
        }
    }
}