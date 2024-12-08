package TSK_204.TSK_204_2;

public class Main {
    public static void main(String[] arg) {
        // До 9ой версии:

        Boolean bool1 = new Boolean(true);
        Boolean bool2 = new Boolean(false);
      
        Boolean bool3 = new Boolean("true"); // true
        Boolean bool4 = new Boolean("false"); // false
        Boolean bool5 = new Boolean("random"); // false
        
        // Среда разработки подсказывает, что:
        // The constructor Boolean(boolean) has been deprecated since version 9 and marked for
        
        // После 9ой версии:
      
        Boolean bool6 = Boolean.valueOf(true);  // true
        Boolean bool7 = Boolean.valueOf(false); // false

        Boolean bool8 = Boolean.valueOf("TRUE");   // true
        Boolean bool9 = Boolean.valueOf("false");   // false
        Boolean bool10 = Boolean.valueOf("random");  // false
    }
}
