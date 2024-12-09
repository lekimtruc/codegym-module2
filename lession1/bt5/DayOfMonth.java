package lession1.bt5;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng để kiểm tra số ngày: ");
        int month = sc.nextInt();
        int day;

        switch (month){
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                day = 31;
                System.out.println("Tháng " +month+ " có: " +day + " ngày");
                break;
            case 4, 6, 9, 11:
                day = 30;
                System.out.println("Tháng " +month+ " có: " +day + " ngày");
                break;
        }
    }
}
