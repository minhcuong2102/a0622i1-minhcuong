package case_study.services.Impl;

import case_study.models.person.Customer;
import case_study.services.CustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImplement implements CustomerService {
    private static final Scanner sc = new Scanner(System.in);
    private static final CustomerServiceImplement manager2 = new CustomerServiceImplement();
    private static final LinkedList<Customer> customerList = new LinkedList<>();

    public void addNew(){
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.print("Nhập sinh nhật: ");
        String birthday = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNum = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        System.out.print("Nhập loại khách hàng: ");
        String customerType = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();

        Customer customer = new Customer(id, name, birthday, gender, phoneNum, email, customerType, address);
        customerList.add(customer);
    }

    public void display(){
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%4s|%16s|%15s|%8s|%15s|%16s|%15s|%15s\n",
                "ID", "Name", "Birthday", "Gender", "Phone", "Email", "Type", "Address");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Customer customer: customerList){
            System.out.printf("|%4s|%16s|%15s|%8s|%15s|%16s|%15s|%15s\n",
                    customer.getId(), customer.getName(), customer.getBirthday(),
                    customer.getGender(), customer.getPhoneNum(), customer.getEmail(),
                    customer.getCustomerType(), customer.getAddress());
        }
    }

    public void edit(int id){
        for (int i = 0; i < customerList.size(); i++) {
            if (id == i - 1){
                System.out.print("Nhập tên nhân viên: ");
                String name = sc.nextLine();
                System.out.print("Nhập sinh nhật: ");
                String birthday = sc.nextLine();
                System.out.print("Nhập giới tính: ");
                String gender = sc.nextLine();
                System.out.print("Nhập số điện thoại: ");
                String phoneNum = sc.nextLine();
                System.out.print("Nhập email: ");
                String email = sc.nextLine();
                System.out.print("Nhập loại khách hàng: ");
                String customerType = sc.nextLine();
                System.out.print("Nhập địa chỉ: ");
                String address = sc.nextLine();

                customerList.get(i).setName(name);
                customerList.get(i).setBirthday(birthday);
                customerList.get(i).setGender(gender);
                customerList.get(i).setPhoneNum(phoneNum);
                customerList.get(i).setEmail(email);
                customerList.get(i).setCustomerType(customerType);
                customerList.get(i).setAddress(address);
                break;
            }
        }
        manager2.display();
    }

    public void delete(int id){
        for (int j = 0; j < customerList.size(); j++) {
            if (j == id - 1) {
                customerList.remove(j);
                break;
            }
        }
        manager2.display();
    }
}
