import java.util.Scanner;


public class Pr01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int startNum = input.nextInt();
		int endNum = input.nextInt();
		if (startNum > 0 && startNum < endNum && endNum < 1000) {
			for (int i = startNum; i <= endNum; i++) {					
				int a = (i / 100) % 10;
				int b = (i / 10) % 10;
				int c = i % 10;
				
				if ((i < 10) || (i > 10 && i < 100 && b==c) || (i > 100 && i < 1000 && a==c)) {
					System.out.print(i + " ");	
				}	
				
//				Second variant
//				char[] digits = Integer.toString(i).toCharArray();
//				if (digits.length == 1 || (digits.length == 2 && digits[0] == digits[1]) || (digits.length == 3 && digits[0] == digits[2])) {
//					System.out.print(i + " ");
//				}	
			}
		} 
		else {
			System.out.println("Invalid input!");
		}
	}
}