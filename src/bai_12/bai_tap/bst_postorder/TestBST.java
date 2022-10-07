package bai_12.bai_tap.bst_postorder;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(35);
        tree.insert(10);
        tree.insert(19);
        tree.insert(31);
        tree.insert(42);
        System.out.print("Postorder: ");
        tree.postorder();
    }
}
