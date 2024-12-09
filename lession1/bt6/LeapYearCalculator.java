package lession1.bt6;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm để kiểm tra năm nhuận: ");
        int year = sc.nextInt();

        if(year % 400 == 0 || ((year % 100 != 0) && (year % 4 == 0))){
            System.out.println("Năm " +year+ " là năm nhuận");
        }else{
            System.out.println("Năm " +year+ " không phải là năm nhuận");
        }
    }
}
