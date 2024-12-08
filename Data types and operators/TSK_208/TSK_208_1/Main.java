package TSK_208.TSK_208_1;

public class Main {
    public static void printArray(int[] value, int length) {
        for (int index = 0; index < length; index++) {
            System.out.print(value[index] + (index == length - 1 ? "\n" : ", "));
        }
    }
    public static void main(String[] arg) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};
        a1 = a2;

        System.out.println();
        printArray(a1, 5);
        printArray(a2, 5);

        a2[2] = 14;

        System.out.println();
        printArray(a1, 5);
        printArray(a2, 5);

        // Таким образом мы скопировали ссылку a2 в a1,
        // Такая же "механника" есть, например, в питоне
    }
}
