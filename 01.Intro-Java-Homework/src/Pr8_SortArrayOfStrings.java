import java.util.Arrays;
import java.util.Scanner;


public class Pr8_SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String[] output = new String[number];
		
		for (int i = 0; i < number; i++) {
			output[i] = input.next();
		}
		
		Arrays.sort(output);
		
		for (int j = 0; j < output.length; j++) {
			System.out.println(output[j]);
		}
	}

}
