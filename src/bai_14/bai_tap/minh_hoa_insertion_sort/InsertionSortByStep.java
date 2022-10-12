package bai_14.bai_tap.minh_hoa_insertion_sort;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter list size:");
//        int size = scanner.nextInt();
//        int[] list = new int[size];
//        System.out.println("Enter " + list.length + " values:");
//        for (int i = 0; i < list.length; i++) {
//            list[i] = scanner.nextInt();
//        }
//        System.out.print("Your input list: ");
//        for (int value : list) {
//            System.out.print(value + "\t");
//        }
        int[] list = {4, 6, 3, 5, 2, 1};
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
            for (int value : array) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
