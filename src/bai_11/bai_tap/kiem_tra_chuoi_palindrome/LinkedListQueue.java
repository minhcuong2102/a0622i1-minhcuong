package bai_11.bai_tap.kiem_tra_chuoi_palindrome;

public class LinkedListQueue<T> {
    private Node head;
    private Node tail;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(T key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public T dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return (T)temp.key;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
