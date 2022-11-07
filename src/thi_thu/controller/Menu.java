package thi_thu.controller;

import case_study.utils.ReadAndWrite;
import thi_thu.service.Controller;
import thi_thu.utils.ReadAndWriteFile;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static Controller controller = new Controller();

    public static void menu() {
        int choice = 0;

        do {
            System.out.println("\t1. Đăng ký người thuê/cho thuê nhà.\n" +
                    "\t2. Hiển thị thông tin người thuê/cho thuê nhà.\n" +
                    "\t3. Tìm kiếm người cho thuê theo CCCD của người thuê.\n" +
                    "\t4. Hiển thị và xoá người thuê/người cho thuê nhà thành công.\n" +
                    "\t5. Lưu lại dữ liệu người thuê/người cho thuê vào file.\n" +
                    "\t6. Import dữ liệu người thuê/người cho thuê vào chương trình.\n" +
                    "\t7. Thoát.\n");
            System.out.print("\tNhập lựa chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng, nhập lại lựa chọn: ");
                menu();
            }
            switch (choice) {
                case 1:
                    register();
                    break;

                case 2:
                    displayInfo();
                    break;

                case 3:
                    search();
                    break;

                case 4:
                    displayAndDelete();
                    break;

                case 5:
                    addAccountData();
                    System.out.println("Ghi thành công!");
                    break;

                case 6:
                    importData();
                    System.out.println("Đọc thành công!");
                    break;

                case 7:
                    System.out.println("Kết thúc chương trình!");
                    break;

                default:
                    System.out.println("Nhập từ 1-7");
                    menu();
                    break;
            }
        } while (choice < 1 || choice > 7);
    }

    public static void register() {
        int choice1 = 0;

        do {
            System.out.println("------Đăng ký người thuê/cho thuê nhà-------");
            System.out.println("\t1. Đăng ký người thuê.\n" +
                    "\t2. Đăng ký người cho thuê.\n" +
                    "\t3. Thoát.\n");
            System.out.print("Lựa chọn: ");
            try {
                choice1 = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Sai định dạng, nhập lại lựa chọn: ");
            }
            switch (choice1) {
                case 1:
                    System.out.println("-------Đăng ký người thuê------");
                    controller.addAccountRenter();
                    break;

                case 2:
                    System.out.println("-------Đăng ký người cho thuê------");
                    controller.addAccountLessor();
                    break;

                case 3:
                    menu();
                    break;

                default:
                    System.out.println("Nhập từ 1-3!");
                    register();
            }
        } while (choice1 > 3 || choice1 < 1);
        menu();
    }

    public static void displayInfo() {
        System.out.println("------Hiển thị thông tin người thuê/cho thuê nhà-------");
        controller.display();
        menu();
    }

    public static void search() {
        
        System.out.println("-------Tìm kiếm người cho thuê theo CCCD của người thuê------");
        menu();
    }

    public static void displayAndDelete() {
        controller.deleteRenterAccount();
        System.out.println("------Hiển thị và xoá người thuê/người cho thuê nhà thành công------");
        menu();
    }

    public static void addAccountData() {
        int choice5 = 0;
        do {
            System.out.println("-------Lưu lại dữ liệu người thuê/người cho thuê vào file------");
            System.out.println("\t1. Lưu người thuê.\n" +
                    "\t2. Lưu người cho thuê.\n" +
                    "\t3. Thoát.\n");
            System.out.println("Lựa chọn: ");
            try {
                choice5 = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
            switch (choice5) {
                case 1:
                    System.out.println("-------Lưu người thuê------");
                    controller.addRenterToFile();
                    System.out.println("Đã lưu!");
                    break;

                case 2:
                    System.out.println("-------Lưu người cho thuê------");
                    controller.addLessorToFile();
                    System.out.println("Đã lưu!");
                    break;

                case 3:
                    menu();
                    break;

                default:
                    System.out.println("Nhập từ 1-3!");
                    register();
            }
        } while (choice5 > 3 || choice5 < 1);
        menu();
    }

    public static void importData() {
        int choice6 = 0;
        System.out.println("------Import dữ liệu người thuê/người cho thuê vào chương trình------");
        System.out.println("\t1. Import người thuê.\n" +
                "\t2. Import người cho thuê.\n" +
                "\t3. Thoát.\n");
        System.out.println("Lựa chọn: ");
        try {
            choice6 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        switch (choice6){
            case 1:
                System.out.println("------Import người thuê------");
                controller.readRenter();
                break;

            case 2:
                System.out.println("------Import người cho thuê------");
                controller.readLessor();
                break;

            case 3:
                menu();
                break;

            default:
                System.out.println("Nhập số từ 1-3!");
                importData();
                break;
        }
        menu();
    }

    public static void main(String[] args) {
        menu();
    }
}
