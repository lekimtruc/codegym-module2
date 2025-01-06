package lession19.bt5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private static final String PHONE_NUMBER = "\\(\\d{2}\\)-\\(0\\d{9}\\)";
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
