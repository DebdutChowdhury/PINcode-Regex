import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    public static boolean IsPinCodeMatch(String pin){
        Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{2}\s{0,1}[0-9]{3}$");    // my pincode regex here 
        Matcher matcher = pattern.matcher(pin);
        boolean result = matcher.matches();
//        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Matcing pincode using regex:");
        System.out.println("---------------------------");
        String p1 = "400088";                                          // 6 digit pincode number
        System.out.println(p1 + " ==> " +IsPinCodeMatch(p1));

        String p2 = "A400088";                                        // in the beginning of pincode letter or syamol not allow
        System.out.println(p2 + " ==> " +IsPinCodeMatch(p2));

	String p3 = "400088B";					     // in the end of pincode letter or symbol not allow 
        System.out.println(p3+ " ==> "+IsPinCodeMatch(p3));

	String p4 = "400 888";         				    // in the middle of pincode space is valid
        System.out.println(p4 +" ==> "+ IsPinCodeMatch(p4));
    }
}
