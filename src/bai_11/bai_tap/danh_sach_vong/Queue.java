package bai_11.bai_tap.danh_sach_vong;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }

    public Node deQueue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = this.front.link;
        if (this.front == null) {
            this.rear = null;
        }
        return temp;
    }

    public void displayQueue(){
        Node temp = this.front;
        System.out.print("Elements: ");
        while (temp.link != this.front){
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
}
