import java.util.Scanner;
class TienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập số tiền USD cần đổi: ");
        int usd = scanner.nextInt();
        System.out.println("Số tiền VND là: " + usd*rate);
    }
}
