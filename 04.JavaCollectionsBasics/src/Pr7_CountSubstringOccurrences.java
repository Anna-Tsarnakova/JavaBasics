import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr7_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String searchedWord = input.nextLine();
        Pattern pattern = Pattern.compile(searchedWord);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()){
            count++;
            int firstIndex = matcher.start();
            matcher.region(firstIndex + 1, text.length());
        }
        System.out.println(count);
    }
}
