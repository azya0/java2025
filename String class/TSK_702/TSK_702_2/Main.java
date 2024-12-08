package TSK_702.TSK_702_2;

public class Main {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer
        String str = "Hello, World!";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("StringBuffer: " + stringBuffer);

        // Преобразование String в StringBuilder
        String str2 = "Hello, Java!";
        StringBuilder stringBuilder = new StringBuilder(str2);
        System.out.println("StringBuilder: " + stringBuilder);

        // Преобразование StringBuffer в String
        String strFromBuffer = stringBuffer.toString();
        System.out.println("String from StringBuffer: " + strFromBuffer);

        // Преобразование StringBuilder в String
        String strFromBuilder = stringBuilder.toString();
        System.out.println("String from StringBuilder: " + strFromBuilder);

        // Преобразование StringBuffer в StringBuilder
        StringBuilder sbConverted = new StringBuilder(stringBuffer.toString());
        System.out.println("Converted StringBuilder: " + sbConverted);

        // Преобразование StringBuilder в StringBuffer
        StringBuffer bufferConverted = new StringBuffer(stringBuilder.toString());
        System.out.println("Converted StringBuffer: " + bufferConverted);
    }
}

