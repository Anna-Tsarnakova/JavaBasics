package ArrayTest;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);	
		
		int sizeOfArray = scn.nextInt();
		long[] array = new long[sizeOfArray];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextLong(); 
		}
		
		String command = scn.next();
//Changed the command over with stop
		while (!command.equals("stop")) {
			String line = scn.nextLine().trim();
			int[] params = new int[2];
//Changed the command substract with subtract
			if(command.equals("add") || command.equals("subtract") || command.equals("multiply")) {
				String[] stringParams = line.split(" ");
				params[0] = Integer.parseInt(stringParams[0]);
				params[1] = Integer.parseInt(stringParams[1]);

				performAction(array, command, params);
			}
			//Added else block
			else {
				performAction(array, command, params);
			}
			
			printArray(array);
			System.out.print('\n');
			
			command = scn.next();			
		}		
	}
	
	static void performAction(long[] array, String action, int[] params){ //Changed arr = array, because in the cases is array
//		long[] array = arr.clone(); //Deleted - it isn't necessary
		int pos = params[0]-1;
		int value = params[1];

		switch (action) {
		case "multiply":
			array[pos] *= value;
			break;
		case "add":
			array[pos] += value;
			break;
		case "subtract":
			array[pos] -= value;
			break;
		case "lshift":
			arrayShiftLeft(array);
			break;
		case "rshift":
			arrayShiftRight(array);
			break;
		}
	}

	private static void arrayShiftRight(long[] array) {
		long tempValue = array[array.length - 1]; //Added a new variable, which is the most right element, the last element in the array
		for (int i = array.length-1; i >= 1 ; i--) {
			array[i] = array[i - 1];
		}
//Added a new line, where the most right element which goes outside the array, becomes first
		array[0] = tempValue; 
	}

	private static void arrayShiftLeft(long[] array) {
		long tempValue = array[0]; //Added a new variable, which is the most left element, the first element in the array
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
//Added a new line, where the first element which goes outside the array will becomes last.
		array[array.length - 1] = tempValue; 
	}

	private static void printArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}