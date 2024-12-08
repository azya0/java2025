package TSK_202;

public class Animal {
    private String name;

    /**
     * Конструктор для создания животного с заданным именем.
     * 
     * @param name имя животного
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Метод для получения имени животного.
     * 
     * @return имя животного
     */
    public String getName() {
        return name;
    }

    /**
     * Метод, который заставляет животное издать звук.
     */
    public void makeSound() {
        System.out.println("Животное издает звук.");
    }
}