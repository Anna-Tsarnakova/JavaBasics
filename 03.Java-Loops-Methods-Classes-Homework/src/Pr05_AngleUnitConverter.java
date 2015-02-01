import java.util.Scanner;


public class Pr05_AngleUnitConverter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double[] number = new double[n];
		String[] measure = new String[n];
		
		for (int i = 0; i < n; i++) {
			number[i] = input.nextDouble();
			measure[i] = input.next();
			
			convertRadToDeg(number[i], measure[i]);
			convertDegToRad(number[i], measure[i]);		
		}
		
	}
	
	private static double convertRadToDeg(double number, String measure){
		double result=0;
		if (measure.equals("rad")) {
			result = (number*180)/Math.PI; // or result = Math.toDegrees(number);
			System.out.printf("%.6f deg\n", result);
		}
		return result;
	}
	
	private static double convertDegToRad(double number, String measure){
		double result=0;
		if (measure.equals("deg")) {
			result = number*(Math.PI/180); // or result = Math.toRadians(number);
			System.out.printf("%.6f rad\n", result);
		}
		return result;
	}
}
