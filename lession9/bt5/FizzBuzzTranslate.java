package lession9.bt5;

public class FizzBuzzTranslate {
    public static String fizzBuzzTranslate(int number){
        boolean isDivisibleBy5 = (number % 5 == 0);
        boolean isDivisibleBy3 = (number % 3 == 0);
        boolean isContain5 = (String.valueOf(number).contains("5"));
        boolean isContain3 = (String.valueOf(number).contains("3"));

        if(number <= 0){
            return "Invalid number!";
        }else{
            if(isDivisibleBy3 && isDivisibleBy5){
                return "FizzBuzz";
            }else if(isDivisibleBy3 || isContain3){
                return "Fizz";
            }else if(isDivisibleBy5 || isContain5){
                return "Buzz";
            }else{
                String stringOfNumber = String.valueOf(number);
                String n = new StringBuilder(stringOfNumber).reverse().toString();
                return Number2Chars(n);
            }
        }
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
