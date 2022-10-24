package bai_19.bai_tap.validate_ten_lop_hoc;

public class ClassNameExampleTest {
    public static final String[] validClassName = new String[] { "C0318G", "A0622I", "P0443L" };
    public static final String[] invalidClassName = new String[] { "M0318G", "P0323A", "B02303" };
    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String name : validClassName){
            boolean isValid = classNameExample.validate(name);
            System.out.println("Class name " + name + " is valid: " + isValid);
        }

        for (String name : invalidClassName){
            boolean isValid = classNameExample.validate(name);
            System.out.println("Class name " + name + " is valid: " + isValid);
        }
    }
}
