## Генерация документации:

### Важно!

У меня не установлена ```javadoc``` как системная переменная на ноутбуке.
Поэтому я использую ```C:/"Program Files"/Java/jdk-22/bin/javadoc```

```
javadoc -d docs Animal.java
```

Здесь:

* -d docs указывает Javadoc создать каталог docs, в который будет помещена сгенерированная документация.
* Animal.java — это файл, для которого будет создана документация.

После выполнения команды вы найдете каталог docs, в котором будет создана структура файлов HTML. Откройте файл index.html в веб-браузере, чтобы просмотреть сгенерированную документацию.

### Использование **Javadoc** является важной частью разработки на Java. Хорошо оформленная документация помогает другим разработчикам (и вам самим) лучше понимать код, что способствует его поддержке и дальнейшему развитию. Практикуйтесь в добавлении комментариев формата Javadoc к вашим классам и методам, чтобы лучше овладеть инструментом.