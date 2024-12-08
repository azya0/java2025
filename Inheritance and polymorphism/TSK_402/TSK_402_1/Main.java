public class Main {
    public class SuperClass {
        // Метод, который не может быть переопределен
        public final void displayMessage() {
            System.out.println("ЫЫЫЫЫЫЫЛЫБО МИИИИИИ");
        }
    }
    
    // Подкласс
    public class SubClass extends SuperClass {
        // public void displayMessage() { // <- Ошибка тут
        //     System.out.println("УУУУФЫАВАЫФВФАВЫФВАЫФВАЫФВЫА");
        // }
    }

    public static void main(String[] args) {
        Main main = new Main();

        Main.SuperClass superClass = main.new SuperClass();
        superClass.displayMessage();

        SubClass subClass = main.new SubClass();
        subClass.displayMessage();
    }
}
