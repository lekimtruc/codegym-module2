package lession14.bt4;

import java.util.Arrays;

public class InsertionSortStep {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            System.out.println("\nStep " + i + ": ");
            int j = i - 1;
            int temp = list[i];
            while (j >= 0 && temp < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
            Arrays.stream(list)
                    .forEach(n -> System.out.print(n + " "));
        }
    }
}
