### 1.	Чем отличается класс от объекта?
Класс – это логическая абстракция. Шаблон, на основе которого определяется вид объекта. 
Объект – это экземпляр класса, физическое воплощение класса в оперативной памяти.
___
### 2.	Как определяется класс?
``class имя_класса { тело_класса }``
___
### 3.	Покажите, как объявить объект counter класса MyCounter, используя две отдельные инструкции.
``
MyCounter counter;
counter = new MyCounter();
``
___
### 4.	Собственную копию чего содержит каждый объект?
Собственную копию каждой переменной экземпляра, определенной в данном классе.
___
### 5.	Как должен быть объявлен метод myMeth, имеющий два параметра, а и b, типа int и возвращающий значение типа double?
``double myMeth(int a, int b) {return a + b;}``
___
### 6.	Как должно завершаться выполнение метода, возвращающего некоторое значение?
``return;``
___
### 7.	Каким должно быть имя конструктора?
Таким же, как и имя класса, в котором объявлен конструктор.
___
### 8.	Какие действия выполняет оператор new?
Оператор new динамически (т.е. во время выполнения программы) выделяет память для объекта и возвращает 
ссылку на него, которая представляет собой адрес области памяти, выделяемой для объекта оператором new.
___
### 9.	Что такое сборка мусора и для чего она нужна?
Сборка мусора — это механизм удаления неиспользуемых объектов для повторного использования освобождаемой памяти.
___
### 10.	Что означает ключевое слово this?
Ключевое слово this обозначает именно тот объект, по ссылке на который действует вызываемый метод.
___
### 11.	Может ли конструктор иметь один или несколько параметров?
Да, может.
___
### 12.	Если метод не возвращает значения, то как следует объявить тип этого метода?
``void``
___
