package TSK_103;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.print(String.format("Привет, %s!", name));
        scan.close();
    }
}
