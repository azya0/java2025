package TSK_311.TSK_311_1;

public class Shop {
    enum CoffeeType {
        ESPRESSO("Espresso", 2.50),
        AMERICANO("Americano", 2.00),
        CAPPUCCINO("Cappuccino", 3.00),
        LATTE("Latte", 3.50);

        private final String name;
        private final double price;

        CoffeeType(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    public void printMenu() {
        System.out.println("Coffee Menu:");
        for (CoffeeType coffee : CoffeeType.values()) {
            System.out.printf("%s - %.2f\n", coffee.getName(), coffee.getPrice());
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.printMenu();
    }
}
