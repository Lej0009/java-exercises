package excercises;
import java.util.Scanner;

public class HelloUser {
    public HelloUser() {
    }

    public static void main(String[] var0) {
        Scanner var2 = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String var1 = var2.next();
        System.out.println("Hello" + var1 + "!");
    }
}