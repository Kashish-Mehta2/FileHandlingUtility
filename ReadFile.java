package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("D:\\FileHandling\\Filef1.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
