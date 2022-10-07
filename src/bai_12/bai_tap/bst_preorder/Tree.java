package bai_12.bai_tap.bst_preorder;

public interface Tree<E> {
    boolean insert(E e);
    void preorder();
    int getSize();
}
