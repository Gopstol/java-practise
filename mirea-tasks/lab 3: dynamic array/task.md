Лабораторная работа №3 — Динамический массив

Задача: реализовать контейнер myVector — динамический массив
для хранения произвольного типа данных.
Указания по выполнению:
- лабораторная работа состоит из двух файлов:
myVector.java — описание класса vector, прототипы методов,
реализация методов;
test-vector.java — тестирование и проверка возможностей
класса;
- класс myVector должен быть шаблонным;
- класс myVector должен содержать следующие поля:
ссылку на массив;
текущее число элементов;
максимальное число элементов;
- класс myVector должен содержать следующие методы:
конструктор;
конструктор копирования;
добавление элемента в конец;
удаление последнего элемента;
удаление элемента по индексу;
вставка элемента по индексу;
изменение размера массива;
очистка массива (удаление всех элементов);
получение текущего и максимального размера контейнера;
- пользователь должен иметь возможность задать начальное
число элементов в массиве с помощью конструктора;
- память под массив должна выделяться с запасом. Можно
придерживаться простейшей стратегии: макс.число элементов =
2*(число элементов) + 10;
- если число элементов за счет добавления новых превышает
максимальное, необходимо заново выделить память, скопировать
существующие элементы
- при невозможности удаления элемента, доступа к элементу и
т. п. должны генерироваться исключения;
