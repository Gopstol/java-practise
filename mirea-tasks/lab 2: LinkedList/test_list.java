public class test_list {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.append_tail(1);
        list.append_tail(2);
        list.append_head(0);
        list.append_head(-1);
        list.print();
        list.pop_head();
        list.print();
        list.append_tail(3);
        list.print();
        list.pop(2);
        list.print();
        // list.pop(4); // будет ошибка!
        list.pop(0);
        list.print();
        list.clear();
        list.append_tail(100);
        list.print();
        list.append_tail(101);
        list.append_tail(102);
        MyList<Integer> new_list = new MyList<>(list);
        new_list.append_tail(1);
        new_list.pop_head();
        list.print();
        new_list.print();
    }
}
