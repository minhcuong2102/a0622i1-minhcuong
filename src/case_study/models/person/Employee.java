package case_study.models.person;

public class Employee extends Person {
    private String degree;
    private String position;
    private int salary;

//    public Employee(String degree, String position, int salary) {
//        this.degree = degree;
//        this.position = position;
//        this.salary = salary;
//    }

    public Employee(int id, String name, String birthday, String gender, String phoneNum, String email, String degree, String position, int salary) {
        super(id, name, birthday, gender, phoneNum, email);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
