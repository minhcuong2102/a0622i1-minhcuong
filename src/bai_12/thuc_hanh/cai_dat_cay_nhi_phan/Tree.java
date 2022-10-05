package bai_12.thuc_hanh.cai_dat_cay_nhi_phan;

public interface Tree<E> {
    public boolean insert(E e);
    public void inorder();
    public int getSize();
}
