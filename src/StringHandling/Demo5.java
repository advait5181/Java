package StringHandling;

public class Demo5 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";

        System.out.println(str1==str2); //false
        System.out.println(str1.equals(str2));// false
        System.out.println("Without Checking thr case "+ true);

        String str3 = new String("hello");
        String str4 =  new String("hello");

        System.out.println(str3 == str4);// false
        System.out.println(str3.equals(str4));// true
        System.out.println("Without Checking thr case"+str3.equalsIgnoreCase(str4));//true

        String str5 = "hello";
        String str6 = "hello";

        System.out.println(str6 == str3);//false
        System.out.println(str6.equals(str3));//true
    }
}
