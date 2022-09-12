package bai_4.PhuongTrinhBacHai;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập 3 hệ số a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation heBacHai = new QuadraticEquation(a, b, c);
        if (heBacHai.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiệm!");
        }else if (heBacHai.getDiscriminant() == 0){
            System.out.println("Phương trình có nghiệm kép x = " + heBacHai.getRoot1());
        }else {
            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + heBacHai.getRoot1() + ", x2 = " + heBacHai.getRoot2());
        }
    }
}
