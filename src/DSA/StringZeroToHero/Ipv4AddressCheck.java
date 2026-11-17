package StringZeroToHero;

public class Ipv4AddressCheck {
    public static boolean validate(String ip) {
        String[] arr = ip.split("\\.");
        if (arr.length != 4)
            return false;

        for (String s : arr) {
            if (s.isEmpty())
                return false;
            if (s.length() > 1 && s.charAt(0) == '0')
                return false;
            int n = Integer.parseInt(s);
            if (n < 0 || n > 255)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(validate("192.168.1.1")); // true
        System.out.println(validate("258.01.20.30")); // false
    }
}
