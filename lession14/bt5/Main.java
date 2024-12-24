package lession14.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            list[i] = sc.nextInt();
        }
        InsertionSort.insertionSort(list);
        System.out.println("Insertion Sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("list[" + i + "]: " + list[i]);
        }
    }
}
