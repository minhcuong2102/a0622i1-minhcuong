package bai_12.bai_tap.thao_tac_xoa_trong_bst;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(20);
        tree.insert(10);
        tree.insert(40);
        tree.insert(16);
        tree.insert(30);
        tree.insert(80);
        tree.insert(27);
        tree.insert(50);
        System.out.println("Ban đầu: ");
        tree.preorder();

        System.out.println("\nXoá 80: ");
        tree.delete(80);
        tree.preorder();
    }
}
