import java.util.Scanner;

public class Pr08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int intNumber = input.nextInt();
		
		String binaryNumber = Integer.toBinaryString(intNumber);
		int count = 0;
		
		for (int i = 0; i < binaryNumber.length() - 1; i++) {
			if (binaryNumber.charAt(i) == binaryNumber.charAt(i + 1)) {
			count++;
			}
		}
		
		System.out.println(count);
	}

}
