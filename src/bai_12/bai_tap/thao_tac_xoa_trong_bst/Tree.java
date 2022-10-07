package bai_12.bai_tap.thao_tac_xoa_trong_bst;

public interface Tree<E> {
    boolean insert(E e);

    void preorder();

    int getSize();

    void delete(E element);
}
