package TSK_206.TSK_206_1;

public class Main {
    public static void byteSwitch() {
        byte num = 1;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }

    public static void shortSwitch() {
        short num = 2;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }

    public static void intSwitch() {
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
    }

    public static void charSwitch() {
        char ch = 'A';
        switch (ch) {
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
        }
    }

    public static void stringSwitch() {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("End of the work week");
                break;
        }
    }

    public static void enumSwitch() {
        enum Direction {
            NORTH, SOUTH, EAST, WEST;
        }
        
        Direction dir = Direction.NORTH;
        switch (dir) {
            case NORTH:
                System.out.println("Going North");
                break;
            case SOUTH:
                System.out.println("Going South");
                break;
            case EAST:
                System.out.println("Going East");
                break;
            case WEST:
                System.out.println("Going West");
                break;
        }
    }

    public static void primitiveTypesShells() {
        Integer num = 3;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
    }

    public static void main(String[] arg) {
        byteSwitch();
        shortSwitch();
        intSwitch();
        charSwitch();
        stringSwitch();
        enumSwitch();
        primitiveTypesShells();
    }
}
