package bai_19.bai_tap.validate_so_dien_thoai;

public class PhoneNumberTest {
    public static final String[] validPhoneNumber = new String[] { "(84)-(0978489648)" };
    public static final String[] invalidPhoneNumber = new String[] { "(a8)-(22222222)" };
    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        for (String name : validPhoneNumber){
            boolean isValid = phoneNumberExample.validate(name);
            System.out.println("Phone number " + name + " is valid: " + isValid);
        }

        for (String name : invalidPhoneNumber){
            boolean isValid = phoneNumberExample.validate(name);
            System.out.println("Phone number " + name + " is valid: " + isValid);
        }
    }
}
