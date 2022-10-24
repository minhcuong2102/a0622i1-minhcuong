package case_study.controllers;

import case_study.services.Impl.CustomerServiceImplement;
import case_study.services.Impl.EmployeeServiceImplement;
import case_study.services.Impl.FacilityServiceImplement;

import java.util.Scanner;

public class FuramaController {
    public static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        int luaChon = 0;
        do {
            System.out.println(
                        "-------------------------------\n" +
                            "1. Employee Management\n" +
                            "2. Customer Management\n" +
                            "3. Facility Management\n" +
                            "4. Booking Management\n" +
                            "5. Promotion Management\n" +
                            "6. Exit\n" +
                        "-------------------------------"
            );
            System.out.print("Lựa chọn: ");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng!");
            }
            switch (luaChon) {
                case 1:
                    System.out.print("\tEmployee Management\n");
                    employeeManage();
                    break;

                case 2:
                    System.out.println("2.\tCustomer Management");
                    customerManage();
                    break;

                case 3:
                    System.out.println("3.\tFacility Management");
                    facilityManage();
                    break;

                case 4:
                    System.out.println("4.\tBooking Management");
                    bookingManage();
                    break;

                case 5:
                    System.out.println("5.\tPromotion Management");
                    promotionManage();
                    break;

                case 6:
                    break;
            }
        } while (luaChon != 6);
    }

    public static void employeeManage() {
        System.out.println(
                        "1. Display list employees\n" +
                        "2. Add new employee\n" +
                        "3. Edit employee\n" +
                        "4. Delete employee\n" +
                        "5. Return main menu"
        );
        EmployeeServiceImplement manager1 = new EmployeeServiceImplement();
        int choice = 0, id = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice){
            case 1:
                System.out.println("1\tDisplay list employees\n");
                manager1.display();
                employeeManage();
                break;

            case 2:
                System.out.println("2\tAdd new employee\n");
                manager1.addNew();
                employeeManage();
                break;

            case 3:
                System.out.println("3\tEdit employee\n");
                System.out.print("Nhập id của người cần sửa: ");
                try {
                    id = sc.nextInt();
                }catch (NumberFormatException e){
                    System.out.println("Nhập sai định dạng!");
                }
                manager1.edit(id);
                employeeManage();
                break;

            case 4:
                System.out.println("4\tDelete employee\n");
                System.out.print("Nhập id của người cần xoá: ");
                try {
                    id = sc.nextInt();
                }catch (NumberFormatException e){
                    System.out.println("Nhập sai định dạng!");
                }
                manager1.delete(id);
                employeeManage();
                break;

            case 5:
                displayMainMenu();
                break;

            default:
                System.out.println("Nhập số từ 1 - 5");
                employeeManage();
        }
    }

    public static void customerManage(){
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tDelete customer" +
                "5.\tReturn main menu\n");

        CustomerServiceImplement manager2 = new CustomerServiceImplement();
        int choice = 0, id = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice){
            case 1:
                System.out.println("1.\tDisplay list customers\n");
                manager2.display();
                customerManage();
                break;

            case 2:
                System.out.println("2.\tAdd new customer\n");
                manager2.addNew();
                customerManage();
                break;

            case 3:
                System.out.println("3.\tEdit customer\n");
                System.out.print("Nhập id: ");
                try {
                    id = sc.nextInt();
                }catch (NumberFormatException e){
                    System.out.println("Nhập sai định dạng!");
                }
                manager2.edit(id);
                customerManage();
                break;

            case 4:
                System.out.println("4.\tDelete customer");
                System.out.print("Nhập id: ");
                id = sc.nextInt();
                manager2.delete(id);
                customerManage();
                break;

            case 5:
                displayMainMenu();
                break;

            default:
                System.out.println("Nhập số tư 1 - 5");
        }
    }

    public static void facilityManage(){
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");

        FacilityServiceImplement manager3 = new FacilityServiceImplement();

        int choice = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice){
            case 1:
                System.out.println("1\tDisplay list facility\n");
                manager3.display();
                facilityManage();
                break;

            case 2:
                int choice1 = 0;
                System.out.println("2\tAdd new facility\n");
                System.out.print("Chọn cơ sở cần thêm: " +
                        "1. Villa\t2. House\t3. Room\t4. Thoát");
                try {
                    choice1 = sc.nextInt();
                }catch (NumberFormatException e){
                    System.out.println("Nhập sai định dạng!");
                }
                switch (choice1){
                    case 1:
                        System.out.println("THÊM VILLA");
                        manager3.addNewVilla();
                        facilityManage();
                        break;

                    case 2:
                        System.out.println("THÊM NHÀ");
                        manager3.addNewHouse();
                        facilityManage();
                        break;

                    case 3:
                        System.out.println("THÊM PHÒNG");
                        manager3.addNewRoom();
                        facilityManage();
                        break;

                    case 4:
                        facilityManage();
                        break;
                }
                break;

            case 3:
                System.out.println("3\tDisplay list facility maintenance\n");
                manager3.displayFacilitiesNeedMaintainance();
                facilityManage();
                break;

            case 4:
                displayMainMenu();
                break;

            default:
                System.out.println("Nhập số tư 1 - 4");
        }
    }

    public static void bookingManage(){
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        int choice = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng!");
        }        switch (choice){
            case 1:
                System.out.println("1.\tAdd new booking\n");
                break;
            case 2:
                System.out.println("2.\tDisplay list booking\n");
                break;
            case 3:
                System.out.println("3.\tCreate new constracts\n");
                break;
            case 4:
                System.out.println("4.\tDisplay list contracts\n");
                break;
            case 5:
                System.out.println("5.\tEdit contracts\n");
                break;
            case 6:
                displayMainMenu();
                break;
            default:
                System.out.println("Nhập số tư 1 - 6");
        }
    }

    public static void promotionManage(){
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        int choice = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng!");
        }        switch (choice){
            case 1:
                System.out.println("1.\tDisplay list customers use service\n");
                break;
            case 2:
                System.out.println("2.\tDisplay list customers get voucher\n");
                break;
            case 3:
                displayMainMenu();
                break;
            default:
                System.out.println("Nhập số tư 1 - 3");
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
