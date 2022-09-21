package bai_11.bai_tap.dao_nguoc_phan_tu;

public class Stack {
    private int maxSize;
    private char[] stackArrays;
    private int top;

    public Stack(int max){
        maxSize = max;
        stackArrays = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArrays[++top] = j;
    }

    public char pop() {
        return stackArrays[top--];
    }

    public char peek() {
        return stackArrays[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }


}
