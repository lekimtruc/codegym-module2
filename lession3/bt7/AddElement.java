package lession3.bt7;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        int[] arr1 = new int[arr.length];
        System.out.print("Enter number want to add: ");
        int number = sc.nextInt();
        System.out.print("Enter index want to add: ");
        int index = sc.nextInt();
        if (index < 0 && index >= arr.length) {
            System.out.println("Cannot add element!!!");
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(i < index){
                    arr1[i] = arr[i];
                }else if(i == index){
                    arr1[i] = number;
                }else{
                    arr1[i] = arr[i];
                }
            }
            System.out.println("New array after add element: ");
            System.out.println(new StringBuilder(Arrays.toString(arr1)));
        }
}
}
