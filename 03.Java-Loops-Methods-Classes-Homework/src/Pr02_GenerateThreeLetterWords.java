import java.util.Scanner;


public class Pr02_GenerateThreeLetterWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String letters =  input.nextLine();
		
		for (int i = 0; i < letters.length(); i++) {
			for (int j = 0; j < letters.length(); j++) {
				for (int k = 0; k < letters.length(); k++) {
					String result = "" + letters.charAt(i) + letters.charAt(j) +letters.charAt(k) + " ";
					System.out.print(result);
				}
			}
			
		}

	}

}
