
public class Pr03_FullHouse {

	public static void main(String[] args) {
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = {'\u2660', '\u2666', '\u2665', '\u2663'};
		int count = 0;
		
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < faces.length; j++) {
				if (i != j) {
					for (int firstSuit = 0;  firstSuit < suits.length; firstSuit++) {
						for (int secondSuit = firstSuit + 1; secondSuit < suits.length; secondSuit++) {
							for (int thirdSuit = secondSuit + 1; thirdSuit < suits.length; thirdSuit++) {
								for (int fourthSuit = 0; fourthSuit < suits.length; fourthSuit++) {
									for (int fifthSuit = fourthSuit + 1; fifthSuit < suits.length; fifthSuit++) {
										System.out.printf("(%s%c %s%c %s%c %s%c %s%c) ", 
												faces[i], suits[firstSuit],
												faces[i], suits[secondSuit],
												faces[i], suits[thirdSuit], 
												faces[j], suits[fourthSuit], 
												faces[j], suits[fifthSuit]);
										
										count++;
									}
								}
							}
						}	
					}
				}
			}
		}
		System.out.println();
		System.out.println(count + " full houses");
	}

}
