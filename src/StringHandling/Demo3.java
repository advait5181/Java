package StringHandling;

public class Demo3 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.toString());

        String greeting = "Good Morning";
        System.out.println("Length of Greeting"+str.length());

        char [] array = {};
        System.out.println(array.length);

        String str1 ="hello";
        System.out.println(str1);

        str1 = "Hello Again";
        System.out.println(str1);

        String name = "XYZ";
        name = name + "ABC";
        name = name.concat("hello");
        System.out.println(name);

    }
}
