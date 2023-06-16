package StringHandling;

public class DemoCharAt {
    public static void main(String[] args) {

        String str = "This is Demo for CharAt";

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            System.out.println(c);
        }
        String str2 = new String(charArray);
    }
}
