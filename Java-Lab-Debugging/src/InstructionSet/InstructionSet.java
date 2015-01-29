package InstructionSet;

import java.util.Scanner;

public class InstructionSet {
    
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        String opCode = input.nextLine();
        
        while (!opCode.equals("END")) {
            String[] codeArgs = opCode.split(" ");

            long result = 0;
            switch (codeArgs[0]) {
                case "INC": {
                    int operandOne = Integer.parseInt(codeArgs[1]);
//Changed result from postfix increment to operandOne + 1 and typecasting change to long
                    result = (long)operandOne + 1;
                    break;
                }
                case "DEC": {
                    int operandOne = Integer.parseInt(codeArgs[1]);
//Changed result from postfix increment to operandOne - 1 and typecasting change to long
                    result = (long)operandOne - 1;
                    break;
                }
                case "ADD": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                   //Changed the result - typecasting change to long
                    result = (long)operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                	int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    //Changed the result - typecasting change to long
                    result = (long)operandOne * operandTwo;
                    break;
                }
                default: 	
                    break;
            }
            
            opCode = input.nextLine(); //Input again the next command
            System.out.println(result);
        }
    }
}