package bai_11.bai_tap.dao_nguoc_phan_tu;

public class StringReverserThroughStack {
    private String input;
    private String output;

    public StringReverserThroughStack(String in) {
        input = in;
    }

    public String reverse() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output += ch;
        }
        return output;
    }
}
