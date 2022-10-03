package bai_12.bai_tap.array_list_va_linked_list.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void showMenu() {
        System.out.println(
                "------------------MAIN MENU-----------------" +
                "\n    1. Thêm sản phẩm                      " +
                "\n    2. Hiển thị sản phẩm                  " +
                "\n    3. Xoá sản phẩm                       " +
                "\n    4. Sửa sản phẩm                       " +
                "\n    5. Sắp xếp sản phẩm theo giá giảm dần " +
                "\n    6. Sắp xếp sản phẩm theo giá tăng dần " +
                "\n    7. Tìm tên sản phẩm                   " +
                "\n    0. Thoát                              " +
                "\n--------------------------------------------"
        );
    }

    public static void main(String[] args) {
        Validate validate = new ProductManager();
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "mathang1", 10000));
        productList.add(new Product(2, "mathang2", 15000));
        productList.add(new Product(3, "mathang3", 10000));
        productList.add(new Product(4, "mathang4", 20000));
        productList.add(new Product(5, "mathang5", 30000));
        int choice;
        int index;
        do {
            showMenu();
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    validate.add(productList);
                    validate.display(productList);
                    break;

                case 2:
                    validate.display(productList);
                    break;

                case 3:
                    System.out.print("Nhập id: ");
                    index = sc.nextInt();
                    validate.remove(productList, index - 1);
                    validate.display(productList);
                    break;

                case 4:
                    System.out.print("Nhập id: ");
                    index = sc.nextInt();
                    validate.edit(productList, index - 1);
                    validate.display(productList);
                    break;

                case 5:
                    validate.sortProductByPriceDecreasing(productList);
                    validate.display(productList);
                    break;

                case 6:
                    validate.sortProductByPriceIncreasing(productList);
                    validate.display(productList);
                    break;

                case 7:
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    validate.search(productList, name);
                    break;

                case 0:
                    break;
            }
        } while (choice != 0);
    }
}