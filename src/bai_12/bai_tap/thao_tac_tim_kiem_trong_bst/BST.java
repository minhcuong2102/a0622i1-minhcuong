package bai_12.bai_tap.thao_tac_tim_kiem_trong_bst;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;
    public static boolean flag = false;

    public BST() {
    }

    public BST(E[] objects) {
        for (E object : objects) insert(object);
    }

    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    public int getSize() {
        return size;
    }

    public void search(E element){
        search(root, element);
        if (flag){
            System.out.println("Có tồn tại.");
        }else {
            System.out.println("Không tồn tại.");
        }
    }

    protected void search(TreeNode<E> root, E element){
        if (root == null) {
            System.out.println("Cây rỗng.");
        }
        else {
            if (root.element.compareTo(element) == 0) {
                flag = true;
                return;
            }
            if (!flag && root.left != null) {
                search(root.left, element);
            }
           if (!flag && root.right != null){
               search(root.right, element);
           }
        }
    }

    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
