package TSK_201.TSK_201_8;

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
