import java.util.Arrays;

public class Regex {
    public static void main(String[] args) {
        String str = "Hello World 1 2 3 4 5 ABABAB";
        System.out.println(Arrays.toString(str.split("[o|0-9a-z]")));

        String str2 = "abcb12";
        System.out.println(str2.matches("(ab)*[a-z]*|(ab)*[a-z]*[0-9]{2}"));

        String str3 = "ABCD";
        System.out.println(str3.matches("(?i)(abcd)"));

        String str4 = "ABCD123x";
        System.out.println(str4.matches("[A-Z]*[0-9]*$x*"));
    }
}
