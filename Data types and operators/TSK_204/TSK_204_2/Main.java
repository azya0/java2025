package TSK_204.TSK_204_2;

public class Main {
    public static void main(String[] arg) {
        // До 9ой версии:

        @SuppressWarnings("removal")
        Boolean bool1 = new Boolean(true);

        @SuppressWarnings("removal")
        Boolean bool2 = new Boolean(false);
        
        @SuppressWarnings("removal")
        Boolean bool3 = new Boolean("true"); // true

        @SuppressWarnings("removal")
        Boolean bool4 = new Boolean("false"); // false

        @SuppressWarnings("removal")
        Boolean bool5 = new Boolean("random"); // false
        
        // Среда разработки подсказывает, что:
        // The constructor Boolean(boolean) has been deprecated since version 9 and marked for
        
        // После 9ой версии:
      
        Boolean bool6 = Boolean.valueOf(true);  // true
        Boolean bool7 = Boolean.valueOf(false); // false

        Boolean bool8 = Boolean.valueOf("TRUE");   // true
        Boolean bool9 = Boolean.valueOf("false");   // false
        Boolean bool10 = Boolean.valueOf("random");  // false

        System.out.println(
            bool1 + " " +
            bool2 + " " +
            bool3 + " " +
            bool4 + " " +
            bool5 + " " +
            bool6 + " " +
            bool7 + " " +
            bool8 + " " +
            bool9 + " " +
            bool10
        );
    }
}
