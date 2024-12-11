package lession3.bt5;

import java.util.Scanner;

public class MinValue {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Found min value is: " +minValue(arr));
    }

    public static int minValue(int[] arr){
        int minValue = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " +(i+1)+ " : ");
            arr[i] = sc.nextInt();
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
