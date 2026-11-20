package StringZeroToHero;

public class RemoveExtraSpacesFromString {
    public static void main(String[] args) {
        String s = "ram   is  Good";
        System.out.println(s.trim().replaceAll("\\s+"," "));
    }
}
