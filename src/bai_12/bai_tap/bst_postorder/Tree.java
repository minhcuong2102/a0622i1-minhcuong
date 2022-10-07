package bai_12.bai_tap.bst_postorder;

public interface Tree<E> {
    boolean insert(E e);
    void postorder();
    int getSize();
}
