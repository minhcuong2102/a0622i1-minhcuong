package case_study.services.Impl;

import case_study.models.person.Customer;
import case_study.services.CustomerService;
import case_study.utils.ReadAndWrite;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

import static case_study.controllers.FuramaController.customerManage;

public class CustomerServiceImplement implements CustomerService {
    private static final Scanner sc = new Scanner(System.in);
    private static final CustomerServiceImplement manager2 = new CustomerServiceImplement();
    private static LinkedList<Customer> customerList = new LinkedList<>();

    public void addNew() {
        int sex = 0;
        String gender = "";
        int loaiKhach = 0;
        String customerType = "";

        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.print("Nhập sinh nhật: ");
        String birthday = sc.nextLine();

        do {
            System.out.print("0. Nam\t\t1. Nữ" + "\nNhập giới tính: ");
            try {
                sex = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
            if (sex == 0) {
                gender = "Nam";
            } else if (sex == 1) {
                gender = "Nữ";
            }
        } while (sex < 0 || sex > 1);

        int id = 0;
        System.out.print("Nhập CMND: ");
        try {
            id = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        System.out.print("Nhập số điện thoại: ");
        String phoneNum = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();

        do {
            System.out.println("Các loại khách:\n" +
                    "1.\tDiamond\n" +
                    "2.\tPlatinium\n" +
                    "3.\tGold\n" +
                    "4.\tSilver\n" +
                    "5.\tMember\n");
            System.out.println("Nhập loại khách hàng:");
            try {
                loaiKhach = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
            switch (loaiKhach) {
                case 1:
                    customerType = "Diamond";
                    break;

                case 2:
                    customerType = "Platinium";
                    break;

                case 3:
                    customerType = "Gold";
                    break;

                case 4:
                    customerType = "Silver";
                    break;

                case 5:
                    customerType = "Member";
                    break;

                default:
                    System.out.println("Nhập từ 1 - 5!");
                    break;
            }
        } while (loaiKhach < 1 || loaiKhach > 5);

        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();

        Customer customer = new Customer(name, birthday, gender, id, phoneNum, email, customerType, address);
        customerList.add(customer);
    }

    public void display() {
        for (int i = 0; i < 130; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("|%4s|%16s|%12s|%8s|%12s|%15s|%20s|%15s|%15s|\n",
                "STT", "Name", "Birthday", "Gender", "CMND", "Phone", "Email", "Type", "Address");
        for (int i = 0; i < 130; i++) {
            System.out.print("-");
        }
        System.out.println();
        customerList = ReadAndWrite.readCustomer("E:\\Codegym\\module_2\\src\\case_study\\data\\customer.csv");
        for (int i = 0; i < Objects.requireNonNull(customerList).size(); i++) {
            System.out.printf("|%4s|%16s|%12s|%8s|%12s|%15s|%20s|%15s|%15s|\n",
                    i + 1, customerList.get(i).getName(), customerList.get(i).getBirthday(),
                    customerList.get(i).getGender(), customerList.get(i).getId(), customerList.get(i).getPhoneNum(),
                    customerList.get(i).getEmail(), customerList.get(i).getCustomerType(), customerList.get(i).getAddress());
        }
        for (int i = 0; i < 130; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void edit() {
        int index = 0;
        int sex = 0;
        String gender = "";
        int loaiKhach = 0;
        String customerType = "";

        System.out.print("Nhập id: ");
        try {
            index = sc.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng!");
        }
        for (int i = 0; i < customerList.size(); i++) {
            if (index == i - 1) {
                System.out.print("Nhập tên nhân viên: ");
                String name = sc.nextLine();
                System.out.print("Nhập sinh nhật: ");
                String birthday = sc.nextLine();

                do {
                    System.out.print("0. Nam\t\t1. Nữ" + "\nNhập giới tính: ");
                    try {
                        sex = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Sai định dạng!");
                    }
                    if (sex == 0) {
                        gender = "Nam";
                    } else if (sex == 1) {
                        gender = "Nữ";
                    }
                } while (sex < 0 || sex > 1);

                int id = 0;
                System.out.print("Nhập CMND: ");
                try {
                    id = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Sai định dạng!");
                }
                System.out.print("Nhập số điện thoại: ");
                String phoneNum = sc.nextLine();
                System.out.print("Nhập email: ");
                String email = sc.nextLine();

                do {
                    System.out.println("Các loại khách:\n" +
                            "1.\tDiamond\n" +
                            "2.\tPlatinium\n" +
                            "3.\tGold\n" +
                            "4.\tSilver\n" +
                            "5.\tMember\n");
                    System.out.println("Nhập loại khách hàng:");
                    try {
                        loaiKhach = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Sai định dạng!");
                    }
                    switch (loaiKhach) {
                        case 1:
                            customerType = "Diamond";
                            break;

                        case 2:
                            customerType = "Platinium";
                            break;

                        case 3:
                            customerType = "Gold";
                            break;

                        case 4:
                            customerType = "Silver";
                            break;

                        case 5:
                            customerType = "Member";
                            break;

                        default:
                            System.out.println("Nhập từ 1 - 5!");
                            break;
                    }
                } while (loaiKhach < 1 || loaiKhach > 5);

                System.out.print("Nhập địa chỉ: ");
                String address = sc.nextLine();

                Customer customer = new Customer(name, birthday, gender, id, phoneNum, email, customerType, address);
                customerList = ReadAndWrite.readCustomer("E:\\Codegym\\module_2\\src\\case_study\\data\\customer.csv");
                assert customerList != null;
                customerList.set(i, customer);
                ReadAndWrite.writeCustomer(customerList,"E:\\Codegym\\module_2\\src\\case_study\\data\\customer.csv");
                System.out.println("Sửa thông tin khách hàng thành công!");
                customerManage();
            }
        }
        manager2.display();
    }

    public void delete() {
        String name;
        System.out.print("Nhập tên của người cần xoá: ");
        name = sc.nextLine();
        for (int j = 0; j < customerList.size(); j++) {
            if (name.equals(customerList.get(j).getName())) {
                ReadAndWrite.readCustomer("E:\\Codegym\\module_2\\src\\case_study\\data\\customer.csv");
                customerList.remove(j);
                ReadAndWrite.writeCustomer(customerList, "E:\\Codegym\\module_2\\src\\case_study\\data\\customer.csv");
                break;
            }
        }
        manager2.display();
    }
}
