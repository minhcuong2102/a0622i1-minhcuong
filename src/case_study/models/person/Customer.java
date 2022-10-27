package case_study.models.person;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String birthday, String gender, int id, String phoneNum,
                    String email, String customerType, String address) {
        super(name, birthday, gender, id, phoneNum, email);
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
        return this.getName() + "," + this.getBirthday() + "," + this.getGender() + "," +
                this.getPhoneNum() + "," + this.getEmail() + "," + this.getCustomerType() + "," +
                this.getAddress();
    }
}
