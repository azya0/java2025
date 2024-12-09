package TSK_901.TSK_901_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("output.txt");

            String data = "Hello, World!";
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i));
            }

            fos.write('\n');

            String additionalData = "Это пример работы с методом write(int) в классе OutputStream.";
            for (int i = 0; i < additionalData.length(); i++) {
                fos.write(additionalData.charAt(i));
            }

            System.out.println("Данные успешно записаны в файл 'output.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
