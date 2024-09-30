class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class binary_tree<T extends Comparable<T>> {
    public Node<T> root;
    private int size;

    public binary_tree() {
        this.root = null;
        this.size = 0;
    }

    public binary_tree(binary_tree<T> other) {
        this.root = copy_tree(other.root);
        this.size = other.size;
    }

    private Node<T> copy_tree(Node<T> node) {
        if (node == null) {
            return null;
        }
        Node<T> new_node = new Node<>(node.value);
        new_node.left = copy_tree(node.left);
        new_node.right = copy_tree(node.right);
        return new_node;
    }

    public void append(T value) {
        this.root = append_recursive(this.root, value);
        this.size += 1;
    }

    private Node<T> append_recursive(Node<T> node, T value) {
        if (node == null) {
            return new Node<>(value);
        }
        if (value.compareTo(node.value) < 0) {
            node.left = append_recursive(node.left, value);
        }
        else if (value.compareTo(node.value) > 0) {
            node.right = append_recursive(node.right, value);
        }
        return node;
    }

    public boolean exist(T value) {
        return exist_recursive(this.root, value);
    }

    private boolean exist_recursive(Node<T> node, T value) {
        if (node == null) {
            return false;
        }
        if (value.compareTo(node.value) < 0) {
            return exist_recursive(node.left, value);
        }
        else if (value.compareTo(node.value) > 0) {
            return exist_recursive(node.right, value);
        }
        return true;
    }

    public void clear() {
        this.root = null;
        this.size = 0;
    }

    public int get_size() {
        return this.size;
    }
}
