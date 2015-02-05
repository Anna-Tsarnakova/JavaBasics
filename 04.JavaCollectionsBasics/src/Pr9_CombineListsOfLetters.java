import java.util.ArrayList;
import java.util.Scanner;

public class Pr9_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] firstLine = input.nextLine().split(" ");
        String[] secondLine = input.nextLine().split(" ");
        ArrayList<Character> l1 = new ArrayList<Character>();
        ArrayList<Character> l2 = new ArrayList<Character>();
        ArrayList<Character> result = new ArrayList<Character>(l1);

        l1 = addCharacters(firstLine, l1);
        l2 = addCharacters(secondLine, l2);
        result = addCharactersFroml2(l1, l2, result);
        printResult(result, l1);

    }
    private static ArrayList<Character> addCharacters(String[] line, ArrayList<Character> list) {
        for (String ch : line) {
            list.add(ch.charAt(0));
        }
        return list;
    }
    private static ArrayList<Character> addCharactersFroml2(ArrayList<Character> l1, ArrayList<Character> l2, ArrayList<Character> result) {
        for (Character character : l2) {
            if (!l1.contains(character)){
                result.add(character);
            }
        }
        return result;
    }

    private static void printResult(ArrayList<Character> result, ArrayList<Character> l1) {
        for (Character character : result) {
            System.out.println(character + " ");
        }
    }

}
