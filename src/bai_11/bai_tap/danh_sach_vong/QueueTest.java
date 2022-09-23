package bai_11.bai_tap.danh_sach_vong;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.enQueue(14);
        queue1.enQueue(22);
        queue1.enQueue(-6);
        queue1.deQueue();
        queue1.deQueue();
        queue1.enQueue(9);
        queue1.enQueue(20);
        queue1.displayQueue();
        System.out.println("Dequeue item is: " + queue1.deQueue().data);
    }
}
