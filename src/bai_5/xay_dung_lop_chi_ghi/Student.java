package bai_5.xay_dung_lop_chi_ghi;

public class Student {
    private String name = "Cường";
    private String classes = "A06";

    public Student() {

    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses(){
        return classes;
    }
}
