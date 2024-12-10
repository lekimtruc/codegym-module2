package lession2.bt2;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        double tienGui = sc.nextDouble();

        System.out.println("Nhập số tháng gửi: ");
        int thang = sc.nextInt();

        System.out.println("Nhập % lãi suất: ");
        double phanTram = sc.nextDouble();

        double tienLai = 0.0;
        for (int i = 0; i < thang; i++) {
            tienLai += tienGui *  (phanTram/100) / 12 * thang;
        }

        System.out.println("Tiền lãi: " +tienLai);
    }
}
