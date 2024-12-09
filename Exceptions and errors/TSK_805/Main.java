package TSK_805;

public class Main {
    public class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        try {
            setAge(150, main);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        System.out.println("Программа продолжает работу после обработки исключения.");
    }

    public static void setAge(int age, Main main) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw main.new InvalidAgeException("Возраст должен быть в диапазоне от 0 до 120.");
        }
        System.out.println("Возраст установлен: " + age);
    }
}
