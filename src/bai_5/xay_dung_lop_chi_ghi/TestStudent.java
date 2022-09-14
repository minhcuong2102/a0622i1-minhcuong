package bai_5.xay_dung_lop_chi_ghi;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Tài", "A06");
        Student student3 = new Student();
        student3.setName("Vũ");
        student3.setClasses("A06");
        System.out.println(student1.name + " đang học lớp " + student1.classes);
        System.out.println("Student 2 có tên là " + student2.name);
        System.out.println("Học sinh " + student3.name + " học lớp " + student3.classes);
    }
}
