package bai_10.bai_tap.trien_khai_linked_list;

public class MyLinkedList<E> {
    public class Node {
        protected Node next;
        protected Object element;

        public Node() {
        }

        public Node(Object element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public Object getElement() {
            return element;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;
    private int numNodes;

    public MyLinkedList() {

    }

    public Object clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            newList.addLast((E) temp.getElement());
            temp = temp.getNext();
        }
        return newList;
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        if (tail == null)
            tail = head;
        size++;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
        } else if (size == 0 || index == 0) {
            addFirst(element);
        } else if (index == size) {
            addFirst(element);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = new Node(element);
            current.next.next = temp;
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return (E) temp.element;
        }
    }

    public E removeLast() {
        if (size == 0) return null;
        else if (size == 1) {
            Node temp = head;
            head = tail = null;
            size = 0;
            return (E) temp.element;
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                current = current.next;
            }
            Node temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return (E) temp.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size) {
            return removeLast();
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
            size--;
            return (E) current.element;
        }
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.element;
    }

    public int size() {
        return this.size;
    }

    public void printList() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if ((E) temp.element == o) return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if ((E) temp.element == o) return i;
            temp = temp.next;
        }
        return -1;
    }
}
