import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr8_ExtractEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Pattern pattern = Pattern.compile("[\\w]+[\\.-]*[\\w]+@[A-Za-z-]+-*[A-Za-z]\\.[A-Za-z]+\\.*[A-Za-z]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
