package excercises;
import java.util.Scanner;

public class SearchTerm {

    public static void main(String[] args) {
        String term;
        String aliceString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("What term would you like to search for?");
        term = in.next();

        if (aliceString.contains(term)) {
            System.out.println("The term was found.");
        } else {
            System.out.println("The term was not found.");
        }

    }
}