package TSK_703.TSK_703_1;

public class Main {
    public static void main(String[] args) {
        boolean isJavaFun = true; // Спецификатор %b
        char grade = 'A'; // Спецификатор %c
        int age = 25; // Спецификатор %d
        double pi = 3.14159; // Спецификатор %f
        String name = "Alex"; // Спецификатор %s
        long milliseconds = System.currentTimeMillis(); // Для %t

        // Форматированный вывод
        System.out.printf("Is Java fun? %b%n", isJavaFun); // %b
        System.out.printf("Your grade is: %c%n", grade); // %c
        System.out.printf("You are %d years old.%n", age); // %d
        System.out.printf("Value of pi: %.2f%n", pi); // %f (с ограничением до 2 знаков после запятой)
        System.out.printf("Hello, %s!%n", name); // %s
        System.out.printf("Current Time in milliseconds: %tT%n", milliseconds); // %t
    }
}
