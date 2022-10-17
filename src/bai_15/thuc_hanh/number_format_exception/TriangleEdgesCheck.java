package bai_15.thuc_hanh.number_format_exception;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Lỗi: Tam giác không đúng định dạng!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
