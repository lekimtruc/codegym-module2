package lession3.bt8;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for arr1: ");
        int arr1Size = sc.nextInt();
        int[] arr1 = new int[arr1Size];
        for (int i = 0; i < arr1Size; i++) {
            System.out.print("Enter element " +(i+1)+ " : ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size for arr2: ");
        int arr2Size = sc.nextInt();
        int[] arr2 = new int[arr2Size];
        for (int i = 0; i < arr2Size; i++) {
            System.out.print("Enter element " +(i+1)+ " : ");
            arr2[i] = sc.nextInt();
        }

        int arr3Size = arr1Size + arr2Size;
        int[] arr3 = new int[arr3Size];
        for (int i = 0; i < arr3.length; i++) {
            if(i < arr1.length){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.println("New Array: ");
        System.out.println(new StringBuilder(Arrays.toString(arr3)));
    }
}
