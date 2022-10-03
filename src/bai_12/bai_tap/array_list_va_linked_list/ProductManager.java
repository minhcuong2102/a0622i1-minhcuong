package bai_12.bai_tap.array_list_va_linked_list;

import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class ProductManager implements Validate {
    Scanner sc = new Scanner(System.in);

    public void add(List<Product> productList) {
        System.out.print("Nhập id: ");
        int id = sc.nextInt();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        int price = sc.nextInt();

        Product product1 = new Product(id, name, price);
        productList.add(product1);
    }

    public void display(List<Product> productList) {
        for (Product o : productList) {
            System.out.println(o);
        }
    }

    @Override
    public void remove(List<Product> productList, int i) {
        for (int j = 0; j < productList.size(); j++) {
            if (j == i) {
                productList.remove(j);
                break;
            }
        }
    }

    @Override
    public void edit(List<Product> productList, int i) {
        for (int j = 0; j < productList.size(); j++) {
            if (j == i) {
                System.out.print("Nhập id: ");
                int id = sc.nextInt();
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

    public void sortProductByPriceDecreasing(List<Product> productList) {
        productList.sort(new SortProductByPriceDecreasing());
    }

    public void sortProductByPriceIncreasing(List<Product> productList) {
        productList.sort(new SortProductByPriceIncreasing());
    }

    public void search(List<Product> productList, String name) {
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
}
