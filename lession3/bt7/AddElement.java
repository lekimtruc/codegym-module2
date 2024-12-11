package lession3.bt7;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        System.out.print("Enter number want to add: ");
        int number = sc.nextInt();
        System.out.print("Enter index want to add: ");
        int index = sc.nextInt();
        if (index < 0 && index >= arr.length) {
            System.out.println("Cannot add element!!!");
        }
        int temp = 0;
        int temp1 = 0;
        for (int i = 0; i < arr.length; i++) {

            if (index == i) {
                temp = arr[i];
                arr[i] = number;

            } else if(i > index){
                for (int j = i; j < arr.length - 1; j++) {
                    if (j == i) {
                        temp1 =arr[j];
                        arr[j] = temp;
                    } else {
                        arr[j] = temp1;
                        temp1 = arr[j + 1];
                    }
                }
            }
        }
        System.out.println("New array after add element: ");
        System.out.println(new StringBuilder(Arrays.toString(arr)));
    }
}
