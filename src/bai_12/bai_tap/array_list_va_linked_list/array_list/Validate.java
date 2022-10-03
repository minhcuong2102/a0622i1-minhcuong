package bai_12.bai_tap.array_list_va_linked_list.array_list;

import java.util.List;

public interface Validate {
    void add(List<Product> productList);

    void display(List<Product> productList);

    void remove(List<Product> productList, int index);

    void edit(List<Product> productList, int index);

    void sortProductByPriceDecreasing(List<Product> productList);

    void sortProductByPriceIncreasing(List<Product> productList);

    void search(List<Product> productList, String name);
}