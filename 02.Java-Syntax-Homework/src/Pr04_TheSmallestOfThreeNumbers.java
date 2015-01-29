import java.text.DecimalFormat;
import java.util.Scanner;


public class Pr04_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();

		float minAB = Math.min(a, b);
		float smallestNumber = Math.min(c, minAB);
		
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
		System.out.println(format.format(smallestNumber));
	}

}
