package TSK_203.TSK_203_1;

public class Main {
    public static void BaseFunc(FunctionInterface functionInterface, Integer value) {
        System.out.println("Before: " + value);

        System.out.println("During: " + functionInterface.function(value));

        System.out.println("After: " + value);
    }
    public static void testPrefix(boolean sum, Integer value) {
        if (sum) {
            BaseFunc((x) -> ++x, value);
            return;
        }
        
        BaseFunc((x) -> --x, value);
    }

    public static void testPostfix(boolean sum, Integer value) {
        if (sum) {
            BaseFunc((x) -> x++, value);   
        }

        BaseFunc((x) -> x--, value);  
    }

    public static void main(String[] arg) {
        int test = 5;

        System.out.println("Prefix sum: ");
        testPrefix(true, test);

        System.out.println("Prefix diff: ");
        testPrefix(false, test);

        System.out.println("Postfix sum: ");
        testPrefix(true, test);

        System.out.println("Postfix diff: ");
        testPrefix(false, test);
    }
}
