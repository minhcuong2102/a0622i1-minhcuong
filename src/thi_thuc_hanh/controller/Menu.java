package thi_thuc_hanh.controller;

import thi_thuc_hanh.service.Service;

import java.util.Scanner;

public class Menu {
    static final Scanner sc = new Scanner(System.in);
    static Service controller = new Service();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int choice = 0;
        do {
            System.out.println("Quản lý phương tiện\n" +
                    "1. Đăng ký phương tiện\n" +
                    "2. Xem danh sách phương tiện\n" +
                    "3. Huỷ đăng ký phương tiện\n" +
                    "4. Thoát\n");
            System.out.println("Nhập lựa chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
        } while (choice > 4 || choice < 1);
        switch (choice) {
            case 1:
                System.out.println("Đăng ký phương tiện");
                register();
                break;

            case 2:
                System.out.println("Xem danh sách người đăng ký phương tiện");
                displayList();
                break;

            case 3:
                System.out.println("Huỷ đăng ký phương tiện");
                unregister();
                break;

            case 4:
                System.out.println("Tạm biệt!");
                break;
        }
    }

    public static void register() {
        int choice1 = 0;
        do {
            System.out.println("1. Đăng ký xe tải\n" +
                    "2. Đăng ký ô tô\n" +
                    "3. Thoát\n");
            System.out.println("Nhập lựa chọn: ");
            try {
                choice1 = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
        } while (choice1 < 0 || choice1 > 3);
        switch (choice1) {
            case 1:
                System.out.println("1. Đăng ký xe tải");
                controller.addTruck();
                register();
                break;

            case 2:
                System.out.println("2. Đăng ký ô tô");
                controller.addCar();
                register();
                break;

            case 3:
                menu();
                break;
        }
    }

    public static void displayList() {
        controller.displayNDKList();
        menu();
    }

    public static void unregister() {
        controller.unregister();
        menu();
    }
}
