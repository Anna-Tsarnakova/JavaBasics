import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pr11_MostFrequentWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().toLowerCase().split("\\W+");
        Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
        wordsCount = countWords(words, wordsCount);
        int maxValue=(Collections.max(wordsCount.values()));
        printMostFrequentWord(wordsCount, maxValue);
    }
    public static void printMostFrequentWord(Map<String, Integer> wordsCount, int maxValueInMap) {
        for (Map.Entry<String, Integer> word : wordsCount.entrySet()) {
            if (word.getValue() == maxValueInMap) {
                System.out.println(word.getKey() + " -> " + word.getValue() + " times");
            }
        }
    }
    public static Map<String, Integer> countWords(String[] words, Map<String, Integer> wordsCount) {
        for (String word : words) {
            Integer count = wordsCount.get(word);
            if (count == null) {
                count = 0;
            }
            wordsCount.put(word, count + 1);
        }
        return wordsCount;
    }
}

