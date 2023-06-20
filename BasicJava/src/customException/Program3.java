package customException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program3 {
	static void readData() throws FileNotFoundException
	{
		FileReader f=new FileReader("abcd.txt");
	}

	public static void main(String[] args) {
		try {
			readData();
		}
		
		catch (Exception e) {
			System.out.println("Handled files not present");
		}
		
	}
}
