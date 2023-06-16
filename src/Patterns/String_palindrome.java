package Patterns;

public class String_palindrome {
    public static void main(String[] args) {

        String string="YASH";
        StringBuffer stringBuffer=new StringBuffer(string);
        stringBuffer.reverse();
        String str= string;
        System.out.println(string.equals(str)?"It is palindrome":"It is not palindrome");
    }
}
