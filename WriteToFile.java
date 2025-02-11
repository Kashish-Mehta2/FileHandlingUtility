package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String []args) {
		try {
			FileWriter myWriter = new FileWriter("D:\\FileHandling\\Filef1.txt");
			myWriter.write("My name is Kashish Mehta. I am from Sirsa, Haryana.");
			myWriter.close();
			System.out.println("Successfully wrote the file");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
