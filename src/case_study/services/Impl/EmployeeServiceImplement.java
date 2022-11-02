package case_study.services.Impl;

import case_study.models.person.Employee;
import case_study.services.EmployeeService;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static case_study.controllers.FuramaController.employeeManage;

public class EmployeeServiceImplement implements EmployeeService {
    private static final EmployeeServiceImplement manager1 = new EmployeeServiceImplement();
    private static final Scanner sc = new Scanner(System.in);
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    @Override

    public void addNew() {
        int id = 0;
        int salary = 0;
        int sex = 1;
        String gender = "";
        String degree = "";
        int bangCap = 0;
        String position = "";
        int viTri = 0;

        System.out.print("Nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập sinh nhật: ");
        String birthday = sc.nextLine();
        do {
            System.out.print("0. Nam\t\t1. Nữ" + "\nNhập giới tính: ");
            try {
                sex = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Sai định dạng!");
            }
            if (sex == 0){
                gender = "Nam";
            }else if (sex == 1){
                gender = "Nữ";
            }
        } while (sex < 0 || sex > 1);

        System.out.print("Nhập số CMND: ");
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
            System.out.print("Nhập bằng cấp: ");
            try {
                bangCap = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Không đúng định dạng!");
            }
            switch (bangCap){
                case 1:
                    degree = "Trung cấp";
                    break;

                case 2:
                    degree = "Cao đẳng";
                    break;

                case 3:
                    degree = "Đại học";
                    break;

                case 4:
                    degree = "Sau đại học";
                    break;

                default:
                    System.out.println("Nhập số từ 1 - 4!");
                    manager1.addNew();
                    break;
            }
        } while (bangCap < 1 || bangCap > 4);


        do {
            System.out.print("Nhập vị trí: ");
            try {
                viTri = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Không đúng định dạng!");
            }
            switch (viTri){
                case 1:
                    position = "Lễ tân";
                    break;

                case 2:
                    position = "Phục vụ";
                    break;

                case 3:
                    position = "Chuyên viên";
                    break;

                case 4:
                    position = "Giám sát";
                    break;

                case 5:
                    position = "Quản lý";
                    break;

                case 6:
                    position = "Giám đốc";
                    break;

                default:
                    System.out.println("Nhập số từ 1 - 6!");
                    manager1.addNew();
                    break;
            }
        } while (viTri < 1 || viTri > 6);

        System.out.print("Nhập lương: ");
        try {
            salary = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }

        Employee employee = new Employee(name, birthday, gender, id, phoneNum, email, degree, position, salary);
        employeeList.add(employee);
        ReadAndWrite.writeEmployee(employeeList, "E:\\Codegym\\module_2\\src\\case_study\\data\\employee.csv");
        manager1.display();
    }

    @Override
    public void edit() {
        String name;
        int sex = 0;
        System.out.print("Nhập tên của người cần sửa: ");
        name = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (name.equals(employeeList.get(i).getName())) {
                int salary = 0, id = 0;
                System.out.print("Nhập tên nhân viên: ");
                name = sc.nextLine();
                System.out.print("Nhập sinh nhật: ");
                String birthday = sc.nextLine();
                System.out.print("0. Nam\t\t1. Nữ" + "\nNhập giới tính: ");
                String gender = "";
                try {
                    sex = Integer.parseInt(sc.nextLine());
                }catch (NumberFormatException e){
                    System.out.println("Sai định dạng!");
                }
                if (sex == 0){
                    gender = "Nam";
                }else if (sex == 1){
                    gender = "Nữ";
                }
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
                System.out.print("Nhập bằng cấp: ");
                String degree = sc.nextLine();
                System.out.print("Nhập vị trí: ");
                String position = sc.nextLine();
                System.out.print("Nhập lương: ");
                try {
                    salary = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Sai định dạng!");
                }

                Employee employee = new Employee(name, birthday, gender, id, phoneNum, email, degree, position, salary);
                ReadAndWrite.writeEmployee(employeeList,"E:\\Codegym\\module_2\\src\\case_study\\data\\employee.csv");
                employeeList.set(i, employee);
                ReadAndWrite.writeEmployee(employeeList,"E:\\Codegym\\module_2\\src\\case_study\\data\\employee.csv");
                System.out.println("Sửa thông tin người dùng thành công!");
                employeeManage();
            }
        }
        System.out.println("Không tìm thấy!");
        manager1.display();
    }

    @Override
    public void display() {
        for (int i = 0; i < 140; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("|%4s|%16s|%12s|%8s|%12s|%15s|%20s|%15s|%15s|%12s|\n",
                "STT", "Name", "Birthday", "Gender", "CMND", "Phone", "Email", "Degree", "Position", "Salary");
        for (int i = 0; i < 140; i++) {
            System.out.print("-");
        }
        System.out.println();
        employeeList = ReadAndWrite.readEmployee("E:\\Codegym\\module_2\\src\\case_study\\data\\employee.csv");
        for (int i = 0; i < Objects.requireNonNull(employeeList).size(); i++) {
            System.out.printf("|%4s|%16s|%12s|%8s|%12s|%15s|%20s|%15s|%15s|%12s|\n",
                    i + 1, employeeList.get(i).getName(), employeeList.get(i).getBirthday(), employeeList.get(i).getGender(),
                    employeeList.get(i).getId(), employeeList.get(i).getPhoneNum(), employeeList.get(i).getEmail(),
                    employeeList.get(i).getDegree(), employeeList.get(i).getPosition(), employeeList.get(i).getSalary());
        }
        for (int i = 0; i < 140; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public void delete() {
        String name;
        System.out.print("Nhập tên của người cần xoá: ");
        name = sc.nextLine();
        for (int j = 0; j < employeeList.size(); j++) {
            if (name.equals(employeeList.get(j).getName())) {
                ReadAndWrite.readEmployee("E:\\Codegym\\module_2\\src\\case_study\\data\\employee.csv");
                employeeList.remove(j);
                ReadAndWrite.writeEmployee(employeeList,"E:\\Codegym\\module_2\\src\\case_study\\data\\employee.csv");
                break;
            }
        }
        manager1.display();
    }
}
