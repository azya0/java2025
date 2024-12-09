package TSK_1001.TSK_1001_3;

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInner();
    }
}

class OuterClass {
    public class InnerClass {
        private String innerPrivateField = "Внешнее приватное поле";
        public String innerPublicField = "Внешнее публичное поле";

        private void innerPrivateMethod() {
            System.out.println("Внутренний приватный метод");
        }

        public void innerPublicMethod() {
            System.out.println("Внутренний публичный метод");
        }
    }

    public void accessInner() {
        InnerClass inner = new InnerClass();

        System.out.println(inner.innerPrivateField);
        System.out.println(inner.innerPublicField); 

        inner.innerPrivateMethod();
        inner.innerPublicMethod(); 
    }
}
