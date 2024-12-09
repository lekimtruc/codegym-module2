package lession1.bt4;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất có dạng ax + b = c");
        System.out.println("Sau đây, hãy lần lượt nhập a, b và c");

        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        System.out.print("c = ");
        double c = sc.nextDouble();
        if(a == 0){
            if(b==c){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            double x = (c - b) / a;
            System.out.println("Nghiệm x = " +x);
        }
    }
}
