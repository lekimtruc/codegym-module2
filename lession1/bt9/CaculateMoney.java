package lession1.bt9;

import java.util.Scanner;

public class CaculateMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền (USD): ");
        double usdMoney = sc.nextDouble();
        double vnd = usdMoney * 23000;

        System.out.println(usdMoney + " USD = " +vnd+ " VND");
    }
}
