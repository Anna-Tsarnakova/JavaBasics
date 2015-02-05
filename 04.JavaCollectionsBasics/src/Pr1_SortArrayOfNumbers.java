import java.util.Arrays;
import java.util.Scanner;

public class Pr1_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int[] numbersArray = new int[n];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = input.nextInt();
        }

        Arrays.sort(numbersArray);
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
    }
}
