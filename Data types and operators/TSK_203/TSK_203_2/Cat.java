package TSK_203.TSK_203_2;


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
