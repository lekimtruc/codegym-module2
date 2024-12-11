package lession3.bt1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = sc.nextInt();

        if(size > 20){
            System.out.println("Mảng từ 20 phần tử trở xuống");
        }else{
            int[] arr = new int[size];
            for (int i = 0; i < arr.length ; i++) {
                System.out.print("Nhập phần tử " +(i+1)+ " : ");
                arr[i] = sc.nextInt();
            }
            int j=arr.length;
            for (int i = 0; i < j; i++) {
                int temp = arr[i];
                arr[i] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
            System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(arr));
        }
    }
}
