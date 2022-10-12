package bai_14.bai_tap.cai_dat_insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {4, 6, 3, 5, 2, 1};
        insertionSort(list);
    }

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;

        }
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}
