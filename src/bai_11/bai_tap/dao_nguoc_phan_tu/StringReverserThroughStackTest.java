package bai_11.bai_tap.dao_nguoc_phan_tu;

public class StringReverserThroughStackTest {
    public static void main(String[] args) {
        String input = "Hello Codegym";
        System.out.println(input);
        String output;
        StringReverserThroughStack theReverser = new StringReverserThroughStack(input);
        output = theReverser.reverse();
        System.out.println("Reversed: " + output);
    }
}