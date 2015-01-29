import java.util.Scanner;


public class Pr07_CountOfBitsOne {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int intNumber = input.nextInt();
		System.out.println(Integer.bitCount(intNumber));
	}

}
