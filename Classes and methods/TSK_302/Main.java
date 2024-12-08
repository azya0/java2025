package TSK_302;

public class Main {
    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        
        System.out.println("Публичная: " + demo.publicVar);
        demo.displayPublic();

        System.out.println("Протектная: " + demo.protectedVar);
        demo.displayProtected(); 

        System.out.println("Приватная: " + demo.packagePrivateVar);
        demo.displayPackagePrivate(); 

        SamePackageSubclass subclassDemo = new SamePackageSubclass();
        subclassDemo.display();
        
        AnotherDifferentPackage differentPackageDemo = new AnotherDifferentPackage();
        differentPackageDemo.display();
    }
}
