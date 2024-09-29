public class MyList<T> {
    Node<T> head;
    Node<T> tail;
    int list_length;

    public MyList() {
        this.head = this.tail =null;
        list_length = 0;
    }

    public MyList(MyList<T> list) {
        Node<T> current = list.head;
        this.head = new Node<>(current.value);
        Node<T> new_tail = this.head;
        current = current.next;
        while (current != null) {
            new_tail.next = new Node<>(current.value);
            new_tail = new_tail.next;
            current = current.next;
        }
        this.tail = new_tail;
        this.list_length = list.list_length;
    }

    public static class Node<T> {
        T value;
        Node<T> next;
        public Node(T element) {
            this.value = element;
        }
    }

    public void append_tail(T value) {
        Node<T> new_node = new Node<>(value);
        if (this.list_length == 0) {
            this.head = this.tail = new_node;
        }
        else {
            this.tail.next = new_node;
            this.tail = new_node;
        }
        this.list_length += 1;
    }

    public void append_head(T value) {
        Node <T> new_node = new Node<>(value);
        if (this.list_length == 0) {
            this.head = this.tail = new_node;
        }
        else {
            new_node.next = this.head;
            this.head = new_node;
        }
        this.list_length += 1;
    }

    public void pop_head() {
        if (this.list_length == 0) {
            throw new IllegalStateException("List is empty");
        }
        this.head = this.head.next;
        this.list_length -= 1;
    }

    public void pop(T value) {
        if (this.list_length == 0) {
            throw new IllegalStateException("List is empty");
        }
        if (this.head.value.equals(value)) {
            this.pop_head();
            return ;
        }

        Node<T> previous = this.head;
        Node<T> current = this.head.next;

        while (current != null) {
            if (current.value.equals(value)) {
                previous.next = current.next;
                if (this.tail == current) {
                    this.tail = current.next;
                }
                this.list_length -= 1;
                return;
            }
            previous = current;
            current = current.next;
        }
        throw new IllegalStateException("List does not contain such element");
    }

    public void print(){
        Node<T> current = this.head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void clear() {
        this.head = this.tail = null;
        this.list_length = 0;
    }

    public int len() {
        return this.list_length;
    }
}
