package TSK_302;

class SamePackageSubclass extends AccessModifiersDemo {
    public void display() {
        System.out.println("Из подкласса того же пакета:");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(packagePrivateVar);
        // System.out.println(privateVar);      // Нет доступа. Если разкомментировать, то ошибка
    }
}
