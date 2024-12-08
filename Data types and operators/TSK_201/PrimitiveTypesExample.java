package TSK_201;

public class PrimitiveTypesExample {
    byte byteValue = 100; // 1 байт (8 бит) - знак
    short shortValue = 10000; // 2 байта (16 бит) - знак
    int intValue; // 4 байта (32 бита) - знак. Протестируем с нулевым значением (значение по умолчанию)
    long longValue = 10000000000L; // 8 байт (64 бита) - знак
    float floatValue = 10.5f; // 4 байта (32 бита) - число с плавающей точкой одинарной точности
    double doubleValue = 20.99; // 8 байт (64 бита) - число с плавающей точкой двойной точности
    char charValue = 'A'; // 2 байта (16 бит) - символ
    boolean booleanValue = true; // 1 байт (размер не определён) - логическое значение (true или false)
    
    public void PrintLn() {
        System.out.println("Byte значение: " + byteValue);
        System.out.println("Short значение: " + shortValue);
        System.out.println("Int значение: " + intValue + "<- нулевое");
        System.out.println("Long значение: " + longValue);
        System.out.println("Float значение: " + floatValue);
        System.out.println("Double значение: " + doubleValue);
        System.out.println("Char значение: " + charValue);
        System.out.println("Boolean значение: " + booleanValue);
    }
}