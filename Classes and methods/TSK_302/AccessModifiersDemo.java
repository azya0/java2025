package TSK_302;

public class AccessModifiersDemo {
    public String publicVar = "public";
    private String privateVar = "private";
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

