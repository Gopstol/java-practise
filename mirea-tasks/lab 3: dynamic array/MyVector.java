import java.util.Arrays;

public class MyVector<T> {
    private T[] vector;
    private int current_size;
    private int max_size;

    public MyVector() {
        this.max_size = 10;
        this.vector = (T[]) new Object[max_size];
        this.current_size = 0;
    }

    public MyVector(int size) {
        if (size <= 0) {
            throw new IllegalStateException("Wrong size");
        }
        this.max_size = 2 * size + 10;
        this.vector = (T[]) new Object[max_size];
        this.current_size = 0;
    }

    public MyVector(MyVector<T> other) {
        this.current_size = other.current_size;
        this.max_size = other.max_size;
        this.vector = Arrays.copyOf(other.vector, other.max_size);
    }

    public void append(T value) {
        if (this.current_size == this.max_size) {
            resize();
        }
        this.vector[this.current_size] = value;
        this.current_size += 1;
    }

    public void append_index(int index, T value) {
        if (this.current_size == this.max_size) {
            resize();
        }
        if (index < 0 || index >= this.current_size) {
            throw new IllegalStateException("Wrong index");
        }
        for (int i = this.current_size; i > index; i--) {
            this.vector[i] = this.vector[i - 1];
        }
        this.vector[index] = value;
        this.current_size += 1;
    }

    public void pop() {
        if (this.current_size == 0) {
            throw new IllegalStateException("Vector is empty");
        }
        this.vector[current_size - 1] = null;
        this.current_size -= 1;
    }

    public void pop_index(int index) {
        if (this.current_size == 0) {
            throw new IllegalStateException("Vector is empty");
        }
        if (index < 0 || index >= this.current_size) {
            throw new IllegalStateException("Wrong index");
        }
        for (int i = index; i < this.current_size - 1; i++) {
            this.vector[i] = this.vector[i + 1];
        }
        this.vector[current_size - 1] = null;
        this.current_size -= 1;
    }

    public void resize() {
        this.max_size = 2 * this.max_size + 10;
        this.vector = Arrays.copyOf(this.vector, this.max_size);
    }

    public void clear() {
        Arrays.fill(this.vector, null);
        this.current_size = 0;
    }

    public int get_size() {
        return this.current_size;
    }

    public int get_max_size() {
        return this.max_size;
    }

    public void print() {
        System.out.print(this.current_size + "/" + this.max_size + ": ");
        for (int i = 0; i < this.current_size; i++) {
            System.out.print(this.vector[i] + " ");
        }
        System.out.println();
    }
}
