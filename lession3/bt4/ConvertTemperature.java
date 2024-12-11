package lession3.bt4;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while(choice != 0){
            System.out.println("=======Menu=======");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.println(fahrenheit+ "F = " +fahrenheitToCelsius(fahrenheit)+ "C");
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println(celsius+ "C = " +celsiusToFahrenheit(celsius)+ "F");
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
