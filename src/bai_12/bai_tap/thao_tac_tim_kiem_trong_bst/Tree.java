package bai_12.bai_tap.thao_tac_tim_kiem_trong_bst;

public interface Tree<E> {
    boolean insert(E e);

    void preorder();

    int getSize();

    void search(E element);
}
