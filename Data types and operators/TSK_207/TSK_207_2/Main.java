package TSK_207.TSK_207_2;

public class Main {
    public static void main(String[] arg) {
        double result = 0;
        int counter = 0;

        while ((++counter) > 0) {
            if (counter % 2 != 0) {
                continue;
            }

            result += counter;

            if (counter == 1234567890) {
                break;
            }
        }

        System.out.println(result);
    }
}
