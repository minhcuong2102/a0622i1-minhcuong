package bai_2;

public class In20SoNguyenTo {
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
        int cnt = 0, n = 2;
        while (cnt < 20){
            if (isPrime(n)){
                System.out.println(n);
                cnt++;
            }
            n++;
        }
    }
}
