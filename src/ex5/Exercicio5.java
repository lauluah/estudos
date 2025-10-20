package ex5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex5 {
        public static boolean validatePin(String pin) {
            Pattern pattern = Pattern.compile("\\d{5,6}");
            Matcher matcher = pattern.matcher(pin);
            
            return true;
        }

}
