package TSK_201.TSK_201_5;

public class Main {
    public static void main(String[] args) {
        // Для всех операций: результат будет иметь тип переменной,
        // имеющей наибольший вес.

        int intValue = 5;
        double doubleValue = 4.5;

        double result = intValue + doubleValue; // int преобразуется в double
        System.out.println("Сложение: " + result); // Вывод: 9.5

        long longValue = 100000L;
        double doubleValue1 = 2.5;

        // Умножение long и double
        double result1 = longValue * doubleValue1; // long преобразуется в double
        System.out.println("Умножение: " + result1); // Вывод: 250000.0

        byte byteValue = 10;
        int intValue1 = 15;
        double doubleValue2 = 2.5;

        // Комплексная операция
        double result2 = byteValue + intValue1 * doubleValue2; // int будет умножаться на double
        System.out.println("Комплексная операция: " + result2); // Вывод: 47.5
    }
}
