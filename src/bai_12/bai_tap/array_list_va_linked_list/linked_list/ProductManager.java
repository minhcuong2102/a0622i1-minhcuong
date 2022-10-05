package bai_12.bai_tap.array_list_va_linked_list.linked_list;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);

    public void add(LinkedList<Product> productList) {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(sc.nextLine());

        Product product1 = new Product(id, name, price);
        productList.add(product1);
    }

    public void display(LinkedList<Product> productList) {
        for (Product o : productList) {
            System.out.println(o);
        }
    }

    public void delete(LinkedList<Product> productList, int index) {
        for (int j = 0; j < productList.size(); j++) {
            if (j == index - 1) {
                productList.remove(j);
                break;
            }
        }
    }

    public void edit(LinkedList<Product> productList, int index) {
        for (int j = 0; j < productList.size(); j++) {
            if (j == index - 1) {
                System.out.print("Nhập id: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập tên: ");
                String name = sc.nextLine();

                System.out.print("Nhập giá: ");
                int price = sc.nextInt();

                productList.get(j).setId(id);
                productList.get(j).setName(name);
                productList.get(j).setPrice(price);
                break;
            }
        }
    }

    public void sortProductByPriceDecreasing(LinkedList<Product> productList) {
        productList.sort(new SortProductByPriceDecreasing());
    }

    public void sortProductByPriceIncreasing(LinkedList<Product> productList) {
        productList.sort(new SortProductByPriceIncreasing());
    }

    public static class SortProductByPriceDecreasing implements Comparator<Product> {
        public int compare(Product product1, Product product2) {
            if (product1.getPrice() < product2.getPrice()) {
                return 1;
            }
            return -1;
        }
    }

    public static class SortProductByPriceIncreasing implements Comparator<Product> {
        public int compare(Product product1, Product product2) {
            if (product1.getPrice() > product2.getPrice()) {
                return 1;
            }
            return -1;
        }
    }

    public void search(LinkedList<Product> productList, String name) {
        int cnt = 0;
        name = sc.nextLine();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                cnt++;
                System.out.println(product);
            }
        }
        if (cnt == 0) System.out.println("Không tìm thấy tên sản phẩm!");
    }
}
