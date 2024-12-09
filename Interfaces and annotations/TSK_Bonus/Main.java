package TSK_Bonus;

import java.util.ArrayList;
import java.util.List;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override // Аннотация @Override используется для обозначения того, что метод переопределяет метод суперкласса. 
    void makeSound() {
        System.out.println("Bark");
    }
}

class OldLibrary {
    @Deprecated // Аннотация @Deprecated указывает, что элемент (метод, класс и т. д.) устарел и не должен использоваться в дальнейшем коде. 
    void oldMethod() {
        System.out.println("This method is deprecated.");
    }
    
    void newMethod() {
        System.out.println("This is the new method.");
    }
}

public class Main {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        OldLibrary library = new OldLibrary();
        library.oldMethod();
        
        library.newMethod();

        List list = new ArrayList(); // Упрощенная и не безопасная запись
        list.add("Hello");
        list.add("World");
        
        for (String str : (List<String>) list) { // Здесь генерируется предупреждение
            System.out.println(str);
        }
    }
}