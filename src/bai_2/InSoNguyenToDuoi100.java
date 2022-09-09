package bai_2;

public class InSoNguyenToDuoi100 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 2;
        while (n < 100){
            if (isPrime(n)){
                System.out.println(n);
            }
            n++;
        }
    }
}
