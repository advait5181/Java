package StringHandling;

public class Demo6 {
    public static void main(String[] args) {

        String str1 = "Welcome to String Handling Chapter";
        str1 = str1.trim().toUpperCase();
        System.out.println(str1);

        String str = "   Welcome:to:String:Handling:Chapter   ";
        System.out.println(str.trim().replace(':',' '));

        // Splitting String:

        String[] string = str.split(":");
        for (String temp : string) {
            System.out.println(temp);
        }

        System.out.println("Printing an Array");
        int [] array = {1,2,3,4};
        for (int temp : array) {
            System.out.println(temp+" ");
        }
    }
}
