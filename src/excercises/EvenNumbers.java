package excercises;
import java.util.Arrays;
import java.util.ArrayList;

public class EvenNumbers {

    public static void main(String[] args) {
        Integer total = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (Integer num : numbers) {

            if (num % 2 == 0) {
                total += num;
            }
        }
        System.out.println(total);
    }
}