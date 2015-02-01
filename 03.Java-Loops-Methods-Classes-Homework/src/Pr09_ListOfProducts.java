import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;


public class Pr09_ListOfProducts {
	public static void main(String[] args) {
		File inputFile = new File("src/Pr09_Input.txt");
		
		ArrayList<Product> productList = new ArrayList<Product>();
		
		productList = readFromFile(productList);
		Collections.sort(productList);
		writeInFile(productList);
		
	}
	
	public static void writeInFile(ArrayList<Product> productList) {
		BufferedWriter fileWriter = null;
		File outputFile = new File("src/Pr09_Output.txt");
		try {
			outputFile.createNewFile();
			fileWriter = new BufferedWriter(new FileWriter("src/Pr09_Output.txt"));
			for (Product product : productList) {
				String writeProduct = product.getPriceOfProduct() + " " + product.getNameOfProduct();
				fileWriter.write(writeProduct);
				fileWriter.newLine();
			}
		} catch (IOException e) {
			System.err.println("Error! Can't to write the file!");
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				System.err.println("Error to close the fileWriter!");
			}	
		}		
	}

	private static ArrayList<Product> readFromFile(ArrayList<Product> productList) {
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("src/Pr09_Input.txt"));
			
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					break;
				}
				String[] productInfo = line.split(" ");
				Product product = new Product();
				product.setNameOfProduct(productInfo[0]);
				product.setPriceOfProduct(new BigDecimal(productInfo[1]));
				productList.add(product);
			}
		} catch (IOException e) {
			System.err.println("Error! Can't to read the file!");

		}  
		finally {
			 if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					System.err.println("Error to close the fileReader!");;
				}
			 }
		 }	
		return productList;
		
	}

}

	 class Product implements Comparable<Product>{
		
		private String nameOfProduct;
		private BigDecimal priceOfProduct;

		@Override
		public int compareTo(Product product) {
			BigDecimal price = ((Product)product).getPriceOfProduct();
			return this.priceOfProduct.compareTo(price);
		}

		public String getNameOfProduct() {
			return nameOfProduct;
		}

		public void setNameOfProduct(String nameOfProduct) {
			this.nameOfProduct = nameOfProduct;
		}

		public BigDecimal getPriceOfProduct() {
			return priceOfProduct;
		}

		public void setPriceOfProduct(BigDecimal priceOfProduct) {
			this.priceOfProduct = priceOfProduct;
		}
		
	}

