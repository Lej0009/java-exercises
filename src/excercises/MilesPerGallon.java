package excercises;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        float milesDriven;
        float startGallons;
        float endGallons;
        float mpg;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("What is your starting gallons?");
        startGallons = in.nextFloat();
        System.out.println("What is your ending gallons?");
        endGallons = in.nextFloat();
        System.out.println("How many miles have you driven?");
        milesDriven = in.nextFloat();

        mpg = ((startGallons-endGallons) / milesDriven);
        System.out.println("The miles per gallon is: " + mpg);

    }
}