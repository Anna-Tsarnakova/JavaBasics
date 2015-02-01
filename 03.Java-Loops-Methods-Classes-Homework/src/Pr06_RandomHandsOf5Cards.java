import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Pr06_RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();	
		
		for (int i = 0; i < n; i++) {
			System.out.println(handsGenerate());
		}
	}
	
	public static ArrayList<String> cardsGenerate(){
		
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = {'\u2660', '\u2666', '\u2665', '\u2663'};
		ArrayList<String> cardsArray = new ArrayList<>();
		
		for (int f = 0; f < faces.length; f++) {
			for (int s = 0; s < suits.length; s++) {
				cardsArray.add(faces[f] + suits[s]);
			}
		}
		return cardsArray;
	}
	
	public static String handsGenerate(){

		Random rnd = new Random();
		ArrayList<String> handsArray = cardsGenerate();
		String hands = "";
		for (int i = 0; i < 5; i++) {
			int rndIndex = rnd.nextInt(handsArray.size());
			hands += handsArray.get(rndIndex) + " ";
			handsArray.remove(rndIndex);
		}
		return hands;
	}
}
