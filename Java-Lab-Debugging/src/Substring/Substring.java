package Substring;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int jump = Integer.parseInt(input.nextLine());

        char search = 'р';  //delete this
        boolean hasMatch = false;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'p') { //Changed search with character 'p', of the method charAt() can be assigned characters
                hasMatch = true;

//                int endIndex = jump;

//                if (endIndex >= text.length()) {
//                    endIndex = text.length();
//                }
                
                String matchedString = "";
                for (int j = i; j <= i + jump; j++) {
                	if (j < text.length()) {
                		matchedString +=text.charAt(j);
					}	
				}
//              String matchedString = text.substring(i, endIndex);
                System.out.println(matchedString);
                i += jump;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
    }
}