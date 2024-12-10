package lession2.bt6;

import java.util.Scanner;

public class SoNguyenTo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int n = sc.nextInt(),
                count = 0,
                maxInt = Integer.MAX_VALUE;
        for (int i = 2; i < maxInt; i++) {
            for (int j = 1; j < maxInt; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + "  ");
                n--;
                if (n == 0) {
                    break;
                }
            }
            count = 0;
        }
    }
}
