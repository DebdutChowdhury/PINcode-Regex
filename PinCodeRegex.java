import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    public static boolean IsPinCodeMatch(String pin){
        Pattern pattern = Pattern.compile("^[0-9]{6}");
        Matcher matcher = pattern.matcher(pin);
        boolean result = matcher.matches();
//        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Matcing pincode using regex:");
        System.out.println("---------------------------");
        String p1 = "400088";
        System.out.println(p1 + " ==> " +IsPinCodeMatch(p1));

        String p2 = "A400088";
        System.out.println(p2 + " ==> " +IsPinCodeMatch(p2));
    }
}
