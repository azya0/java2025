## Объяснение

1. В цикле for (1):
    * В этом цикле мы итерируем массив num, содержащий элементы типа Number. Каждый элемент в массиве будет иметь тип Number, и когда мы вызываем a.printNum(n), Java использует механизм связывания во время выполнения (dynamic binding), чтобы выбрать наиболее подходящий метод для каждого значения n.

        Рассмотрим каждый элемент массива num:

        1. new Integer(1):  
        n будет ссылкой на Integer, поэтому будет вызван метод printNum(Integer i).
        * Вывод: Integer = 1

        2. 11:  
        Это примитивный тип int, который автоматически упаковывается в объект Integer, но в этом случае Java найдет метод printNum(int i) для примитивного типа.
        * Вывод: int = 11

        3. 1.11f:  
        Это примитивный тип float, который будет упакован в объект Float. Для этого будет вызван метод printNum(Float f).
        * Вывод: Float = 1.1100.

        4. 11.11:
        Это примитивный тип double, который будет упакован в Double, но при этом будет вызван метод printNum(Number n) (так как нет другого подходящего метода для double).
        * Вывод: Number=11.11.

2. В вызовах (2):
    * Теперь рассмотрим вызовы, которые происходят после цикла for:

    1. a.printNum(new Integer(1));  
    Это явный объект типа Integer.
    * Вывод: Integer = 1.

    2. a.printNum(11);  
    Как и в цикле, 11 обрабатывается как примитивный тип int, вызывая printNum(int i).
    * Вывод: int = 11.
    
    3. a.printNum(1.11f);
    Это также примитивный тип float, который будет упакован в Float.
    * Вывод: Float = 1.1100.

    4. a.printNum(11.11);
    Это примитивный тип double, который также будет упакован в объект. Но поскольку не найдено ни одного метода, принимающего double, используется метод printNum(Number n).
    * Вывод: Number=11.11.


## Таким образом:  
В результате различия в выводе возникают из-за механизма динамической диспетчеризации методов, основанного на типе аргумента, находящегося на момент вызова метода. В цикле for мы передаем элементы массива Number, что позволяет Java выбирать наиболее подходящий метод для объектов, основываясь на их фактическом типе. Однако в вызовах (2) мы передаем значения непосредственно, и для них Java может использовать соответствующие перегруженные методы, если они соответствуют типам значений.

## А что выведет-то?

```
Number=11
Number=1.11
Number=11.11
Integer = 1
int = 11
Float = 1,1100
Number=11.11
```
