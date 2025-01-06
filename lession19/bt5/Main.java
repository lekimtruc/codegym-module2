package lession19.bt5;

public class Main {
    private static String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    private static String[] inValidPhoneNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        PhoneNumberValidate phoneNumberValidate = new PhoneNumberValidate();

        for (String phoneNumber : validPhoneNumber) {
            boolean isValid = phoneNumberValidate.validate(phoneNumber);
            System.out.println("Phone number: " + phoneNumber + " isValid: " + isValid);
        }

        for (String phoneNumber : inValidPhoneNumber) {
            boolean isValid = phoneNumberValidate.validate(phoneNumber);
            System.out.println("Phone number: " + phoneNumber + " isValid: " + isValid);
        }
    }
}
