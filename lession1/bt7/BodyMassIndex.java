package lession1.bt7;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double canNang = sc.nextDouble();

        System.out.print("Enter height (m): ");
        double chieuCao = sc.nextDouble();

        double bmi = canNang / Math.pow(chieuCao, 2);
        System.out.println("Your BMI: " +bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi < 25.0){
            System.out.println("Normal");
        }else if(bmi < 30.0){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
