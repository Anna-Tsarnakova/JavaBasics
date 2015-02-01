import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Pr08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		
		BufferedReader fileReader = null;
		try	{ 
			fileReader = new BufferedReader(new FileReader("src/Pr08_Input.txt")); 
			int sum = 0;
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					// End of file is reached
					break;
				}
				sum += Integer.parseInt(line);
			}
			System.out.println(sum);
			
		} catch (IOException ioex) {
			System.err.println("Error");
		}finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.err.println("Error closing the file.");
			}
		}
	}
}
