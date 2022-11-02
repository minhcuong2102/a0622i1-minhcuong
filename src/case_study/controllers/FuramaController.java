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
                    "---------------MAIN MENU-------------\n" +
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
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng!");
            }
            switch (luaChon) {
                case 1:
                    System.out.print("---------Employee Management----------\n");
                    employeeManage();
                    break;

                case 2:
                    System.out.println("----------Customer Management----------\n");
                    customerManage();
                    break;

                case 3:
                    System.out.println("-----------Facility Management-----------\n");
                    facilityManage();
                    break;

                case 4:
                    System.out.println("-----------Booking Management-----------\n");
                    bookingManage();
                    break;

                case 5:
                    System.out.println("------------tPromotion Management-----------\n");
                    promotionManage();
                    break;

                case 6:
                    break;
            }
        } while (luaChon != 6);
    }

    public static void employeeManage() {
        System.out.println(
                "1. Display employee list\n" +
                        "2. Add a new employee\n" +
                        "3. Edit a employee\n" +
                        "4. Delete a employee\n" +
                        "5. Return main menu\n"
        );
        EmployeeServiceImplement manager1 = new EmployeeServiceImplement();
        int choice = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice) {
            case 1:
                System.out.println("---------Display list employees--------\n");
                manager1.display();
                employeeManage();
                break;

            case 2:
                System.out.println("----------Add new employee----------\n");
                manager1.addNew();
                employeeManage();
                break;

            case 3:
                System.out.println("-----------Edit employee----------\n");
                manager1.edit();
                employeeManage();
                break;

            case 4:
                System.out.println("-----------Delete employee----------\n");
                manager1.delete();
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

    public static void customerManage() {
        System.out.println("1.\tDisplay customer list\n" +
                "2.\tAdd a new customer\n" +
                "3.\tEdit a customer\n" +
                "4.\tDelete a customer\n" +
                "5.\tReturn main menu\n");

        CustomerServiceImplement manager2 = new CustomerServiceImplement();
        int choice = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice) {
            case 1:
                System.out.println("----------Display list customers-----------\n");
                manager2.display();
                customerManage();
                break;

            case 2:
                System.out.println("----------Add new customer-----------\n");
                manager2.addNew();
                customerManage();
                break;

            case 3:
                System.out.println("-----------Edit customer-----------\n");
                manager2.edit();
                customerManage();
                break;

            case 4:
                System.out.println("------------Delete customer----------\n");
                manager2.delete();
                customerManage();
                break;

            case 5:
                displayMainMenu();
                break;

            default:
                System.out.println("Nhập số tư 1 - 5");
        }
    }

    public static void facilityManage() {
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");

        FacilityServiceImplement manager3 = new FacilityServiceImplement();

        int choice = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice) {
            case 1:
                System.out.println("-----------Display list facility-----------\n");
                manager3.display();
                facilityManage();
                break;

            case 2:
                int choice1 = 0;
                System.out.println("-----------Add new facility------------\n");
                System.out.print("Chọn cơ sở cần thêm: " +
                        "1. Villa\t2. House\t3. Room\t4. Thoát\n" +
                        "Nhập lựa chọn: ");
                try {
                    choice1 = sc.nextInt();
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai định dạng!");
                }
                switch (choice1) {
                    case 1:
                        System.out.println("THÊM VILLA\n");
                        manager3.addNewVilla();
                        facilityManage();
                        break;

                    case 2:
                        System.out.println("THÊM NHÀ\n");
                        manager3.addNewHouse();
                        facilityManage();
                        break;

                    case 3:
                        System.out.println("THÊM PHÒNG\n");
                        manager3.addNewRoom();
                        facilityManage();
                        break;

                    case 4:
                        facilityManage();
                        break;
                }
                break;

            case 3:
                System.out.println("------------Display list facility maintenance----------\n");
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

    public static void bookingManage() {
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
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice) {
            case 1:
                System.out.println("----------Add new booking----------\n");
                break;
            case 2:
                System.out.println("----------Display list booking----------\n");
                break;
            case 3:
                System.out.println("----------Create new constracts----------\n");
                break;
            case 4:
                System.out.println("-----------Display list contracts-----------\n");
                break;
            case 5:
                System.out.println("-----------Edit contracts------------\n");
                break;
            case 6:
                displayMainMenu();
                break;
            default:
                System.out.println("Nhập số tư 1 - 6");
        }
    }

    public static void promotionManage() {
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        int choice = 0;
        System.out.print("Nhập chức năng: ");
        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice) {
            case 1:
                System.out.println("---------Display list customers use service---------\n");
                break;
            case 2:
                System.out.println("-----------Display list customers get voucher-----------\n");
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
