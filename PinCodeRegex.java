import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    public static void main(String[] args) {
        System.out.println("Matcing pincode using regex");
		  System.out.println("---------------------------");
        Pattern pattern = Pattern.compile("^[0-9]{6}");
        Matcher matcher = pattern.matcher("A400088");
        boolean result = matcher.matches();
        System.out.println(result);
    }
}
