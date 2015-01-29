import java.util.Scanner;


public class Pr03_PointsInsideAFigure {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		String[] points = inputLine.split(" ");
		float x = Float.parseFloat(points[0]);
		float y = Float.parseFloat(points[1]);
		
		boolean topFigure = x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5 ? true : false;
		boolean leftFigure = x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5 ? true : false;
		boolean rightFigure = x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5 ? true : false;
		
		if (topFigure || rightFigure || leftFigure) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
		
	}

}
