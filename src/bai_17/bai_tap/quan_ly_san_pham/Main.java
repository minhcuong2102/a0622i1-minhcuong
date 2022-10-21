package bai_17.bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.*;

public class Main {
    protected static Scanner sc = new Scanner(System.in);
    protected static Main manager = new Main();

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public void addNew() {
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String brand = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập ngày sản xuất: ");
        String date = sc.nextLine();

        List<Product> productList = new ArrayList<>();
        Product product = new Product(id, name, brand, price, date);
        productList.add(product);
        writeToFile("E:\\Codegym\\module_2\\src\\bai_17\\bai_tap\\quan_ly_san_pham\\product.txt", productList);
    }

    public void search(String name) {
        boolean flag = false;
        List<Product> productList = readDataFromFile("E:\\Codegym\\module_2\\src\\bai_17\\bai_tap\\quan_ly_san_pham\\product.txt");
        for (Product product : productList) {
            if (name.equals(product.getName())) {
                System.out.println(product);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    public void display() {
        List<Product> productList = readDataFromFile("E:\\Codegym\\module_2\\src\\bai_17\\bai_tap\\quan_ly_san_pham\\product.txt");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void mainMenu() {
        System.out.println("1. Thêm sản phẩm\n" +
                "2. Hiển thị sản phẩm\n" +
                "3. Tìm kiếm sản phẩm\n" +
                "4. Thoát");
        System.out.print("Nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                manager.addNew();
                mainMenu();
                break;

            case 2:
                manager.display();
                mainMenu();
                break;

            case 3:
                System.out.print("Nhập tên sản phẩm cần tìm: ");
                String name = sc.nextLine();
                manager.search(name);
                mainMenu();
                break;

            case 4:
                break;
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
