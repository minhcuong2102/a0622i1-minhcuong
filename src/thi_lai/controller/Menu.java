package thi_lai.controller;

import thi_lai.exception.NotFoundProductException;
import thi_lai.service.Service;

import java.util.Scanner;

public class Menu {
    static final Scanner sc = new Scanner(System.in);
    static Service controller = new Service();
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int choice = 0;
        System.out.println("Quản lý điện thoại\n" +
                "1. Thêm mới\n" +
                "2. Xoá\n" +
                "3. Xem danh sách điện thoại\n" +
                "4. Tìm kiếm\n" +
                "5. Thoát\n");
        System.out.print("Chọn chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Sai định dạng!");
        }

        switch (choice){
            case 1:
                System.out.println("Thêm mới");
                add();
                menu();
                break;

            case 2:
                System.out.println("Xoá");
                deleteP();
                menu();
                break;

            case 3:
                System.out.println("Xem danh sách điện thoại");
                displayPhone();
                menu();
                break;

            case 4:
                System.out.println("Tìm kiếm");
                searchPhone();
                menu();
                break;

            case 5:
                break;
        }
    }

    public static void add(){
        int choice1 = 0;
        do {
            System.out.println("Nhập lựa chọn:\n" +
                    "1. Thêm điện thoại chính hãng\n" +
                    "2. Thêm điện thoại xách tay\n" +
                    "3. Thoát\n");
            System.out.println("Nhập lựa chọn: ");
            try {
                choice1 = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Sai định dạng!");
            }
        } while (choice1 > 3 || choice1 < 1);
        switch (choice1){
            case 1:
                System.out.println("Thêm điện thoại chính hãng");
                controller.addAuthenticPhone();
                add();
                break;

            case 2:
                System.out.println("Thêm điện thoại xách tay");
                controller.addPortablePhone();
                add();
                break;

            case 3:
                menu();
                break;
        }
    }

    public static void deleteP(){
        try {
            controller.deletePhone();
        } catch (NotFoundProductException e) {
            e.printStackTrace();
        }
        menu();
    }

    public static void searchPhone(){
        controller.searchPhone();
        menu();
    }

    public static void displayPhone(){
        controller.displayList();
        menu();
    }
}
