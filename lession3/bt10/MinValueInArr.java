package lession3.bt10;

import java.util.Arrays;
import java.util.Scanner;

public class MinValueInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1)+ " : ");
            arr[i] = sc.nextInt();
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Min value in array " +(new StringBuilder(Arrays.toString(arr)))+ " is: " +min);
    }
}
