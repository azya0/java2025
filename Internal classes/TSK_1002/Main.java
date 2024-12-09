package TSK_1002;

public class Main {
    interface MyInterface {
        void interfaceMethod();

        class NestedInnerClass {
            public void nestedMethod() {
                System.out.println("Method of Nested Inner Class");
            }
        }

        static class NestedStaticClass {
            public void staticMethod() {
                System.out.println("Method of Nested Static Class");
            }
        }
    }

    public static void main(String[] args) {
        MyInterface.NestedInnerClass nestedInner = new MyInterface.NestedInnerClass();
        nestedInner.nestedMethod();

        MyInterface.NestedStaticClass nestedStatic = new MyInterface.NestedStaticClass();
        nestedStatic.staticMethod();
    }
}
