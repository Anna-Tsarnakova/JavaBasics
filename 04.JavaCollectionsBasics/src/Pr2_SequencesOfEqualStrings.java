import java.util.ArrayList;
import java.util.Scanner;

public class Pr2_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] stringsArr = line.split(" ");

        ArrayList<String> result = new ArrayList<>();
        result.add(stringsArr[0]);

        for (int i = 0; i < stringsArr.length - 1; i++) {
            if (stringsArr[i].equals(stringsArr[i+1])) {
                result.add(stringsArr[i + 1]);
                if (i == stringsArr.length - 2) {
                    printSequence(result);
                }
            }
            else {
                printSequence(result);
                System.out.println();
                result.clear();
                result.add(stringsArr[i + 1]);
                if (i == stringsArr.length - 2) {
                    printSequence(result);
                }
            }
        }

        if (stringsArr.length == 1){
            System.out.println(stringsArr[0]);
        }
    }

    private static void printSequence(ArrayList<String> result) {
        for (String sequence : result) {
            System.out.print(sequence + " ");
        }
    }
}
