package TSK_204.TSK_204_3;

public class Main {
    public static void main(String[] args) {
        Integer integerObject = null; // Объект Integer инициализирован значением null
        
        try {
            // Попытка автораспаковки, будет выброшено исключение NullPointerException
            @SuppressWarnings("null")
            int primitiveInt = integerObject; // Автораспаковка
            System.out.println("Значение primitiveInt: " + primitiveInt);
        } catch (NullPointerException e) {
            System.out.println("Исключение: " + e);
        }
    }

}
