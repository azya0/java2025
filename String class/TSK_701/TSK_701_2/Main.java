package TSK_701.TSK_701_2;

import java.util.StringJoiner;

public class Main {
    public void firstExample() {
        StringJoiner joiner = new StringJoiner(", ");
        
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        
        String result = joiner.toString();
        System.out.println(result);
    }

    public void secondExample() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        
        joiner.add("One");
        joiner.add("Two");
        joiner.add("Three");
        
        String result = joiner.toString();
        System.out.println(result);
    }

    public void thirdExample() {
        String[] fruits = { "Mango", "Pineapple", "Grapes" };
        StringJoiner joiner = new StringJoiner(" | ");
        
        for (String fruit : fruits) {
            joiner.add(fruit);
        }
        
        String result = joiner.toString();
        System.out.println(result);
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.firstExample();
        main.secondExample();
        main.thirdExample();
    }
}
