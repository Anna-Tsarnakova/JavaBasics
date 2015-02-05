import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr6_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String searchedWord = input.nextLine();
        String[] textArray = text.split("\\W+");

        Map<String, Integer> countWords = new HashMap<String, Integer>();
        for (String word : textArray) {
            Integer count = countWords.get(word);
            if (count == null) {
                count = 0;
            }
            countWords.put(word, count + 1);
        }

        if(countWords.containsKey(searchedWord)){
            System.out.println(countWords.get(searchedWord));
        } else {
            System.out.println(0);
        }
    }

}
