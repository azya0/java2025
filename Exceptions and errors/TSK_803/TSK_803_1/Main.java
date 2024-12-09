package TSK_803.TSK_803_1;

class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throwEx1();
        } catch (Ex1 e) {
            System.out.println("Обработано исключение: " + e.getMessage());
        }
    }

    public static void throwEx1() throws Ex1 {
        throw new Ex3("Ошибка типа Ex3");
    }
}
