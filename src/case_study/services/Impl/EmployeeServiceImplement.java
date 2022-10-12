package case_study.services.Impl;

import case_study.models.person.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImplement implements EmployeeService {
    private static final EmployeeServiceImplement manager1 = new EmployeeServiceImplement();
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Employee> employeeList = new ArrayList<>();

    @Override

    public void addNew() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
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
        int salary = Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(id, name, birthday, gender, phoneNum, email, degree, position, salary);
        employeeList.add(employee);
        manager1.display();
    }

    @Override
    public void edit(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
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
                System.out.print("Nhập bằng cấp: ");
                String degree = sc.nextLine();
                System.out.print("Nhập vị trí: ");
                String position = sc.nextLine();
                System.out.print("Nhập lương: ");
                int salary = Integer.parseInt(sc.nextLine());

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
        System.out.printf("|%4s|%16s|%15s|%8s|%15s|%16s|%15s|%15s|%12s\n",
                "ID", "Name", "Birthday", "Gender", "Phone", "Email", "Degree", "Position", "Salary");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Employee employee : employeeList) {
            System.out.printf("|%4s|%16s|%15s|%8s|%15s|%16s|%15s|%15s|%12s\n",
                    employee.getId(), employee.getName(), employee.getBirthday(),
                    employee.getGender(), employee.getPhoneNum(), employee.getEmail(),
                    employee.getDegree(), employee.getPosition(), employee.getSalary());
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
