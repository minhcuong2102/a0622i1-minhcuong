package case_study.models.person;

import java.util.Date;

public class Employee extends Person{
    private int employeeId;
    private String degree;
    private String position;
    private int salary;

    public Employee(int employeeId, String degree, String position, int salary) {
        this.employeeId = employeeId;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, Date birthday, String gender, int id, int phoneNum, String email, int employeeId, String degree, String position, int salary) {
        super(name, birthday, gender, id, phoneNum, email);
        this.employeeId = employeeId;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
