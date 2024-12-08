package TSK_Bonus.TSK_Bonus_1;

class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class InstanceofWithGenerics {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(123);

        checkBoxType(stringBox);
        checkBoxType(integerBox);
    }

    public static void checkBoxType(Box<?> box) {
        if (box instanceof Box<?>) {
            System.out.println("Это экземпляр Box");
        }

        // Здесь нельзя проверить конкретный тип T, так как он стирается
        // if (box instanceof Box<String>) {
        //     System.out.println("Это Box, содержащий строку");
        // } else if (box instanceof Box<Integer>) {
        //     System.out.println("Это Box, содержащий целое число");
        // } else {
        //     System.out.println("Это Box с другим типом");
        // }
    }
}
