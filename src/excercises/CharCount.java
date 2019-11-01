package excercises;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void main(String[] args) {

        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> letters = new HashMap<>();

        for (char c : message.toCharArray()) {
            if (letters.containsKey("c")) {
                Integer count;
                count = letters.get(c);
                Integer newCount = count + 1;
                letters.put(c, newCount);
            } else {
                letters.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            System.out.println(letter.getKey() + ":" + letter.getValue());
        }

    }
}
