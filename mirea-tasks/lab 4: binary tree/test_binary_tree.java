public class test_binary_tree {
    public static void main(String[] args) {
        binary_tree<Integer> tree1 = new binary_tree<>();
        tree1.append(10);
        tree1.append(5);
        tree1.append(15);
        System.out.println("Node 15 exists in tree1: " + tree1.exist(15));

        binary_tree<Integer> tree2 = new binary_tree<>(tree1);
        System.out.println("Node 5 exists in tree2: " + tree2.exist(5));
        System.out.println("Node 87 exists in tree2: " + tree2.exist(87) + "\n");

        System.out.println("Size of tree1 is " + tree1.get_size() + ", size of tree2 is " + tree2.get_size());

        tree1.clear();
        tree2.append(100);

        System.out.println("Size of tree1 is " + tree1.get_size() + ", size of tree2 is " + tree2.get_size() + "\n");

        System.out.println("tree2 root is " + tree2.root.value);
        System.out.println("tree2 root.left is " + tree2.root.left.value);
        System.out.println("tree2 root.right is " + tree2.root.right.value);
    }
}
