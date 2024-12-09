package TSK_1001.TSK_1001_2;

public class Main {
    private String privateField = "I'm private!";
    public String publicField = "I'm public!";

    private void privateMethod() {
        System.out.println("Приватный метод в Main.");
    }

    public void publicMethod() {
        System.out.println("Публичный метод в Main.");
    }

    class InnerClass {
        public void accessOuter() {
            System.out.println(privateField);
            System.out.println(publicField); 
            
            privateMethod(); 
            publicMethod();  
        }
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        InnerClass innerInstance = mainInstance.new InnerClass();
        innerInstance.accessOuter();
    }
}