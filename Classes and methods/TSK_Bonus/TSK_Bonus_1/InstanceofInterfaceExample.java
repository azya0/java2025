package TSK_Bonus.TSK_Bonus_1;

interface Container<T> {
    T getItem();
}

class StringContainer implements Container<String> {
    private String item;

    public StringContainer(String item) {
        this.item = item;
    }

    @Override
    public String getItem() {
        return item;
    }
}

class IntegerContainer implements Container<Integer> {
    private Integer item;

    public IntegerContainer(Integer item) {
        this.item = item;
    }

    @Override
    public Integer getItem() {
        return item;
    }
}

public class InstanceofInterfaceExample {
    public static void main(String[] args) {
        Container<String> stringContainer = new StringContainer("Test");
        Container<Integer> integerContainer = new IntegerContainer(123);

        checkContainerType(stringContainer);
        checkContainerType(integerContainer);
    }

    public static void checkContainerType(Container<?> container) {
        if (container instanceof StringContainer) {
            System.out.println("Это контейнер для строки");
        } else if (container instanceof IntegerContainer) {
            System.out.println("Это контейнер для целого числа");
        } else {
            System.out.println("Это контейнер другого типа");
        }
    }
}