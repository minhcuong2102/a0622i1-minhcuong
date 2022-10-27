package case_study.services.Impl;

import case_study.models.person.Employee;
import case_study.services.EmployeeService;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeServiceImplement implements EmployeeService {
    private static final EmployeeServiceImplement manager1 = new EmployeeServiceImplement();
    private static final Scanner sc = new Scanner(System.in);
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    @Override

    public void addNew() {
        int id = 0;
        int salary = 0;
        System.out.print("Nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập sinh nhật: ");
        String birthday = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nhập số CMND: ");
        try {
            id = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
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
        } catch (NumberFormatException e){
            System.out.println("Sai định dạng!");
        }

        Employee employee = new Employee(name, birthday, gender, id, phoneNum, email, degree, position, salary);
        employeeList.add(employee);
        ReadAndWrite.writeEmployee(employeeList, "E:\\Codegym\\module_2\\src\\case_study\\data\\employee.csv");
        manager1.display();
    }

    @Override
    public void edit(int index) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (index == i - 1){
                int salary = 0;
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
                System.out.print("Nhập bằng cấp: ");
                String degree = sc.nextLine();
                System.out.print("Nhập vị trí: ");
                String position = sc.nextLine();
                System.out.print("Nhập lương: ");
                try {
                    salary = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e){
                    System.out.println("Sai định dạng!");
                }

                employeeList.get(i).setName(name);
                employeeList.get(i).setBirthday(birthday);
                employeeList.get(i).setGender(gender);
                employeeList.get(i).setPhoneNum(phoneNum);
                employeeList.get(i).setEmail(email);
                employeeList.get(i).setDegree(degree);
                employeeList.get(i).setPosition(position);
                employeeList.get(i).setSalary(salary);
                break;
            }
        }
        manager1.display();
    }

    @Override
    public void display() {
//        Employee employee1 = new Employee(1, "Lê Văn A", "28/03/1999", "Nam",
//                "0999999999", "abc@gmail.com", "Đại học", "Trưởng phòng", 15000000);
//        Employee employee2 = new Employee(2, "Nguyễn Văn B", "28/03/1999", "Nam",
//                "0888888888", "bac@gmail.com", "Đại học", "Trưởng phòng", 15000000);
//        Employee employee3 = new Employee(3, "Trần Văn C", "28/03/1999", "Nam",
//                "0777777777", "cab@gmail.com", "Đại học", "Trưởng phòng", 15000000);
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);

        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%4s|%16s|%12s|%8s|%12s|%15s|%20s|%15s|%15s|%12s\n",
                "STT", "Name", "Birthday", "Gender", "CMND", "Phone", "Email", "Degree", "Position", "Salary");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        employeeList = ReadAndWrite.readEmployee("E:\\Codegym\\module_2\\src\\case_study\\data\\employee.csv");
        for (int i = 0; i < Objects.requireNonNull(employeeList).size(); i++) {
            System.out.printf("|%4s|%16s|%12s|%8s|%12s|%15s|%20s|%15s|%15s|%12s\n",
                    i + 1,  employeeList.get(i).getName(), employeeList.get(i).getBirthday(), employeeList.get(i).getGender(),
                    employeeList.get(i).getId(), employeeList.get(i).getPhoneNum(), employeeList.get(i).getEmail(),
                    employeeList.get(i).getDegree(), employeeList.get(i).getPosition(), employeeList.get(i).getSalary());
        }
    }

    @Override
    public void delete(int id) {
        for (int j = 0; j < employeeList.size(); j++) {
            if (j == id - 1) {
                employeeList.remove(j);
                break;
            }
        }
        manager1.display();
    }
}
