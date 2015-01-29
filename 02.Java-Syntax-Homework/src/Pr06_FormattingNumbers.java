import java.util.Scanner;


public class Pr06_FormattingNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		String aBinaryString = Integer.toBinaryString(a);
		int aBinary = Integer.parseInt(aBinaryString);
		System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, aBinary, b, c);
	}

}
