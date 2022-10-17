package bai_15.bai_tap.illegal_triangle_exception;

import bai_15.thuc_hanh.number_format_exception.IllegalTriangleException;
import bai_15.thuc_hanh.number_format_exception.TriangleEdgesCheck;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        try {
            System.out.print("Nhập cạnh a: ");
            a = sc.nextDouble();
            System.out.print("Nhập cạnh b: ");
            b = sc.nextDouble();
            System.out.print("Nhập cạnh c: ");
            c = sc.nextDouble();
            System.out.println("Độ dài 3 cạnh của tam giác là: " + a + " " + b + " " + c);

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }
        }
        catch (Exception exception){
            System.err.println("Sai định dạng tam giác!");
        }
    }
}
