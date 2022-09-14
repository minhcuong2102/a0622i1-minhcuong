package bai_5.xay_dung_lop_chi_ghi;

public class Student {
    public String name = "Cường";
    public String classes = "A06";

    public Student(){

    }

    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String setClasses(String classes){
        return this.classes = classes;
    }
}
