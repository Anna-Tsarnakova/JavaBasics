import java.util.Scanner;

public class Pr5_CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] textArray = text.split("\\W+");
        System.out.println(textArray.length);
    }
}
