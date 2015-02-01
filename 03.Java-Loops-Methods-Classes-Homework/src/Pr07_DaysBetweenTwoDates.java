import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Pr07_DaysBetweenTwoDates {

	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		String firstDate = input.nextLine();
		String secondDate = input.nextLine();
		
		LocalDate d1 = LocalDate.parse(firstDate, DateTimeFormatter.ofPattern("d-MM-yyyy"));
		LocalDate d2 = LocalDate.parse(secondDate, DateTimeFormatter.ofPattern("d-MM-yyyy"));
		
		System.out.println(ChronoUnit.DAYS.between(d1, d2));
	}

}
