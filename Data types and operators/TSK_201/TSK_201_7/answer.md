Следующий код:

```
int a = 120;
byte b = a + 10;
byte c = (byte)(a + 10);
byte d = a + 1;
```

Не будет выполнен.

Рассмотрим каждую строчку:
1. ```byte b = a + 10``` Выдаст ошибку. Потому что мы пытаемся сузить тип данных до ```byte``` без явного преобразования.
2. ```byte c = (byte)(a + 10);``` Все в порядке. Выдаст -126. Часть бит доведёт число до 126. А 1 бит сменит бит контроля знака с 0 на 1, из-за чего число станет отрицательным.
3. ```byte d = a + 1;``` Аналогично с **пт. 1**