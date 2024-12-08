package TSK_201.TSK_201_6;

public class Main {
    public static void main(String[] args) {
        // Для сужения нужно явное указание (уменьшаемый тип) value

        double doubleValue = 9.99;
        // Преобразование double в int

        int intValue = (int) doubleValue; // явное преобразование
        System.out.println("Преобразование double в int: " + intValue); // Вывод: 9
    }
}
