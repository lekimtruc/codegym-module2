package lession1.bt10;

import java.util.Scanner;

public class CallNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String n = sc.next();
        String number = new StringBuilder(n).reverse().toString();

        if (number.length() == 1) {
            System.out.println(Number1Char(number));
        } else if (number.length() == 2) {
            System.out.println(Number2Chars(number));
        } else if (number.length() == 3) {
            System.out.println(Number3Chars(number));
        }

    }

    public static String Number3Chars(String number){
        switch (number.charAt(2)){
            case '1':
                return ("One hundred and ".concat(Number2Chars(number)));
            case '2':
                return ("Two hundred and ".concat(Number2Chars(number)));
            case '3':
                return ("Three hundred and ".concat(Number2Chars(number)));
            case '4':
                return ("Four hundred and ".concat(Number2Chars(number)));
            case '5':
                return ("Five hundred and ".concat(Number2Chars(number)));
            case '6':
                return ("Six hundred and ".concat(Number2Chars(number)));
            case '7':
                return ("Seven hundred and ".concat(Number2Chars(number)));
            case '8':
                return ("Eight hundred and ".concat(Number2Chars(number)));
            case '9':
                return ("Nine hundred and ".concat(Number2Chars(number)));
        }
        return null;
    }
    public static String Number2Chars(String number){
        switch (number.charAt(1)){
            case '1':
                switch (number.charAt(0)){
                    case '0':
                        return "ten";
                    case '1':
                        return "eleven";
                    case '2':
                        return "twelve";
                    case '3':
                        return "thỉrteen";
                    case '4':
                        return "fourteen";
                    case '5':
                        return "fifteen";
                    case '6':
                        return "sixteen";
                    case '7':
                        return "seventeen";
                    case '8':
                        return "eighteen";
                    case '9':
                        return "nineteen";
                }
                break;
            case '2':
                return ("twenty ".concat(Number1Char(number)));
            case '3':
                return ("thirty ".concat(Number1Char(number)));
            case '4':
                return ("forty ".concat(Number1Char(number)));
            case '5':
                return ("fifty ".concat(Number1Char(number)));
            case '6':
                return ("sixty ".concat(Number1Char(number)));
            case '7':
                return ("seventy ".concat(Number1Char(number)));
            case '8':
                return ("eighty ".concat(Number1Char(number)));
            case '9':
                return ("ninety ".concat(Number1Char(number)));
        }
        return null;
    }
    public static String Number1Char(String number) {

        switch (number.charAt(0)) {
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
        }
        return null;
    }

}
