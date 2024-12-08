package TSK_404.TSK_404_1;

// Этот код был до, но сюда он снова подходит
public class Main {
    class Calculator {
    
        public int add(int a, int b) {
            return a + b;
        }
        
        public int add(int a, int b, int c) {
            return a + b + c;
        }
        
        public double add(double a, double b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Calculator calc = main.new Calculator();
        
        System.out.println("Сложение двух целых чисел: " + calc.add(5, 10));
        System.out.println("Сложение трех целых чисел: " + calc.add(5, 10, 15));
        System.out.println("Сложение двух чисел с плавающей точкой: " + calc.add(5.5, 10.2));
    }
}
