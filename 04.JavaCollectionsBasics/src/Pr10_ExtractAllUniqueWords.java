import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pr10_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();

        String[] words = text.split("\\W+");

        Set<String> uniqueWords = new TreeSet<String>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }

    }
}
