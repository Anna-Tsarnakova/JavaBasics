import java.util.Scanner;


public class Pr09_PointsInsideTheHouse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean inLeftFigure = x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5 ? true : false;
		boolean inRightFigure = x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5 ? true : false;
		
		if (inTopFigure(x, y, 12.5, 8.5, 22.5, 8.5, 17.5, 3.5) || inRightFigure || inLeftFigure) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
	static Boolean inTopFigure(double x, double y, double ax, double ay, double bx, double by, double cx, double cy) {
		double a_x = x - ax;
		double a_y = y - ay;
		
		Boolean ab = (bx-ax) * a_y - (by-ay) * a_x > 0;
		
		if((cx-ax) * a_y - (cy-ay) * a_x > 0 == ab) return false;
		if((cx-bx) * (y-by) - (cy-by) * (x-bx) > 0 != ab) return false;
		
		return true;
	}
}
