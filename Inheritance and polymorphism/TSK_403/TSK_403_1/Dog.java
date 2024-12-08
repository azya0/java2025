package TSK_403.TSK_403_1;

class Dog extends AbstractAnimal {
    String name;

    public Dog(String name, String sound) {
        super(sound); // Вызов конструктора родительского класса Animal
        this.name = name;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(name + " говорит: " + sound);
    }

    public void showInfo() {
        System.out.println("Имя собаки: " + name);
        System.out.println("Звук, который издает собака: " + super.sound);
    }
}
