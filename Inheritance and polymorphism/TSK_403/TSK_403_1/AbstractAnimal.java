package TSK_403.TSK_403_1;

class AbstractAnimal {
    String sound;

    public AbstractAnimal(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("Животное издает звук: " + sound);
    }
}
