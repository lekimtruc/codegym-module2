package lession2.bt3;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        if(a == 0 && b == 0){
            System.out.println(a+ " và " +b+ " không có ước chung lớn nhất");
        }else if(a == 0 && b != 0){
            System.out.println("UCLN của " +a+ " và " +b+ " là: " +Math.abs(b));
        }else if(a != 0 && b == 0){
            System.out.println("UCLN của " +a+ " và " +b+ " là: " +Math.abs(a));
        }else{
            int uocChung = 1;
            if(a < b){
                for (int i = 2; i <= a; i++) {
                    if(b % i == 0){
                        uocChung = i;
                    }
                }
            }else if(b < a){
                for (int i = 2; i <= b; i++) {
                    if(a % i == 0){
                        uocChung = i;
                    }
                }
            }else{
                uocChung = a;
            }
            System.out.println("UCLN của " +a+ " và " +b+ " là: " +uocChung);
        }
    }
}
