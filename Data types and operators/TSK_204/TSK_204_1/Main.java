package TSK_204.TSK_204_1;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        // Исходная строка, закодированная в Base64
        String originalInput = "Hello, World!";
        
        // Кодируем строку в Base64
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("Encoded string: " + encodedString);
        
        // Декодируем строку из Base64
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);
    }
}
