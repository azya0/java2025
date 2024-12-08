package TSK_206.TSK_206_2;

public class Main {
    public static void main(String[] arg) {
        // Подробнее в answer.md
        
        int i = 0;

        switch (2) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
        }

        System.out.println("\n" + i);
    }
}
