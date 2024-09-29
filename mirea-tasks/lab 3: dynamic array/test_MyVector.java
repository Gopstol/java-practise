public class test_MyVector {
    public static void main(String[] args) {
        System.out.println("Создаем первый вектор и добавляем 4 элемента");
        MyVector<Integer> vector1 = new MyVector<>(5);
        vector1.append(1);
        vector1.append(3);
        vector1.append(4);
        vector1.append_index(1, 2);
        vector1.print();

        System.out.println("удаляем 2 элемента");
        vector1.pop();
        vector1.pop_index(0);
        vector1.print();

        System.out.println("Создаем второй вектор при помощи копирования");
        MyVector<Integer> vector2 = new MyVector<>(vector1);
        vector2.print();

        System.out.println("Создаем третий вектор");
        MyVector<String> vector3 = new MyVector<>();
        vector3.append("Dan");
        vector3.append("Tsarkov");
        vector3.print();

        System.out.println("Очищаем третий вектор");
        vector3.clear();
        vector3.print();

        System.out.println("Результат");
        vector1.print();
        vector2.print();
        vector3.print();
    }
}
