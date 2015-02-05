import java.util.ArrayList;
import java.util.Scanner;

public class Pr4_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int[] numbers = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }

        ArrayList<String> sequence = new ArrayList<String>();

        String currentSeq = "" + numbers[0];
        int maxCount = 0;
        int count = 1;
        String longest = "";

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > (numbers[i - 1])) {
                currentSeq += " " + numbers[i];
                count++;
                if (i == numbers.length - 1 && count > maxCount) {
                    longest = currentSeq;
                }
            }
            else {
                sequence.add(currentSeq.trim());
                if (count > maxCount) {
                    maxCount = count;
                    longest = currentSeq.trim();
                }
                currentSeq = "" + numbers[i];
                count = 1;
            }
        }
        sequence.add(currentSeq.trim());
        for (int i = 0; i < sequence.size(); i++) {
            System.out.println(sequence.get(i));
        }
        System.out.println("Longest: " + longest);
    }
}
