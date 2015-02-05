import java.util.Scanner;

public class Pr3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] stringsArr = line.split(" ");

        int countEqualStrings = 1;
        int tempCount = 0;
        String longestSeq = stringsArr[0];

        for (int i = 0; i < stringsArr.length - 1; i++) {
            if (stringsArr[i].equals(stringsArr[i + 1]) && tempCount == 0){
                countEqualStrings++;
            }
            if (stringsArr[i].equals(stringsArr[i + 1]) && tempCount > 0){
                tempCount++;
            }
            if(!stringsArr[i].equals(stringsArr[i + 1])){
                tempCount = 1;
            }
            if (tempCount > countEqualStrings){
                longestSeq = stringsArr[i];
                countEqualStrings = tempCount;
                tempCount = 0;
            }
        }
//        System.out.println(countEqualStrings);
        for (int i = 0; i < countEqualStrings; i++) {
            System.out.print(longestSeq + " ");
        }
    }
}
