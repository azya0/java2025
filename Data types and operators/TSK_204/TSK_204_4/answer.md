Следующий код:
```
int i1 = 128;
    Integer a1 = i1;
    Integer b1 = i1;
    System.out.println("a1==i1 " + (a1 == i1));
    System.out.println("b1==i1 " + (b1 == i1));
    System.out.println("a1==b1 " + (a1 == b1));
    System.out.println("a1.equals(i1) -> " + a1.equals(i1));
    System.out.println("b1.equals(i1) -> " + b1.equals(i1));
    System.out.println("a1.equals(b1) -> " + a1.equals(b1));

    int i2 = 127;
    Integer a2 = i2;
    Integer b2 = i2;
    System.out.println("a2==i2 " + (a2 == i2));
    System.out.println("b2==i2 " + (b2 == i2));
    System.out.println("a2==b2 " + (a2 == b2));
    System.out.println("a2.equals(i2) -> " + a2.equals(i2));
    System.out.println("b2.equals(i2) -> " + b2.equals(i2));
    System.out.println("a2.equals(b2) -> " + a2.equals(b2));
```

Выведет: 
```
a1==i1 true
b1==i1 true
a1==b1 false
a1.equals(i1) -> true
b1.equals(i1) -> true
a1.equals(b1) -> true
a2==i2 true
b2==i2 true
a2==b2 true
a2.equals(i2) -> true
b2.equals(i2) -> true
a2.equals(b2) -> true
```

1. Автоупаковка и сравнение с примитивами:
    * В случае i1 = 128, когда создаются объекты a1 и b1, происходит автоупаковка значения 128 в объект Integer. Так как 128 находится за пределами диапазона кэширования IntegerCache (от -128 до 127), каждый вызов Integer.valueOf(int) создает новый объект. Поэтому a1 и b1 указывают на разные объекты, и a1 == b1 возвращает false.
    * Для i2 = 127, так как значение 127 находится в диапазоне кэширования IntegerCache, a2 и b2 ссылаются на один и тот же объект, и поэтому a2 == b2 возвращает true.
2. Метод equals:
    * Метод equals сравнивает значения, а не ссылки, поэтому в обоих случаях, когда используются a1.equals(i1), b1.equals(i1), a2.equals(i2), b2.equals(i2) и a2.equals(b2), результат будет true, так как значения объектов равны.

### Класс IntegerCache

Класс **IntegerCache** используется для оптимизации работы с объектами типа Integer. Он кэширует объекты Integer для диапазона значений от -128 до 127. Этот подход позволяет избежать создания новых объектов для частых значений и уменьшить потребление памяти.

В частности, все значения в этом диапазоне будут возвращаться из кэша, что позволяет:
* Уменьшить накладные расходы на память, так как одно и то же значение кэшируется и повторно используется.
* Улучшить производительность, так как не происходит наложение дополнительных операций по созданию объектов.
