package TSK_203.TSK_203_2;

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Гав!");
    }
    
    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }
}
