package bai_8.thuc_hanh.tach_bien;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isBuzz)
            return "Fizz";

        if (isFizz)
            return "Buzz";

        return number + "";
    }
}
