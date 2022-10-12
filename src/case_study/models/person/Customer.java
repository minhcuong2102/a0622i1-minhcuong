package case_study.models.person;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String name, String birthday, String gender, String phoneNum, String email, String customerType, String address) {
        super(id, name, birthday, gender, phoneNum, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
