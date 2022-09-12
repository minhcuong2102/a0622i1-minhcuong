package bai_4.stop_watch;

import java.time.LocalTime;
import java.util.Arrays;


public class MainStopWatch {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng mới: " + Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200);
        }
        LocalTime start = LocalTime.now();

        selectionSort(arr);

        LocalTime end = LocalTime.now();

        StopWatch stopWatch1 = new StopWatch(start, end);
        System.out.println("Thời gian thực hiện: " + stopWatch1.getElapsedTime() + " milisecond.");
    }
}
