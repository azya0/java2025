package TSK_208.TSK_208_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String result = Arrays.toString(numbers);
        System.out.println("Массив: " + result);
        
        int index = Arrays.binarySearch(numbers, 3);
        if (index >= 0) {
            System.out.println("Элемент 3 найден на индексе: " + index);
        } else {
            System.out.println("Элемент 3 не найден.");
        }
        
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};
        
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Массивы array1 и array2 равны: " + areEqual);
        
        areEqual = Arrays.equals(array1, array3);
        System.out.println("Массивы array1 и array3 равны: " + areEqual);
        
        int[] unsortedArray = {5, 2, 4, 1, 3};
        Arrays.sort(unsortedArray);
        System.out.println("Отсортированный массив: " + Arrays.toString(unsortedArray));
    }
}