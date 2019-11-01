package excercises;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintLoop {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 5, 8));

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
