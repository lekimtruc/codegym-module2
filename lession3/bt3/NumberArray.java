package lession3.bt3;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = 0, maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " +(i+1)+ " :");
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Largest element in array: " +max+ " at index: " +maxIndex);
    }
}
