package BitRotation;

import java.util.Scanner;

public class BitRotation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        byte number = Byte.parseByte(input.nextLine());
        byte rotations = Byte.parseByte(input.nextLine());

        for (int i = 0; i < rotations; i++) {
        	
            String direction = input.nextLine();
            
            if (direction.equals("right")) { //Changed == "right" with equals(), because == compares strings by memory reference 
                int rightMostBit = number & 1;
                number >>= 1;
                number |= rightMostBit << 5; //Changed from 6 to 5, because the max position we can move is 5. Current position of the bit is not in the count.
                
            } else if (direction.equals("left")) { //Changed == "left" with equals(), because == compares strings by memory reference 
                int leftMostBit = (number >> 5) & 1; //Changed from 6 to 5
                number &= ~(1 << 5); //Added this row, which changed the bit with position 5 from 1 to 0.
                number <<= 1;
                number |= leftMostBit;
            }
        }
        
        System.out.println(number);
    }
}