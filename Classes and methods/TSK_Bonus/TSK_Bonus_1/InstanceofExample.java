package TSK_Bonus.TSK_Bonus_1;

import java.util.ArrayList;
import java.util.List;

public class InstanceofExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        
        checkType(stringList);
        checkType(integerList);
    }

    public static void checkType(List<?> list) {
        if (list instanceof List<?>) {
            System.out.println("Это список (List)");
        }

        if (list instanceof ArrayList<?>) {
            System.out.println("Это ArrayList");
        }
    }
}