public class Main {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String anotherString = " Hello ";

        // 1. length() - возвращает длину строки
        int length = originalString.length();
        System.out.println("Length of originalString: " + length);

        // 2. charAt(int index) - возвращает символ по заданному индексу
        char characterAtIndex = originalString.charAt(7);
        System.out.println("Character at index 7: " + characterAtIndex);

        // 3. toUpperCase() - преобразует все символы строки в верхний регистр
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Uppercase version: " + upperCaseString);

        // 4. toLowerCase() - преобразует все символы строки в нижний регистр
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Lowercase version: " + lowerCaseString);

        // 5. trim() - удаляет пробелы в начале и конце строки
        String trimmedString = anotherString.trim();
        System.out.println("Trimmed version: '" + trimmedString + "'");

        // 6. substring(int beginIndex) - возвращает подстроку, начиная с указанного индекса
        String substring = originalString.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // 7. substring(int beginIndex, int endIndex) - возвращает подстроку от beginIndex до endIndex
        String subStringRange = originalString.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + subStringRange);

        // 8. indexOf(String str) - возвращает индекс первого вхождения подстроки
        int index = originalString.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // 9. replace(char oldChar, char newChar) - заменяет все вхождения старого символа на новый
        String replacedString = originalString.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedString);

        // 10. split(String regex) - разбивает строку на массив строк по регулярному выражению
        String[] parts = originalString.split(", ");
        System.out.println("Split result: ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
