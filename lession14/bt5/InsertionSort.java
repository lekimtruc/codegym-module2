package lession14.bt5;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int j = i - 1;
            int temp = list[i];
            while (j >= 0 && temp < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
        return list;
    }
}
