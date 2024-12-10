package lession2.bt1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        if(n <= 1){
            System.out.println(n +" is not prime number");
        }else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(n +" is not prime number");
            }else{
                System.out.println(n +" is prime number");
            }
        }
    }
}
