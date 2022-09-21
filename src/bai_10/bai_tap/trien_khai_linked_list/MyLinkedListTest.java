package bai_10.bai_tap.trien_khai_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();

        list1.add(0, 11);
        list1.add(1, 12);
        list1.add(2, 13);
        list1.add(3, 14);
        list1.add(4, 15);

        System.out.println("Before remove: ");
        list1.printList();
        System.out.print("Size = ");
        System.out.println(list1.size());
        System.out.print("Check contain:");
        System.out.println(list1.contains(3) + " " + "at index = " + " " + list1.indexOf(3));

        list1.remove(2);

        System.out.println("After remove: ");
        list1.printList();
        System.out.print("Size = ");
        System.out.println(list1.size());

        System.out.println("Clone:");
        MyLinkedList<Integer> newList = (MyLinkedList<Integer>) list1.clone();
        newList.printList();
    }
}
