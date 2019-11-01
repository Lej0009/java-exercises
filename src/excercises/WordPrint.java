package excercises;
import java.util.ArrayList;

public class WordPrint {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("apple");
        words.add("kiwi");
        words.add("peach");
        words.add("banana");

        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
