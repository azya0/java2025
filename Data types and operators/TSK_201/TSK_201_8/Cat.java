package TSK_201.TSK_201_8;

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Мяу!");
    }
    
    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }
}
