package lession15.bt3;

import java.util.Scanner;

public class CalculationExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calc(x, y);
    }
    private void calc(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("x + y = " + a);
            System.out.println("x - y = " + b);
            System.out.println("x * y = " + c);
            System.out.println("x / y = " + d);
        }catch (Exception e){
            System.out.println("Exception: " +e.getMessage());
        }
    }
}
