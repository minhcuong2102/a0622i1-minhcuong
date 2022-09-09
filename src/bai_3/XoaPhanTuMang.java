package bai_3;
import java.util.Scanner;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class XoaPhanTuMang {
    static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    static int deleteElement(int[] arr, int n, int key){
        int index_del = searchElement(arr, key);
        if (index_del == -1){
            System.out.println("Không tìm thấy phần tử cần xoá.");
        }else {
            for (int i = index_del; i < n; i++) {
                arr[i] = arr[i + 1];
            }
        }
        return n - 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Nhập số phần tử: ");
        int numOfElement = scanner.nextInt();
        for (int i = 0; i < numOfElement; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < numOfElement; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nNhập phần tử cần xoá: ");
        int x = scanner.nextInt();
        numOfElement = deleteElement(arr, numOfElement, x);
        System.out.println("\nMảng mới: ");
        for (int i = 0; i < numOfElement; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
