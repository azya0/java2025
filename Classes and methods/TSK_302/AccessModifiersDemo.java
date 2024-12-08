package TSK_302;

public class AccessModifiersDemo {
    // Public variable
    public String publicVar = "public";
    
    // Private variable
    private String privateVar = "private";
    
    // Protected variable
    protected String protectedVar = "protected";
    
    String packagePrivateVar = "package-private";

    public void displayPublic() {
        System.out.println(publicVar);
    }
    
    @SuppressWarnings("unused")
    private void displayPrivate() { // Чисто чтобы затестить недоступность
        System.out.println(privateVar);
    }
    
    protected void displayProtected() {
        System.out.println(protectedVar);
    }
    
    void displayPackagePrivate() {
        System.out.println(packagePrivateVar);
    }
}

