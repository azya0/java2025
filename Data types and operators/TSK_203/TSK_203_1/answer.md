Примеры операторов с базовыми типами данных
Арифметические операторы
Сложение (+):
```
int a = 5;
int b = 10;
int sum = a + b;
```
Вычитание (-):
```
int difference = b - a;
```
Умножение (*):
```
int product = a * b;
```
Деление (/):
```
int quotient = b / a;
```
Остаток от деления (%):
```
int remainder = b % a;
```
Логические операторы
Логическое И (&&):
```
boolean x = true;
boolean y = false;
boolean result = x && y;
```
Логическое ИЛИ (||):
```
boolean resultOr = x || y;
```
Логическое отрицание (!):
```
boolean notX = !x;
```
Побитовые операторы
Побитовое И (&):
```
int bitwiseAnd = a & b;
```
*5 (0101) & 10 (1010) = 0 (0000)*

Побитовое ИЛИ (|):
```
int bitwiseOr = a | b;
```
*5 (0101) | 10 (1010) = 15 (1111)*

Побитовое исключающее ИЛИ (^):
```
int bitwiseXor = a ^ b;
```
*5 (0101) ^ 10 (1010) = 15 (1111)*

Сдвиг влево (<<):
```
int leftShift = a << 1;
```
*5 (0101) << 1 = 10 (1010)*

Сдвиг вправо (>>):
```
int rightShift = b >> 1;
```
*10 (1010) >> 1 = 5 (0101)*

Операторы инкрементации и декрементации
Инкремент (++)
Постфиксный:
```
int count = 1;
int postIncrement = count++;
```
*postIncrement = 1, count = 2*

Префиксный:
```
int count = 2;
int preIncrement = ++count;
```
*preIncrement = 3, count = 3*

Декремент (--)
Постфиксный:
```
int postDecrement = count--;
```
*postDecrement = 3, count = 2*

Префиксный:
```
int preDecrement = --count;
```
*preDecrement = 1, count = 1*

Примеры операторов со строками
Сложение строк (+)
```
String str1 = "Hello, ";
String str2 = "World!";
String concatenated = str1 + str2; // concatenated = "Hello, World!"
```

Длина строки (length())
```
int length = str1.length();
```

Сравнение строк (equals())
```
String str3 = "Hello, World!";
boolean isEqual = concatenated.equals(str3); // isEqual = true
```
