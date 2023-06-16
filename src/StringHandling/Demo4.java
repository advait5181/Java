package StringHandling;

public class Demo4 {
    public static void main(String[] args) {
        String message = "you are student in cyber success";
        message = message.toUpperCase();
        System.out.println(message);

        String source = "cyber success";
        source = source.replace("cyber","Student");
        System.out.println(source+" "+source.length());

        String spaces = " space ";
        spaces = spaces.trim();
        System.out.println(spaces.length());
    }
}
