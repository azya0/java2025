package TSK_310;

public class Main {
    public int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    
    public double sum(double... numbers) {
        double total = 0.0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }
    
    public void printNumbers(int... numbers) {
        System.out.print("Integers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
    public void printNumbers(double... numbers) {
        System.out.print("Doubles: ");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main utils = new Main();

        int intSum = utils.sum(1, 2, 3, 4, 5);
        double doubleSum = utils.sum(1.1, 2.2, 3.3);
        
        System.out.println("Сумма целых чисел: " + intSum);
        System.out.println("Сумма чисел с плавающей запятой: " + doubleSum);
        
        utils.printNumbers(10, 20, 30);
        utils.printNumbers(1.1, 2.2, 3.3);
    }
}
