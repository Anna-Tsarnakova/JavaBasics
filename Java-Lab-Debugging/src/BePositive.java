import java.util.ArrayList;
import java.util.Scanner;

public class BePositive {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int countSequences = scn.nextInt();
		scn.nextLine();//input the next line
		for (int i = 0; i < countSequences; i++) {
			String[] input = scn.nextLine().trim().split(" "); 
			ArrayList<Integer> numbers = new ArrayList<>();
			
			for (int j = 0; j < input.length; j++) {
				if (!input[j].equals("") ) {
//Added trim() method which removes the white-space characters and input[i] is input[j]
					int num = Integer.parseInt(input[j].trim());
					numbers.add(num);	
				}							
			}
			
			boolean found = false;
			
			for (int j = 0; j < numbers.size(); j++) {				
				int currentNum = numbers.get(j);
				
				if (currentNum >= 0) { //Added =
//Swap places of the expressions " " and "\n", because if j == nubers.size()-1 is true print to a new line, else print a white-space
					System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");
					found = true;
				} else {
					if (j + 1 <= numbers.size() - 1) { // if the element isn't last 
						currentNum += numbers.get(j + 1);					
						j++;
					
						if (currentNum >= 0) { //Added =
//Swap places of the expressions " " and "\n", because if j == nubers.size()-1 is true print to a new line, else print a white-space
							System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");
							found = true;
					    }
					}
							
				}
			}
			
			if (!found) {
				System.out.println("(empty)");
			} 			
		}		
	}
}