package bai_10.bai_tap.trien_khai_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        elements = (E[]) new Object[size];
    }

    private void ensureCapa() {
        if (size > elements.length) {
            int biggerSize = size * 2 + 1;
            elements = Arrays.copyOf(elements, biggerSize);
        }
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        elements[size - 1] = e;
    }


    public boolean add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            return true;
        }
        return false;
    }

    public E get(int index) {
        if (index >= 0 || index < size) {
            return elements[index];
        }
        return null;
    }

    public MyList clone(){
        MyList<E> clone = new MyList<>(elements.length);
        for (E x: elements){
            clone.add(x);
        }
        return clone;
    }

    public E[] getElements(){
        return this.elements;
    }

    public int getSize(){
        return size;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E e) {
        for (E x : elements) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
