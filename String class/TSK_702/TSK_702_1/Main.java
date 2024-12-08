package TSK_702.TSK_702_1;

public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("World");

        // 1. append() - добавляет строку в конец
        stringBuffer.append(" World");
        // stringBuilder.append("!");
        System.out.println("StringBuffer after append: " + stringBuffer);

        // 2. insert() - вставляет строку по указанному индексу
        stringBuilder.insert(5, "!");
        System.out.println("StringBuilder after insert: " + stringBuilder);

        // 3. delete() - удаляет участок строки от начала до конца
        stringBuffer.delete(5, 11); // Удаление " World"
        System.out.println("StringBuffer after delete: " + stringBuffer);

        // 4. replace() - заменяет часть строки между двумя индексами
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("StringBuffer after replace: " + stringBuffer);

        // 5. reverse() - переворачивает строку
        stringBuilder.reverse();
        System.out.println("StringBuilder after reverse: " + stringBuilder);

        // 6. capacity() - возвращает текущую емкость StringBuffer/StringBuilder
        int bufferCapacity = stringBuffer.capacity();
        System.out.println("StringBuffer capacity: " + bufferCapacity);

        // 7. length() - возвращает текущую длину строки
        int builderLength = stringBuilder.length();
        System.out.println("StringBuilder length: " + builderLength);

        // 8. substring() - возвращает подстроку от заданного индекса
        String subStringBuffer = stringBuffer.substring(1, 2);
        System.out.println("Substring of StringBuffer: " + subStringBuffer);

        // 9. charAt() - возвращает символ по указанному индексу
        char charAtBuilder = stringBuilder.charAt(1);
        System.out.println("Character at index 1 of StringBuilder: " + charAtBuilder);

        // 10. toString() - преобразует StringBuffer/StringBuilder в String
        String finalStringBuffer = stringBuffer.toString();
        System.out.println("Final StringBuffer as String: " + finalStringBuffer);
    }
}
