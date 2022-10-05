package bai_12.bai_tap.array_list_va_linked_list.linked_list;

import java.util.*;

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
        LinkedList<Product> productList = new LinkedList<>();
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        productList.add(new Product(1, "mathang1", 15000));
        productList.add(new Product(2, "mathang2", 20000));
        productList.add(new Product(3, "mathang3", 30000));
        productList.add(new Product(4, "mathang4", 40000));
        productList.add(new Product(5, "mathang5", 55000));

        int choice;
        int index;
        do{
            showMenu();
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manager.add(productList);
                    manager.display(productList);
                    break;

                case 2:
                    manager.display(productList);
                    break;

                case 3:
                    System.out.print("Nhập id: ");
                    index = sc.nextInt();
                    manager.delete(productList, index);
                    break;

                case 4:
                    System.out.print("Nhập id");
                    index = sc.nextInt();
                    manager.edit(productList, index);
                    break;

                case 5:
                    manager.sortProductByPriceDecreasing(productList);
                    manager.display(productList);
                    break;

                case 6:
                    manager.sortProductByPriceIncreasing(productList);
                    manager.display(productList);
                    break;

                case 7:
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    manager.search(productList, name);
                    break;

                case 0:
                    break;
            }
        }while (choice != 0);
    }
}
