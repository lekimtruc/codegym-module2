package lession3.bt6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number want to delete: ");
        int deleteValue = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteValue) {
                for (int j = i; j < arr.length; j++) {
                    if (j == arr.length - 1) {
                        arr[arr.length - 1] = 0;
                    }else{
                        arr[j] = arr[j + 1];
                        arr[arr.length - 1] = 0;
                    }
                }
            }
        }
        System.out.println("New array after delete: ");
        System.out.println(new StringBuilder(Arrays.toString(arr)));
    }
}
