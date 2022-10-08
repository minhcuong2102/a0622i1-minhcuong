package case_study.models.person;

import java.util.Date;

public class Customer extends Person{
    private int customerId;
    private String customerType;
    private String address;

    public Customer(int customerId, String customerType, String address) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, Date birthday, String gender, int id, int phoneNum, String email, int customerId, String customerType, String address) {
        super(name, birthday, gender, id, phoneNum, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
}
