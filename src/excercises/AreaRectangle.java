package excercises;
import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {
        float length;
        float width;
        float area;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("What is the length?");
        length = in.nextFloat();
        System.out.println("What is the width?");
        width = in.nextFloat();

        area = length * width;
        System.out.println("The area is: " + area);

    }
}
