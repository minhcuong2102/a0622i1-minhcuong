package bai_12.bai_tap.thao_tac_xoa_trong_bst;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

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

    public void delete(E element) {
        root = delete(root, element);
    }

    protected TreeNode<E> delete(TreeNode<E> root, E element) {
        if (root == null)
            return root;

        if (element.compareTo(root.element) < 0)
            root.left = delete(root.left, element);

        else if (element.compareTo(root.element) > 0)
            root.right = delete(root.right, element);

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.element = minValue(root.right);
            root.right = delete(root.right, element);
        }
        return root;
    }

    public E minValue(TreeNode<E> root) {
        E minVal = root.element;
        while (root.left != null) {
            minVal = root.left.element;
            root = root.left;
        }
        return minVal;
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
