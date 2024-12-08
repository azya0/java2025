package TSK_302;

public class AnotherDifferentPackage {
    public void display() {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        System.out.println("From a different package:");
        System.out.println(demo.publicVar);
        // System.out.println(demo.protectedVar); // Если раскомментировать, то ошибка
        // System.out.println(demo.privateVar);   // Если раскомментировать, то ошибка
        // System.out.println(demo.packagePrivateVar); // Если раскомментировать, то ошибка
    }
}
