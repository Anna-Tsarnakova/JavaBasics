import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr12_CardsFrequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cards = input.nextLine().split("\\W+");
        Map<String, Integer> cardsCount = new LinkedHashMap<>();
        cardsCount = fillHashMap(cards, cardsCount);
        double sum = calcSum(cardsCount);
        printResult(cardsCount, sum);
    }
    public static Map<String, Integer> fillHashMap(String[] cards, Map<String, Integer> cardsCount) {
        for (String card : cards) {
            Integer count = cardsCount.get(card);
            if (count == null) {
                count = 0;
            }
            cardsCount.put(card, count + 1);
        }
        return cardsCount;
    }
    private static double calcSum(Map<String, Integer> cardsCount) {
        double sum = 0;
        for (Map.Entry<String, Integer> card : cardsCount.entrySet()) {
            sum += card.getValue();
        }
        return sum;
    }
    public static void printResult(Map<String, Integer> cardsCount, double sum) {
        for (Map.Entry<String, Integer> card : cardsCount.entrySet()) {
            double frequency = (card.getValue() / sum) * 100;
            System.out.printf("%s -> %.2f%%", card.getKey(), frequency);
            System.out.println();
        }
    }
}
