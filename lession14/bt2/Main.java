package lession14.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of arr: ");
        int size = sc.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            list[i] = sc.nextInt();
        }

        int[] sortedList = BubbleSortByStep.bubbleSort(list);
        System.out.println("\nSorted List:");
        for (int i = 0; i < sortedList.length; i++) {
            System.out.println("list[" + i + "]: " + sortedList[i]);
        }
    }
}
